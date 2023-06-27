package org.example;

import java.util.List;

public class Order {
  private User user;
  private List<Product> products;

  private Order(User user, List<Product> products) {
    this.user = user;
    this.products = products;
  }

  public static Order createOrder(User user, List<Product> products) {
    return new Order(user, products);
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  @Override
  public String toString() {
    return "Order{" +
            "user=" + user +
            ", products=" + products +
            '}';
  }
}
