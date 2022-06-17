package ac.za.cput.repository.Country;

import ac.za.cput.domain.Country.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

       /* Student Name : Devon Sherwyn May
        * Student Number : 219168296
        * Date : 18th June 2022
        * CountryRepository.java
        */

@Repository
public interface CountryRepository extends JpaRepository<Country,String> {}
