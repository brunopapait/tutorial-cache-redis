package com.example.tutorialcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TutorialCacheApplication {

  public static void main(String[] args) {
    SpringApplication.run(TutorialCacheApplication.class, args);
  }

}
