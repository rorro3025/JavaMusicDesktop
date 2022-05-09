package com.app.models;

import lombok.Getter;
import lombok.Setter;

public class Product {
    @Setter
    @Getter
    private int id;
    @Setter
    @Getter
    private String artist;
    @Setter
    @Getter
    private String title;
    @Setter
    @Getter
    private float cost;
    @Setter
    @Getter
    private float sale_price;
}
