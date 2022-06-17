package ac.za.mycput.factory.employeeAddress;

import ac.za.mycput.domain.address.Address;
import ac.za.mycput.domain.employeeAddress.EmployeeAddress;
import ac.za.mycput.helper.StringHelper;
/*
 * Student Name: Damian du Toit
 * Student Number: 219200203
 * EmployeeAddressFactory.java
 * Date : 13th June 2022
 */
public class EmployeeAddressFactory {
    public static EmployeeAddress build(String staffId, Address address){

        StringHelper.checkStringParam("name", staffId);

        if (address == null || address.equals("null")) {
            System.out.println("Invalid address entered. This value cannot be empty.");
            return null;
        }

        return new EmployeeAddress.Builder()
                .setStaffId(staffId)
                .setAddress(address)
                .build();
    }
}
