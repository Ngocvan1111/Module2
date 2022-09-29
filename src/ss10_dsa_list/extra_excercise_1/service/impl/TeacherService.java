package ss10_dsa_list.extra_excercise_1.service.impl;

import ss10_dsa_list.extra_excercise_1.exception.InputException;
import ss10_dsa_list.extra_excercise_1.model.Student;
import ss10_dsa_list.extra_excercise_1.model.Teacher;
import ss10_dsa_list.extra_excercise_1.model.Teacher;
import ss10_dsa_list.extra_excercise_1.service.ITeacherService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();

    public void addNew() throws IOException {
        teacherList = getAllTeacherInfoFromFile();
        Teacher teacher = this.getInfoStudent();
        teacherList.add(teacher);
        System.out.println("Thêm mới ok!!!");
        writeTofile(teacherList);

    }

    public void display() throws IOException {
        teacherList = getAllTeacherInfoFromFile();
        if (teacherList.size() > 0) {
            for (Teacher teacher : teacherList) {
                System.out.println(teacher);
            }
        } else {
//            System.out.println("Danh sách trống: ");
            throw new IllegalArgumentException("Danh sách Trống +++ size = 0");
        }
    }

    public void remove() throws IOException {
        teacherList = getAllTeacherInfoFromFile();
        if (teacherList.size() > 0) {
            System.out.println("Nhập mã Giẩng viên cần xóa: ");
            String codeRemove = scanner.nextLine();
            for (int i = 0; i < teacherList.size(); i++) {
                if (teacherList.get(i).getCode().equals(codeRemove)) {
                    teacherList.remove(i);
                }
            }
            writeTofile(teacherList);
        } else {
            System.out.println("Danh sách trống: ");
            throw new IllegalArgumentException("Danh sách Trống +++ size = 0");
        }


    }
    public void sort() throws IOException {
        teacherList = getAllTeacherInfoFromFile();
        for (int i = 0; i < teacherList.size() - 1; i++) {

            for (int j = i; j < teacherList.size(); j++) {
                boolean flag = true;

                for (int k = 0; k < teacherList.get(i).getLastName().length() && k < teacherList.get(j).getLastName().length(); k++) {
                    if (teacherList.get(i).getLastName().charAt(k) < teacherList.get(j).getLastName().charAt(k)) {
                        flag = false;
                        break;

                    } else if (teacherList.get(i).getLastName().charAt(k) > teacherList.get(j).getLastName().charAt(k)) {
                        Teacher temp = teacherList.get(i);
                        System.out.println(temp);
                        teacherList.set(i, teacherList.get(j));
                        System.out.println(teacherList.get(i));
                        teacherList.set(j, temp);
                        System.out.println(teacherList.get(j));
                        flag = false;
                        break;
                    }

                }
                if (flag) {
                    if (teacherList.get(i).getLastName().length() > teacherList.get(j).getLastName().length()) {
                        Teacher temp = teacherList.get(i);
                        teacherList.set(i, teacherList.get(j));
                        teacherList.set(j, temp);
                    }
                    if (teacherList.get(i).getLastName().length() == teacherList.get(j).getLastName().length()) {
                        for (int y = 0; y < teacherList.get(i).getCode().length(); y++) {
                            if ((int) (teacherList.get(i).getCode().charAt(y)) > (int) (teacherList.get(j).getCode().charAt(y))) {
                                Teacher temp = teacherList.get(i);
                                teacherList.set(i, teacherList.get(j));
                                teacherList.set(j, temp);

                            }

                        }

                    }

                }

            }

        }
        writeTofile(teacherList);

    }


    public void test(){

    }

    @Override
    public void research() {
        System.out.println("Nhập tên giảng viên hoặc id bạn muốn tìm bạn muốn tìm ");
        String teacherName = scanner.nextLine();
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getName().contains(teacherName)) {
                System.out.println("Đây có phải là tên bạn muốn tìm ?");
                System.out.println(teacherList.get(i));
                break;
            }
            else if (teacherList.get(i).getCode().equals(teacherName)){
                System.out.println("Đây có phải là tên bạn muốn tìm ?");
                System.out.println(teacherList.get(i));
                break;
            }

        }


    }

    public Teacher getInfoStudent() {
        String code = "";
        String teacherName = "";
        String birthday = "";
        while (true) {
            try {
                System.out.println("Nhập mã Giảng viên: ");
                code = scanner.nextLine();
                InputException.checkCode(code);
                break;

            } catch (InputException e) {
                e.printStackTrace();

            }
        }
        while (true) {
            try {
                System.out.println("Nhập tên giảng viên: ");
                teacherName = scanner.nextLine();
                InputException.checkName(teacherName);
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
        System.out.println("Nhập chuyên môn: ");
        String major = scanner.nextLine();
        Teacher teacher = new Teacher(code, teacherName, birthday, gender, major);
        return teacher;
    }

    private List<Teacher> getAllTeacherInfoFromFile() throws IOException {
        teacherList = new ArrayList<>();
        File file = new File("D:\\01_codegym\\module2\\src\\ss10_dsa_list\\extra_excercise_1\\data\\teacher.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line ;
        String[] studentArrays;
        while ((line = bufferedReader.readLine()) != null){
            studentArrays = line.split(",");
            teacherList.add(new Teacher(studentArrays[0],studentArrays[1],studentArrays[2],studentArrays[3],studentArrays[4]));
        }
        bufferedReader.close();
        return teacherList;

    }
    private void writeTofile(List<Teacher> teacherList) throws IOException {
        File file = new  File("D:\\01_codegym\\module2\\src\\ss10_dsa_list\\extra_excercise_1\\data\\teacher.csv");
        String line =null;
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Teacher s:teacherList) {
            bufferedWriter.write(s.getInfor());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

   }