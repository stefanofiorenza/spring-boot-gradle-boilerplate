package com.example.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author https://github.com/ibipn
 *
 */
@Service
public class AppService {

  private static final Logger LOGGER = LoggerFactory.getLogger(AppService.class);

  public String sayHello() {
    LOGGER.trace("Enter: sayHello()");
    return "Hello World 2!";
  }

}
