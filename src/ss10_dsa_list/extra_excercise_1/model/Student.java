package ss10_dsa_list.extra_excercise_1.model;

public class Student extends Person {
    private String className;
    private double score;
    public Student(){

    }

    public Student(String className, double score) {
        this.className = className;
        this.score = score;
    }

    public Student(String code, String name, String birthDay, String gender, String className, double score) {
        super(code, name, birthDay, gender);
        this.className = className;
        this.score = score;
    }

    public String getClassName() {
        return className;
    }



    public void setClassName(String className) {
        this.className = className;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "///***Họ tên: "+super.getName()+", Code: " + super.getCode()+", Ngày sinh: "+super.getBirthDay()+", giới tính: "+ getGender()+", lớp: "+getClassName()+", điểm số: "+getScore();
    }
}
