package com.app.models;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

public class Sale {
    private long now = System.currentTimeMillis();
    @Getter
    @Setter
    private int productCode;
    @Getter
    @Setter
    private int quantity;
    @Getter
    @Setter
    private int stock;
    @Getter
    @Setter
    private String reason;
    private Date date;
    private Time time;
    public Date getDate() {
        return new Date(now);
    }

    public Time getTime() {
        return new Time(now);
    }
}
