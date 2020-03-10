package com.epam.vvmikhalevich.hotelservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/car")
public class HotelController {

    @Autowired
    private HotelService carService;

    @GetMapping("/")
    public List<Hotel> list(){

        List carList = null;


        return carList;
    }


}
