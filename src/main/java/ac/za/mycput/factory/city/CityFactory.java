package ac.za.mycput.factory.city;

import ac.za.mycput.domain.city.City;
import ac.za.mycput.domain.country.Country;
import ac.za.mycput.helper.StringHelper;

/*
 * Student Name: Damian du Toit
 * Student Number: 219200203
 * CityFactory.java
 * Date : 13th June 2022
 */

public class CityFactory {
    public static City build(String id, String cityName, Country country){
        //if (id == null || id.isBlank() || id.isEmpty()) {
          //  throw new IllegalArgumentException("The ID cannot be empty");
      //  }

       // if (cityName == null || cityName.isBlank() || cityName.isEmpty()) {
        //    throw new IllegalArgumentException("The name cannot be empty");
        //}

        StringHelper.checkStringParam("name", cityName);
        StringHelper.checkStringParam("123", id);

        return new City.Builder()
                .setId(id)
                .setName(cityName)
                .setCountry(country)
                .build();
    }
}
