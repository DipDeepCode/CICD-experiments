package ru.ddc.exp_01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ddc.exp_01.dto.Response;

@RestController
public class AbcController {

    /**
     * Method for test rest-api.
     *
     * @return the Response.
     */
    @GetMapping
    public ResponseEntity<Response> hello() {
        return ResponseEntity.ok(new Response(1, "Hello World"));
    }
}
