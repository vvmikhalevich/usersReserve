package com.epam.vvmikhalevich.carservice;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Car {

    @Getter
    @Setter
    private Integer id;
    private String model;
    private String number;
    private boolean isReserve;

   
}
