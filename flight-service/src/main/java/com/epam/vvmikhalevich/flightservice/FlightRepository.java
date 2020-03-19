package com.epam.vvmikhalevich.flightservice;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "flight", path = "flight")
public interface FlightRepository extends PagingAndSortingRepository<Flight, Long> {

    List<Flight> findByFlightFrom(@Param("flightFrom") String flightFrom);

}