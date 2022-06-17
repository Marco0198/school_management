package ac.za.mycput.domain.address;

/*
Klaus Traubner
218009496
13 June 2022
AddressDomain.java
ADP372S
 */

import ac.za.mycput.domain.City.City;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
public class AddressDomain implements Serializable {
    @Id
    @NotNull
    public String unitNumber;
    @NotNull
    public String complexName, streetNumber, streetName;
    @NotNull
    public int postalCode;

    protected AddressDomain() {}

@Embedded
public City city;

    private AddressDomain(Builder builder) {
        this.unitNumber = builder.unitNumber;
        this.complexName = builder.complexName;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.postalCode = builder.postalCode;
        this.city = builder.city;

    }

    //public AddressDomain() {

    //}

    public static class Builder {
        public String unitNumber;
        public String complexName;
        public String streetNumber;
        public String streetName;
        public int postalCode;

        public City city;

        public Builder setUnitNumber(String unitNumber) {
            this.unitNumber = unitNumber;
            return this;
        }

        public Builder setComplexName(String complexName) {
            this.complexName = complexName;
            return this;
        }

        public Builder setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setPostalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;
        }

          public Builder setCity (City city) {
          this.city = city;
          return this;
          }


        public Builder copy(AddressDomain addressDomain) {
            this.unitNumber = addressDomain.unitNumber;
            this.streetNumber = addressDomain.streetNumber;
            this.complexName = addressDomain.complexName;
            this.postalCode = addressDomain.postalCode;
            this.streetName = addressDomain.streetName;
            this.city = addressDomain.city;
            return this;
        }

        public AddressDomain build() {
            return new AddressDomain(this);
        }

    }
}
