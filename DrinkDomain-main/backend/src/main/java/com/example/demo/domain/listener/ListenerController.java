
package com.example.demo.domain.listener;

import com.example.demo.Logger.LogFile;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Log4j2
@RestController
@RequestMapping("/call/")
public class ListenerController {
    @Autowired
    private ListenerService listenerService;

    /**
     * findAll:    /call/${key}/
     * findById:   /call/${key}/${id}
     * create:     /call/${key}/
     * updateById: /call/${key}/${id}
     * deleteById: /call/${key}/${id}
     * <p>
     * A key cannot access another key
     * @returns a string representation of the Object
     */

    @RequestMapping("**")
    public ResponseEntity<String> apiCall(
            @RequestBody(required = false) Map<String, Object> payload,
            @RequestParam Map<String, Object> params,
            @RequestHeader Map<String, String> headers,
            HttpServletRequest request
    ) {
        try {
            // Create a RequestObject instance with payload, params, headers, and request
            RequestObject requestObject = new RequestObject(payload, params, headers, request);

            // Log the RequestObject details
            LogFile.logRequestObject(requestObject);
            log.info("Request received: {} {} with params: {}, headers: {}, payload: {}",
                    request.getMethod(), request.getRequestURI(), params, headers, payload);

            // Process the API call through the listenerService and return the response
            return ResponseEntity.ok(listenerService.apiCall(requestObject));
        } catch (Exception e) {
            // Log any errors that occur during request processing
            log.error("Error processing request: {} {} - {}",
                    request.getMethod(), request.getRequestURI(), e.getMessage());
            return ResponseEntity.status(500).body("Internal Server Error");
        }
    }

}

