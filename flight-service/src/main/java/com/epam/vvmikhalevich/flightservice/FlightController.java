package com.epam.vvmikhalevich.flightservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/flight")
public class FlightController {

    @Autowired
    private FlightService carService;

    @GetMapping("/")
    public List<Flight> list(){

        List carList = null;


        return carList;
    }


}
