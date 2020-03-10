package com.epam.vvmikhalevich.flightservice;

import lombok.Getter;
import lombok.Setter;

public class Flihgt {

    @Getter
    @Setter
    private Integer id;
    private String flightFrom;
    private String flightTo;
    private Integer seat;
    private boolean isReserve;

   
}
