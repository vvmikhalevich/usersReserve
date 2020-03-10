package com.epam.vvmikhalevich.carservice;

import java.util.List;

public interface CarService {

    List<Car> list();

    void reserve(Integer id);

    void cancel(Integer id);

    void commit(Integer id);


}
