package org.example;

import java.time.LocalDate;

public class ProductFactory {
  public static RealProduct createRealProduct(String name, double price, int size, int weight) {
    return new RealProduct(name, price, size, weight);
  }

  public static VirtualProduct createVirtualProduct(
      String name, double price, String code, LocalDate localDate) {
    return new VirtualProduct(name, price, code, localDate);
  }
}
