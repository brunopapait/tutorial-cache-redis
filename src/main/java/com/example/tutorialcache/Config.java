package com.example.tutorialcache;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

  @Bean
  public ApplicationRunner runner(ProductService productService) {
    return args -> {
      System.out.println("\n\n\n\n\n\n\n");
      System.out.println("Id. 1: " + productService.getById(1L));
      System.out.println("Id. 2: " + productService.getById(2L));
      System.out.println("Id. 1: " + productService.getById(1L));
      System.out.println("Id. 1: " + productService.getById(1L));
      System.out.println("Id. 1: " + productService.getById(1L));
    };
  }
}
