package com.example.demo.domain.drinks;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import com.example.demo.core.exception.DrinkAlreadyExistsException;
import com.example.demo.core.exception.DrinkNotFoundException;
import com.example.demo.core.exception.ErrorResponse;
import com.example.demo.domain.drinks.dto.DrinkDTO;
import com.example.demo.domain.drinks.dto.DrinkMapper;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Log4j2
@Validated
@RestController
@RequestMapping("/drink")
public class DrinkController {

    private final DrinkService drinkService;
    private final DrinkMapper drinkMapper;

    @Autowired
    public DrinkController(DrinkService drinkService, DrinkMapper drinkMapper) {
        this.drinkService = drinkService;
        this.drinkMapper = drinkMapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<DrinkDTO> retrieveDrink(@PathVariable String id) {
        try {
            UUID uuid = UUID.fromString(id);
            Drink drink = drinkService.findById(uuid);
            log.info("Request successful: GET '/drink/" + id + "'");
            return ResponseEntity.ok(drinkMapper.toDTO(drink));
        } catch (DrinkNotFoundException | NoSuchElementException e) {
            log.error("Request error: GET '/drink/" + id + "' " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            log.error("Request error: GET '/drink/" + id + "' " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping({"", "/"})
    public ResponseEntity<List<DrinkDTO>> retrieveAll() {
        try {
            List<Drink> drinks = drinkService.findAll();
            log.info("Request successful: GET '/drink'");
            return new ResponseEntity<>(drinkMapper.toDTOs(drinks), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Request error: GET '/drink' " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/")
    public ResponseEntity<DrinkDTO> save(@Valid @RequestBody DrinkDTO drinkDTO) {
        try {
            Drink drink = drinkService.save(drinkMapper.fromDTO(drinkDTO));
            log.info("Request successful: POST '/'");
            return new ResponseEntity<>(drinkMapper.toDTO(drink), HttpStatus.CREATED);
        } catch (DrinkAlreadyExistsException e) {
            log.error("Request error: POST '/' - " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        } catch (Exception e) {
            log.error("Request error: POST '/' - " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<DrinkDTO> updateById(@PathVariable UUID id, @Valid @RequestBody DrinkDTO drinkDTO) {
        try {
            Drink drink = drinkService.updateById(id, drinkMapper.fromDTO(drinkDTO));
            log.info("Request successful: PUT '/drink/" + id + "'");
            return new ResponseEntity<>(drinkMapper.toDTO(drink), HttpStatus.OK);
        } catch (DrinkNotFoundException | NoSuchElementException e) {
            log.error("Request error: PUT '/drink/" + id + "' - " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            log.error("Request error: PUT '/drink/" + id + "' - " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable UUID id) {
        try {
            drinkService.deleteById(id);
            log.info("Request successful: DELETE '/drink/" + id + "'");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (DrinkNotFoundException | NoSuchElementException e) {
            log.error("Request error: DELETE '/drink/" + id + "' - " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            log.error("Request error: DELETE '/drink/" + id + "' - " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ExceptionHandler(DrinkNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorResponse> handleDrinkNotFoundException(DrinkNotFoundException e) {
        log.error("Exception handled: DrinkNotFoundException - " + e.getMessage());
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND.value(), e.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DrinkAlreadyExistsException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<ErrorResponse> handleDrinkAlreadyExistsException(DrinkAlreadyExistsException e) {
        log.error("Exception handled: DrinkAlreadyExistsException - " + e.getMessage());
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_MODIFIED.value(), e.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }
}
