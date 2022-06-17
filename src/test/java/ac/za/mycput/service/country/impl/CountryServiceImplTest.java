package ac.za.cput.service.Country.Impl;

import ac.za.cput.App;
import ac.za.cput.domain.Country.Country;
import ac.za.cput.factory.Country.CountryFactory;
import ac.za.cput.service.Country.CountryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes= SchoolManagementApplication.class)
class CountryServiceImplTest
{
    private Country country,saved;
    @Autowired
    private CountryService service;

    @BeforeEach
    void setUp()
    {
        this.country= CountryFactory.build("ZA","South Africa");
        this.saved=service.save(this.country);
    }

    @Test
    void a_save()
    {
        this.country=CountryFactory.build("Au","Australia");
        this.saved=service.save(this.country);
        System.out.println(saved);
        assertNotNull(saved);
    }
    @Test
    void b_read()
    {
        Optional<Country> read = this.service.read(country.getId());
        System.out.println(read);
    }

    @Test
    void c_delete()
    {
        this.service.delete(country);
    }
    @Test
    List<Country> d_getAll()
    {
        return this.service.findAll();
    }
}