package com.codecademy.goldmedal.repository;

import com.codecademy.goldmedal.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, Long> {
    //THE PARAMETERS ARE FOR FILTERING!

    //IN THIS CASE, WE ARE FILTERING OUT EVERY COUNTRY BESIDES THE COUNTRY WE ARE LOOKING FOR BY NAME.
    Optional<Country> findByName(String countryName);

    //IN THIS CASE, WE ARE NOT FILTERING, BUT RATHER ARRANGING THE COUNTRIES BY ALPHABETICAL ORDER, NO FILTERING!
    List<Country> findAllByOrderByNameAsc();
    List<Country> findAllByOrderByNameDesc();
    List<Country> findAllByOrderByGdpAsc();
    List<Country> findAllByOrderByGdpDesc();
    List<Country> findAllByOrderByPopulationAsc();
    List<Country> findAllByOrderByPopulationDesc();

    //FROM NOW ON, USE FIND/GET (FILTER) AND ORDER (NO FILTER)

    //cant do findAllOrderBy, must do findAllByOrderBy
}
