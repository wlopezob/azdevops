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

/**
 * Clase principal RestHola.<br/>
 * <b>Class HelloController</b>.
 *
 * @author Wlop
 * @Version 1.0
 */
@RestController
public class HelloController {
  /**
   * Hola.
   *
   * @return dato.
   */
  @GetMapping("/hola")
  @Operation(
      description = "retorna un hola",
      method = "GET",
      tags = {"persona"},
      summary = "retorna un hola"
  )
  @ApiResponses({
      @ApiResponse(
          responseCode = "200", description = "retorna un hola",
          content = {
              @Content(
                  mediaType = MediaType.APPLICATION_JSON_VALUE,
                  array = @ArraySchema(schema = @Schema(implementation = String.class))
              )
          }
      ),
  })
  public String hola() {
    return "hola03"
        .toString()
        .toString();
  }

  public String demo() {
    return " demo";
  }

  public String demo1() {
    return " demo1";
  }

  public String demo2() {
    return " demo2";
  }

  public String demo3() {
    return " demo3";
  }
}
