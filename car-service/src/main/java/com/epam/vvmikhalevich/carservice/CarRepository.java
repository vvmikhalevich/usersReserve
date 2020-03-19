package com.epam.vvmikhalevich.carservice;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "car", path = "car")
public interface CarRepository extends PagingAndSortingRepository<Car, Long> {

    List<Car> findByModel(@Param("model") String model);

}

