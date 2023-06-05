package com.example.tutorialcache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {
  Map<Long, Product> products = new HashMap<>() {
    {
      put(1L, new Product(1L, "Product 1", "Description 1"));
      put(2L, new Product(2L, "Product 2", "Description 2"));
      put(3L, new Product(3L, "Product 3", "Description 3"));
      put(4L, new Product(4L, "Product 4", "Description 4"));
      put(5L, new Product(5L, "Product 5", "Description 5"));
    }
  };

  @Cacheable("products")
  public Product getById(Long id) {
    System.out.println("Buscando produto com id: " + id);
    this.delay();
    return products.get(id);
  }

  private void delay() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
 }
