package com.epam.vvmikhalevich.flightservice;

import java.util.List;

public interface FlightService {

    List<Flihgt> list();

    void reserve(Integer id);

    void cancel(Integer id);

    void commit(Integer id);


}
