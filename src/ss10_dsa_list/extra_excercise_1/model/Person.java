package ss10_dsa_list.extra_excercise_1.model;

public abstract class Person {
    private String code;
    private String name;
    private String birthDay;
    private String gender;

    public Person() {
    }

    public Person(String code, String name, String birthDay, String gender) {
        this.code = code;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
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
    public String getLastName(){
        String[]arr = getName().split(" ");
        return arr[arr.length-1];
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", gender=" + gender +
                '}';
    }
}
