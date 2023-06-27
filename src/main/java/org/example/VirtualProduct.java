package org.example;

import java.time.LocalDate;

public class VirtualProduct extends Product {
  private String code;
  private LocalDate localDate;

  public VirtualProduct(String name, double price, String code, LocalDate localDate) {
    super(name, price);
    this.code = code;
    this.localDate = localDate;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public LocalDate getLocalDate() {
    return localDate;
  }

  public void setLocalDate(LocalDate localDate) {
    this.localDate = localDate;
  }
}
