package com.app.init.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hola")
    @Operation(
            description = "retorna un hola",
            method = "GET",
            tags = {"persona"},
            summary = "retorna un hola"
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200", description = "retorna un hola"
            ),
    })
    public String hola(){
        return "hola03";
    }
}
