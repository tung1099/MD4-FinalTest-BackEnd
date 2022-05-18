package com.codegym.city.service.city;

import com.codegym.city.model.City;
import com.codegym.city.service.IGeneralService;

public interface ICityService extends IGeneralService<City> {
    Iterable<City> findCityByName(String name);
}
