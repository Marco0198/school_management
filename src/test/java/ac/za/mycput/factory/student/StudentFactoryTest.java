package ac.za.mycput.factory.student;

import ac.za.mycput.domain.name.Name;
import ac.za.mycput.domain.student.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {

    @Test
    void createStudent() {
        Name name= new Name("marco","mulonday","tshimanga");
        Student student = StudentFactory.createStudent("888","788",name);
            System.out.println(student.toString());
            assertNotNull(student);
        }
    }
