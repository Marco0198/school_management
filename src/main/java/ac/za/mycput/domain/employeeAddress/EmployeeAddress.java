package ac.za.mycput.domain.employeeAddress;

import com.sun.istack.NotNull;
import org.apache.tomcat.jni.Address;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class EmployeeAddress implements Serializable {
    @NotNull
    public String staffId;
    @NotNull
    @Embedded
    public Address address;

    protected EmployeeAddress(){}

    private EmployeeAddress(Builder builder) {
        this.staffId = builder.staffId;
        this.address = builder.address;
    }

    public static class Builder {
        public String staffId;
        public Address address;

        public Builder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder copy(EmployeeAddress employeeAddress) {
            this.staffId = employeeAddress.staffId;
            this.address = employeeAddress.address;
            return this;
        }

        public EmployeeAddress build() {
            return new EmployeeAddress(this);
        }
    }
}
