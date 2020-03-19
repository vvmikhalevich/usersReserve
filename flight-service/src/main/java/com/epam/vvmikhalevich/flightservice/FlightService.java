package com.epam.vvmikhalevich.flightservice;

import java.util.List;

public interface FlightService {

    List<Flight> list();

    void reserve(Integer id);

    void cancel(Integer id);

    void commit(Integer id);


}
