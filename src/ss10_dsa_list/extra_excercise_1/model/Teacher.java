package ss10_dsa_list.extra_excercise_1.model;

public class Teacher extends Person {
    private String major;
    public Teacher(){

    }

    public Teacher(String major) {
        this.major = major;
    }

    public Teacher(String code, String name, String birthDay, String gender, String major) {
        super(code, name, birthDay, gender);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "///***Họ tên: "+super.getName()+", Code: " + super.getCode()+", Ngày sinh: "+super.getBirthDay()+", giới tính: "+ getGender()+", Chuyên môn: "+getMajor();
    }
    public String getInfor(){
        return String.format("%s,%s,%s,%s,%s",super.getCode(),super.getName(),getBirthDay(),getGender(),getMajor());
    }
}
