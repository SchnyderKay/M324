
package com.example.demo.domain.storage;

import com.example.demo.core.exception.custom.StorageFileNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.UUID;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Validated
@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private StorageService storageService;

    @GetMapping("/{fileId}")
    public ResponseEntity<Resource> loadFileAsResource(@PathVariable UUID fileId) {
        try {
            log.info("Request received: GET '/storage/{}'", fileId);
            ByteArrayResource byteArrayResource = storageService.getFileAsResource(fileId);
            log.info("File retrieved successfully: {}", fileId);

            return ResponseEntity.ok()
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .contentLength(byteArrayResource.contentLength())
                    .body(byteArrayResource);
        } catch (StorageFileNotFoundException e) {
            log.error("File not found: {}", fileId);
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            log.error("Error loading file: {}", fileId, e);
            return ResponseEntity.status(500).build();
        }
    }

    @PostMapping({"", "/"})
    public ResponseEntity<Storage> handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
        try {
            log.info("Request received: POST '/storage' with file: {}", file.getOriginalFilename());
            Storage storedFile = storageService.store(file);
            log.info("File uploaded successfully: {}", storedFile.getId());

            return ResponseEntity.ok(storedFile);
        } catch (Exception e) {
            log.error("Error uploading file: {}", file.getOriginalFilename(), e);
            return ResponseEntity.status(500).build();
        }
    }

    @DeleteMapping("/{fileId}")
    public ResponseEntity<Void> deleteFile(@PathVariable UUID fileId) {
        try {
            log.info("Request received: DELETE '/storage/{}'", fileId);
            storageService.deleteFile(fileId);
            log.info("File deleted successfully: {}", fileId);

            return ResponseEntity.ok().build();
        } catch (StorageFileNotFoundException e) {
            log.error("File not found for deletion: {}", fileId);
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            log.error("Error deleting file: {}", fileId, e);
            return ResponseEntity.status(500).build();
        }
    }

    @ExceptionHandler(StorageFileNotFoundException.class)
    public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
        log.error("StorageFileNotFoundException: {}", exc.getMessage());
        return ResponseEntity.notFound().build();
    }
}




