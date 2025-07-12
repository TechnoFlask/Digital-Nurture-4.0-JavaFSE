package com.cognizant.spring_learn.Ex1_2;

public class Country {
     private String code;
     private String name;

     public void setCode(String code) {
          this.code = code;
     }

     public void setName(String name) {
          this.name = name;
     }

     @Override
     public String toString() {
          return "Country [code=" + code + ", name=" + name + "]";
     }
}
