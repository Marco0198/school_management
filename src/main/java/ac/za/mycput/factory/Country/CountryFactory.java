package ac.za.cput.factory.Country;
/*
 * Student Name : Devon Sherwyn May
 * Student Number : 219168296
 * Date : 18th June 2022
 * CountryFactory.java
 * */


import ac.za.cput.domain.Country.Country;

public class CountryFactory {
    public static Country build(String id, String name)
    {

        if (id == null|| id.isEmpty())
            throw new IllegalArgumentException("id cannot be empty");

        if (name == null|| name.isEmpty())
            throw new IllegalArgumentException("name cannot be empty");

        return new Country.Builder().id(id).name(name).build();
    }
}
