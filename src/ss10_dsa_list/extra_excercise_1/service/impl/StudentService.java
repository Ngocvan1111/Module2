package ss10_dsa_list.extra_excercise_1.service.impl;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;
import ss10_dsa_list.extra_excercise_1.exception.InputException;
import ss10_dsa_list.extra_excercise_1.model.Student;
import ss10_dsa_list.extra_excercise_1.service.IStudentService;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    public StudentService() throws FileNotFoundException {
    }

    public void addNew() throws IOException {
        studentList = getAllStudentInfoFromFile();
        Student student = this.getInfoStudent();
        studentList.add(student);
        System.out.println("Thêm mới ok!!!");
        writeTofile(studentList);

    }

    public void display() throws IOException {
        studentList =  getAllStudentInfoFromFile();
        if (studentList.size() > 0) {
            for (Student student : studentList) {
                System.out.println(student);
            }
        } else {
            System.out.println("Danh sách trống ");
        }
    }

    public void remove() throws IOException {
        studentList = getAllStudentInfoFromFile();
        if (studentList.size() > 0) {
            System.out.println("Nhập mã sinh viên cần xóa: ");
            String coderm = scanner.nextLine();
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getCode().equals(coderm)) {
                    studentList.remove(i);
                }
            }
            writeTofile(studentList);

        } else {
            System.out.println("Danh sách trống: ");
        }


    }


    @Override
    public void research() throws IOException {
        studentList = getAllStudentInfoFromFile();
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

    public void sort() throws IOException {
        studentList = getAllStudentInfoFromFile();

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
        writeTofile(studentList);

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
                InputException.checkCode(code);
                break;

            } catch (InputException e) {
                e.printStackTrace();

            }
        }
        while (true) {
            try {
                System.out.println("Nhập tên sinh viên: ");
                studentName = scanner.nextLine();
                InputException.checkName(studentName);
                break;

            } catch (InputException e) {
                e.printStackTrace();

            }
        }
        while (true) {
            try {
                System.out.println("Nhập ngày sinh: ");
                birthday = scanner.nextLine();
                InputException.checkBirthday(birthday);
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
                InputException.checkClassName(className);
                break;

            } catch (InputException e) {
                e.printStackTrace();

            }
        }
        while (true) {
            try {
                System.out.println("Nhập điểm số: ");
                score = Integer.parseInt(scanner.nextLine());
                InputException.checkScore(score);
                break;

            } catch (InputException e) {
                e.printStackTrace();

            }
        }

        Student student = new Student(code, studentName, birthday, gender, className, score);
        return student;
    }

    private List<Student> getAllStudentInfoFromFile() throws IOException{
        studentList = new ArrayList<>();
        File file = new File("D:\\01_codegym\\module2\\src\\ss10_dsa_list\\extra_excercise_1\\data\\student.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line ;
        String[] studentArrays;
        while ((line = bufferedReader.readLine()) != null){
            studentArrays = line.split(",");
            studentList.add(new Student(studentArrays[0],studentArrays[1],studentArrays[2],studentArrays[3],studentArrays[4],Double.parseDouble(studentArrays[5])));
        }
        bufferedReader.close();
        return studentList;

    }
    private void writeTofile(List<Student> studentList) throws IOException {
        File file = new  File("D:\\01_codegym\\module2\\src\\ss10_dsa_list\\extra_excercise_1\\data\\student.csv");
        String line =null;
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      for (Student s:studentList) {
          bufferedWriter.write(s.getInfor());
          bufferedWriter.newLine();
      }
        bufferedWriter.close();
    }






}
