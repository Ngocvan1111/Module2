package ss5_access_modifier_and_static_method.practive;

public class TestStaticMethod {

    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(11,"vanw ngoc");
        Student s2 = new Student(12," van van");
        Student s3 = new Student(13,"ngoc");
        s1.display();
        s2.display();
        s3.display();
    }
}
