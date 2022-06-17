package ac.za.mycput.factory.employee;

import ac.za.mycput.domain.employee.Employee;
import ac.za.mycput.domain.name.Name;
import ac.za.mycput.domain.student.Student;
import ac.za.mycput.factory.student.StudentFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    void createEmployee() {
         Name name= new Name("marco","mulonday","tshimanga");
        Employee student = EmployeeFactory.createEmployee("44","thh",name);
        System.out.println(student.toString());
        assertNotNull(student);
    }
}