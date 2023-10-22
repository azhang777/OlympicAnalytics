package com.codecademy.goldmedal.repository;

import com.codecademy.goldmedal.model.Country;
import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Long> {
    List<GoldMedal> findByCountryOrderByYearAsc(String countryName);
    List<GoldMedal> findByCountryOrderByYearDesc(String countryName);
    List<GoldMedal> findByCountryOrderBySeasonAsc(String countryName);
    List<GoldMedal> findByCountryOrderBySeasonDesc(String countryName);
    List<GoldMedal> findByCountryOrderByCityAsc(String countryName);
    List<GoldMedal> findByCountryOrderByCityDesc(String countryName);
    List<GoldMedal> findByCountryOrderByNameAsc(String countryName);
    List<GoldMedal> findByCountryOrderByNameDesc(String countryName);
    List<GoldMedal> findByCountryOrderByEventAsc(String countryName);
    List<GoldMedal> findByCountryOrderByEventDesc(String countryName);
    List<GoldMedal> findByCountryAndSeasonOrderByYearAsc(String countryName, String season);
    int countByCountry(String countryName);
    int countBySeason(String season);
    int countByCountryAndGender(String country,String gender);
    //cant change this count to findCount, either a Spring problem or something was built in a way (on the front probably) that has conflicts with the name change.
}
