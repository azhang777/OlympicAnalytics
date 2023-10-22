package com.codecademy.goldmedal.repository;

import com.codecademy.goldmedal.model.Country;
import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Long> {
    List<GoldMedal> getByCountryOrderByYearAsc(String countryName);
    List<GoldMedal> getByCountryOrderByYearDesc(String countryName);
    List<GoldMedal> getByCountryOrderBySeasonAsc(String countryName);
    List<GoldMedal> getByCountryOrderBySeasonDesc(String countryName);
    List<GoldMedal> getByCountryOrderByCityAsc(String countryName);
    List<GoldMedal> getByCountryOrderByCityDesc(String countryName);
    List<GoldMedal> getByCountryOrderByNameAsc(String countryName);
    List<GoldMedal> getByCountryOrderByNameDesc(String countryName);
    List<GoldMedal> getByCountryOrderByEventAsc(String countryName);
    List<GoldMedal> getByCountryOrderByEventDesc(String countryName);
    List<GoldMedal> getByCountryAndSeasonOrderByYearAsc(String countryName, String season);
    int countByCountry(String countryName);
    int countBySeason(String season);
    int countByCountryAndGender(String country,String gender);
}
