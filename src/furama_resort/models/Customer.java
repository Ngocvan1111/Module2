package furama_resort.models;

import java.time.LocalDate;

public class Customer extends Person {
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String code, String name, LocalDate birthday, String gender, int identityCard, int phoneNumber, String email, String customerType, String address) {
        super(code, name, birthday, gender, identityCard, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }


    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getInfo() {
        return String.format("%s,%s,%s",super.getInfo(), this.customerType, this.address);
    }
}
