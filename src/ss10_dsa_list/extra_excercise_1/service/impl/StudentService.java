package ss10_dsa_list.extra_excercise_1.service.impl;

import ss10_dsa_list.extra_excercise_1.model.Student;
import ss10_dsa_list.extra_excercise_1.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    public void addNew() {
        Student student = this.getInfoStudent();
        studentList.add(student);
        System.out.println("Thêm mới ok!!!");

    }

    public void display() {
        if (studentList.size() > 0) {
            for (Student student : studentList) {
                System.out.println(student);
            }
        } else {
            System.out.println("Danh sách trống ");
        }
    }

    public void remove() {
        if (studentList.size() > 0) {
            System.out.println("Nhập mã sinh viên cần xóa: ");
            String coderm = scanner.nextLine();
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getCode().equals(coderm)) {
                    studentList.remove(i);
                }
            }

        } else {
            System.out.println("Danh sách trống: ");
        }


    }


    @Override
    public void research(){
        System.out.println("Nhập tên sinh viên bạn muốn tìm: ");
        String studentName = scanner.nextLine();
        for(int i =0;i<studentList.size();i++){
            if(studentList.get(i).getName().contains(studentName)){
                System.out.println("Đây có phải là tên bạn muốn tìm ?");
                System.out.println(studentList.get(i));
                break;
            }

        }


    }

    public Student getInfoStudent() {
        System.out.println("Nhập mã sinh viên: ");
        String code = scanner.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        String studentName = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String birthday = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String tempGender = scanner.nextLine();
        String gender;
        if (tempGender.equals("Nam") || tempGender.equals("nam")) {
            gender = "Nam";
        } else if (tempGender.equals("Nữ") || tempGender.equals("nữ")) {
            gender = "Nữ";
        } else {
            gender = "Thứ 3";
        }
        System.out.println("Nhập lớp: ");
        String className = scanner.nextLine();
        System.out.println("Nhập điểm số: ");
        int score = Integer.parseInt(scanner.nextLine());
        Student student = new Student(code, studentName, birthday, gender, className, score);
        return student;
    }
    public void addData(){
        studentList.add(new Student("ID123","Lại Văn A","06/12/1994","Nam","C0722G1",10));
        studentList.add(new Student("ID122","Lại Văn B ","06/12/1994","Nam","C0722G1",9));
        studentList.add(new Student("ID125","Lại Văn C","06/12/1994","Nam","C0722G1",8));
        studentList.add(new Student("ID121","Lại Văn D","06/12/1994","Nam","C0722G1",6));

    }
}
