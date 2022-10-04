package furama_resort.models;

import java.time.LocalDate;

public abstract class Person {
    private String code;
    private String name;
    private LocalDate birthday;
    private String gender;
    private int identityCard;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String code, String name, LocalDate birthday, String gender, int identityCard, int phoneNumber, String email) {
        this.code = code;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCard=" + identityCard +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s",this.code,this.name,this.birthday,this.gender,this.identityCard,this.phoneNumber,this.email);
    }
}
