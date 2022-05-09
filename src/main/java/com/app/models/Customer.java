package com.app.models;

import lombok.Getter;
import lombok.Setter;

public class Customer extends PersonalData{
   @Getter @Setter
   private String name;
   @Getter @Setter
   private int id;
}
