package ss10_dsa_list.extra_excercise_1.service.impl;

import ss10_dsa_list.extra_excercise_1.exception.InputException;
import ss10_dsa_list.extra_excercise_1.model.Student;
import ss10_dsa_list.extra_excercise_1.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
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
    public void research() {
        System.out.println("Nhập tên sinh viên bạn muốn tìm: ");
        String studentName = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().contains(studentName)) {
                System.out.println("Đây có phải là tên bạn muốn tìm ?");
                System.out.println(studentList.get(i));
                break;
            } else if (studentList.get(i).getCode().equals(studentName)) {
                System.out.println("Đây có phải là tên bạn muốn tìm ?");
                System.out.println(studentList.get(i));
                break;
            }

        }


    }

    public void sort() {

        for (int i = 0; i < studentList.size() - 1; i++) {

            for (int j = i; j < studentList.size(); j++) {
                boolean flag = true;

                for (int k = 0; k < studentList.get(i).getLastName().length() && k < studentList.get(j).getLastName().length(); k++) {
                    if (studentList.get(i).getLastName().charAt(k) < studentList.get(j).getLastName().charAt(k)) {
                        flag = false;
                        break;

                    } else if (studentList.get(i).getLastName().charAt(k) > studentList.get(j).getLastName().charAt(k)) {
                        Student temp = studentList.get(i);
                        System.out.println(temp);
                        studentList.set(i, studentList.get(j));
                        System.out.println(studentList.get(i));
                        studentList.set(j, temp);
                        System.out.println(studentList.get(j));
                        flag = false;
                        break;
                    }

                }
                if (flag) {
                    if (studentList.get(i).getLastName().length() > studentList.get(j).getLastName().length()) {
                        Student temp = studentList.get(i);
                        studentList.set(i, studentList.get(j));
                        studentList.set(j, temp);
                    }
                    if (studentList.get(i).getLastName().length() == studentList.get(j).getLastName().length()) {
                        for (int y = 0; y < studentList.get(i).getCode().length(); y++) {
                            if ((int) (studentList.get(i).getCode().charAt(y)) > (int) (studentList.get(j).getCode().charAt(y))) {
                                Student temp = studentList.get(i);
                                studentList.set(i, studentList.get(j));
                                studentList.set(j, temp);

                            }

                        }

                    }

                }

            }

        }

    }


    public  Student getInfoStudent() {
        String code = "";
        String studentName = "";
        String className= "";
        String birthday = "";
        int score = 0;
        while (true) {
            try {
                System.out.println("Nhập mã sinh viên: ");
                code = scanner.nextLine();
                checkCode(code);
                break;

            } catch (InputException e) {
                e.printStackTrace();

            }
        }
        while (true) {
            try {
                System.out.println("Nhập tên sinh viên: ");
                studentName = scanner.nextLine();
                checkName(studentName);
                break;

            } catch (InputException e) {
                e.printStackTrace();

            }
        }
        while (true) {
            try {
                System.out.println("Nhập ngày sinh: ");
                birthday = scanner.nextLine();
                checkBirthday(birthday);
                break;

            } catch (InputException e) {
                e.printStackTrace();

            }
        }



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
        while (true) {
            try {
                System.out.println("Nhập lớp: ");
                className = scanner.nextLine();
                checkClassName(className);
                break;

            } catch (InputException e) {
                e.printStackTrace();

            }
        }
        while (true) {
            try {
                System.out.println("Nhập điểm số: ");
                score = Integer.parseInt(scanner.nextLine());
                checkScore(score);
                break;

            } catch (InputException e) {
                e.printStackTrace();

            }
        }

        Student student = new Student(code, studentName, birthday, gender, className, score);
        return student;
    }

    public void addData() {
        studentList.add(new Student("ID123", "Lai Van Ngoc", "06/12/1994", "Nam", "C0722G1", 10));
        studentList.add(new Student("ID122", "Lai Van Ngoc ", "06/12/1994", "Nam", "C0722G1", 9));
        studentList.add(new Student("ID125", "Nguyen Van Chung", "06/12/1994", "Nam", "C0722G1", 8));
        studentList.add(new Student("ID121", "Nguyen Van Nam", "06/12/1994", "Nam", "C0722G1", 6));
        studentList.add(new Student("ID118", "Nguyen Van Trung", "06/12/1994", "Nam", "C0722G1", 6));
        studentList.add(new Student("ID111", "Nguyen Van Trung", "06/12/1994", "Nam", "C0722G1", 6));

    }

    public  void checkCode(String code) throws InputException {
        for (int i = 2; i < code.length(); i++) {
            if (code.length() != 5 || code.charAt(0) != 'I' || code.charAt(1) != 'D' || (int)code.charAt(i) < 48 || (code.charAt(i) > 57)) {
                throw new InputException("Sai định dạng mã code !!!");
            }

        }
    }
    public static void checkName(String name) throws InputException{
        for (int i=0,j=1;i<name.length();i++,j++){
            if(name.charAt(0) == ' '|| name.charAt(name.length()-1) == ' '|| (name.charAt(i) == ' '&&name.charAt(j) == ' ') || (name.charAt(i) < 65&& name.charAt(i) != 32) || ( 90 < name.charAt(i)&& name.charAt(i) < 97 )|| 122 < name.charAt(i)){
                throw new InputException("Sai định dạng tên !!!");
            }
            if(j == name.length()-1){
                j--;
            }
        }

    }
    public static void checkBirthday(String birthday) throws InputException{
        for(int i =0;i<birthday.length();i++){
            if(birthday.length() != 10 || (birthday.charAt(2) != '/'&& birthday.charAt(5) != '/')){
                throw new InputException("Sai định dạng ngày tháng ");
            }
            if(i==0||i==1||i==3||i==4||i==6||i==7||i==8||i==9){
                if(birthday.charAt(i) < 48 || birthday.charAt(i) > 57){
                    throw new InputException("Sai định dạng ngày tháng ");

                }
            }
        }

    }
    public static void checkGender(String gender) throws InputException{


    }
    public static void checkClassName(String className) throws InputException{
        for(int i = 0;i<className.length();i++){
            if(className.length() != 7 || className.charAt(0) != 'C'|| className.charAt(5) != 'G'|| className.charAt(className.length()-1) < 49 || className.charAt(className.length()-1) > 57 ){
                throw new InputException("Sai định dạng lớp");
            }
            if( 0<i&&i<4){
                if(className.charAt(i)< 47 || className.charAt(i)>57){
                    throw new InputException("Sai định dạng lớp");
                }
            }
        }

    }
    public static void checkScore(int score) throws InputException{
        if(score < 0 || score > 10){
            throw new InputException(" Sai định dạng điểm số !!");
        }
    }


}
