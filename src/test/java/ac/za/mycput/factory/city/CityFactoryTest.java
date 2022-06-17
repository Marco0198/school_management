package ac.za.mycput.factory.city;
import ac.za.mycput.domain.city.City;
import ac.za.mycput.domain.country.Country;
import ac.za.mycput.factory.country.CountryFactory;
import org.junit.jupiter.api.Test;

/*
 * Student Name: Damian du Toit
 * Student Number: 219200203
 * CityFactoryTest.java
 * Date : 13th June 2022
 */

public class CityFactoryTest {

    // Test should fail
    @Test
    public void CityIDTestShouldFail()
    {
        Country country = CountryFactory.build("ZAR", "South Africa");
        City city = CityFactory.build("", "Johannesburg",country);
    }

    // Test should fail
    @Test
    public void CityNameTestShouldFail()
    {
        Country country = CountryFactory.build("ZAR", "South Africa");
        City city = CityFactory.build("1234", "",country);
    }

    // Test should pass
    @Test
    public void CityTestShouldPass()
    { Country country = CountryFactory.build("ZAR", "South Africa");
        City city = CityFactory.build("1234", "Cape Town",country);
    }
}
