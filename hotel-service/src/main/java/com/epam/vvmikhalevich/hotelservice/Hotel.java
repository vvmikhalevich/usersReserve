package com.epam.vvmikhalevich.hotelservice;

import lombok.Getter;
import lombok.Setter;

public class Hotel {

    @Getter
    @Setter
    private Integer id;
    private String name;
    private String adress;
    private Integer room;
    private boolean isReserve;

   
}
