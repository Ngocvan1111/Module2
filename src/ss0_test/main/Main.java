package ss0_test.main;

import ss0_test.doituong.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ngoc",12,"C12");
        Student student1 = new Student("Ngoc",12,"C12");
        Student student2 = new Student("Ngoc",12,"C12");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        for(int i = 0; i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }
    }
}
