package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.app.service.AppService;

/**
 * @author https://github.com/ibipn
 *
 */
@RestController("/api")
public class AppController {

  @Autowired
  private AppService appService;

  @GetMapping
  public String sayHello() {
    return appService.sayHello();
  }

}
