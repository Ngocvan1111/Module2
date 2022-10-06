package furama_resort.models;

import java.time.LocalDate;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String code, String name, LocalDate birthday, String gender, int identityCard, int phoneNumber, String email, String level, String position, double salary) {
        super(code, name, birthday, gender, identityCard, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s",super.getInfo(),this.level,this.position,this.salary);
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s",super.getInfo(),this.level,this.position,this.salary);
    }
}
