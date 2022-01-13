package com.app.init;

import com.app.init.controller.HelloController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class InitApplicationTests {

  @Autowired
  HelloController helloController;

  @Test
  void contextLoads() {
  }

  @Test
  void holaTest() {
    Assertions.assertNull(helloController.hola());
  }

}
