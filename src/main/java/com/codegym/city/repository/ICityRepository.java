package com.codegym.city.repository;

import com.codegym.city.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository extends JpaRepository<City, Long> {
    Iterable<City> findCityByName(String name);
}
