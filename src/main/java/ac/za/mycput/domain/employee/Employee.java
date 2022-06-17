package ac.za.mycput.domain.employee;
import ac.za.mycput.domain.name.Name;
import ac.za.mycput.domain.student.Student;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;

public class Employee {
    @Id
    @NotNull
    private String staffId;
    @NotNull private String  email;
    @Embedded
    private Name name;
    public Name getName() {return name;
    }

    public Employee(Builder builder) {
        this.staffId= builder.staffId;
        this.email= builder.email;
    }
    public Employee() {}

    public String getStaffId() {return staffId;}
    public String getStudentEmail() {return email;}


    public static class Builder{
        @Id
        @Column(name="student_id")
        private String staffId;
        @Column(name="email")

        private String  email;

        public Builder setStaffId(String staffId){
            this.staffId= staffId;
            return this;
        }


        public Builder setEmail(String email){
            this.email= email;
            return this;
        }

        public Builder copy(Student student){

            this.staffId=staffId;
            this.email=email;

            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }
}








