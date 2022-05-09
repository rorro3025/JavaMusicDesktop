package com.app.models;

import lombok.Getter;
import lombok.Setter;

public class PersonalData {
    @Getter
    @Setter
    private String address;
    @Getter
    @Setter
    private String city;
    @Getter
    @Setter
    private String state;
    @Getter
    @Setter
    private int zip;
    @Getter
    @Setter
    private String phone;
}
