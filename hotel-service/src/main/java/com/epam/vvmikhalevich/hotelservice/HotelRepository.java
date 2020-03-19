package com.epam.vvmikhalevich.hotelservice;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "hotel", path = "hotel")
public interface HotelRepository extends PagingAndSortingRepository<Hotel, Long> {

    List<Hotel> findByName(@Param("name") String name);

}