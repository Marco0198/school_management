package ac.za.cput.service.Country;

import ac.za.cput.domain.Country.Country;
import ac.za.cput.service.IService;


import java.util.List;

        /* Student Name : Devon Sherwyn May
        * Student Number : 219168296
        * Date : 18th June 2022
        * CountryService.java
        * */
public interface CountryService extends IService<Country, String>
{
    List<Country> findAll();
}
