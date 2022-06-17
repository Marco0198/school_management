package ac.za.cput.factory.Country;

import ac.za.cput.domain.Country.Country;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountryFactoryTest
{
    @Test
    public void CountryTestPass()
    {
        Country country = CountryFactory.build("ZAR", "South Africa");
        System.out.println(country);
        assertNotNull(country);
    }

    @Test
    public void CountryIdTestFail()
    {
        Country country = CountryFactory.build("", "South Africa");
        System.out.println(country);
        assertNotNull(country);
    }

    @Test
    public void CountryNameTestFail() {
        Country country = CountryFactory.build("ZAR", "");
        System.out.println(country);
        assertNotNull(country);
    }
}