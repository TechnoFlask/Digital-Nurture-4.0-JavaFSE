package com.cognizant.spring_learn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

  @Id
  @Column(length = 3)
  private String code;

  @Column(nullable = false)
  private String name;

  // Constructors
  public Country() {}

  public Country(String code, String name) {
    this.code = code;
    this.name = name;
  }

  // Getters & Setters
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
