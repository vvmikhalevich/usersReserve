package com.epam.vvmikhalevich.flightservice;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {

    @Getter
    @Setter

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String flightFrom;
    private String flightTo;
    private Integer seat;
    private boolean isReserve;

   
}
