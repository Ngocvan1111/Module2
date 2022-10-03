package ss17_io_binary_file_amp.practive.read_and_write_list_student_to_binary_file.service;

import ss17_io_binary_file_amp.practive.read_and_write_list_student_to_binary_file.variable.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeTofile(String path, List<Student> students){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeTofile("D:\\01_codegym\\module2\\src\\ss17_io_binary_file_amp\\practive\\read_and_write_list_student_to_binary_file\\data\\dest.txt",students);
        List<Student> studentsDataFromFile = readDataFromFile("D:\\01_codegym\\module2\\src\\ss17_io_binary_file_amp\\practive\\read_and_write_list_student_to_binary_file\\data\\dest.txt");
        for(Student student:studentsDataFromFile){
            System.out.println(student);
        }

    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}
