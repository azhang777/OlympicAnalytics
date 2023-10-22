package com.codecademy.goldmedal.repository;

import com.codecademy.goldmedal.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, Long> {
    //THE PARAMETERS ARE FOR FILTERING!

    //IN THIS CASE, WE ARE FILTERING OUT EVERY COUNTRY BESIDES THE COUNTRY WE ARE LOOKING FOR BY NAME.
    Optional<Country> getByName(String countryName);

    //IN THIS CASE, WE ARE NOT FILTERING, BUT RATHER ARRANGING THE COUNTRIES BY ALPHABETICAL ORDER, NO FILTERING!
    List<Country> getAllByOrderByNameAsc();
    List<Country> getAllByOrderByNameDesc();
    List<Country> getAllByOrderByGdpAsc();
    List<Country> getAllByOrderByGdpDesc();
    List<Country> getAllByOrderByPopulationAsc();
    List<Country> getAllByOrderByPopulationDesc();

    //FROM NOW ON, USE FIND/GET (FILTER) AND ORDER (NO FILTER)

}
