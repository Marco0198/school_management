package ac.za.mycput.factory.employee;

import ac.za.mycput.domain.employee.Employee;
import ac.za.mycput.helper.StringHelper;

public class EmployeeFactory {
    public static Employee createEmployee(String staffId, String email){

        StringHelper.checkStringParam("staffId",staffId);
        StringHelper.checkStringParam("email",email);

        return new Employee.Builder().setStaffId(staffId).setEmail(email).build();
    }
}
