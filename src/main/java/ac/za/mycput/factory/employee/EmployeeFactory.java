package ac.za.mycput.factory.employee;

import ac.za.mycput.domain.employee.Employee;
import ac.za.mycput.domain.name.Name;
import ac.za.mycput.helper.StringHelper;

public class EmployeeFactory {
    public static Employee createEmployee(String staffId, String email, Name name){

        StringHelper.checkStringParam("staffId",staffId);
        StringHelper.checkStringParam("email",email);

        return new Employee.Builder().setStaffId(staffId).setEmail(email).setName(name).build();
    }
}
