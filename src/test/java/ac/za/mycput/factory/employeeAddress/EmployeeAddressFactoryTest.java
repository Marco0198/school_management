package ac.za.mycput.factory.employeeAddress;

import ac.za.mycput.domain.address.Address;
import ac.za.mycput.domain.employeeAddress.EmployeeAddress;
import org.junit.jupiter.api.Test;
/*
 * Student Name: Damian du Toit
 * Student Number: 219200203
 * EmployeeAddressFactoryTest.java
 * Date : 13th June 2022
 */

class EmployeeAddressFactoryTest {

    // Test should fail
    @Test
    public void EmployeeAddressStaffIDTestShouldFail()
    {
        Address address = new Address();
        EmployeeAddress employeeAddress = EmployeeAddressFactory.build("", address);
    }

    // Test should fail
    @Test
    public void EmployeeAddress_AddressTestShouldFail()
    {
        Address address = new Address();
        EmployeeAddress employeeAddress = EmployeeAddressFactory.build("1234", null);
    }

    // Test should pass
    @Test
    public void EmployeeAddressTestShouldPass()
    {   Address address = new Address();
        EmployeeAddress employeeAddress = EmployeeAddressFactory.build("1234", address);
    }

}