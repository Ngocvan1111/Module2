package ss5_access_modifier_and_static_method.excercise.develop_class_only_write_in_java;

public class Student {
    private String name = "john";
    private String classes = "C02";

    Student() {

    }

    protected void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

}
