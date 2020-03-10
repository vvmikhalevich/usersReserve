package com.epam.vvmikhalevich.hotelservice;

import java.util.List;

public interface HotelService {

    List<Hotel> list();

    void reserve(Integer id);

    void cancel(Integer id);

    void commit(Integer id);


}
