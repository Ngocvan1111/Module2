package ss10_dsa_list.extra_excercise_1.service.impl;

import ss10_dsa_list.extra_excercise_1.exception.InputException;
import ss10_dsa_list.extra_excercise_1.model.Teacher;
import ss10_dsa_list.extra_excercise_1.model.Teacher;
import ss10_dsa_list.extra_excercise_1.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();

    public void addNew() {
        Teacher teacher = this.getInfoStudent();
        teacherList.add(teacher);
        System.out.println("Thêm mới ok!!!");

    }

    public void display() {
        if (teacherList.size() > 0) {
            for (Teacher teacher : teacherList) {
                System.out.println(teacher);
            }
        } else {
//            System.out.println("Danh sách trống: ");
            throw new IllegalArgumentException("Danh sách Trống +++ size = 0");
        }
    }

    public void remove() {
        if (teacherList.size() > 0) {
            System.out.println("Nhập mã Giẩng viên cần xóa: ");
            String codeRemove = scanner.nextLine();
            for (int i = 0; i < teacherList.size(); i++) {
                if (teacherList.get(i).getCode().equals(codeRemove)) {
                    teacherList.remove(i);
                }
            }
        } else {
            System.out.println("Danh sách trống: ");
            throw new IllegalArgumentException("Danh sách Trống +++ size = 0");
        }


    }
    public void sort(){
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
                checkCode(code);
                break;

            } catch (InputException e) {
                e.printStackTrace();

            }
        }
        while (true) {
            try {
                System.out.println("Nhập tên giảng viên: ");
                teacherName = scanner.nextLine();
                checkName(teacherName);
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
        System.out.println("Nhập chuyên môn: ");
        String major = scanner.nextLine();
        Teacher teacher = new Teacher(code, teacherName, birthday, gender, major);
        return teacher;
    }

    public void addData() {
        teacherList.add(new Teacher("id221", "Nguyen Thi Anh", "06/12/1995", "Nữ", "Math"));
        teacherList.add(new Teacher("id211", "Nguyen Thi Anh", "06/12/1995", "Nữ", "Music"));
        teacherList.add(new Teacher("id233", "Nguyen Thi Quynh", "06/12/1995", "Nữ", "Art"));
        teacherList.add(new Teacher("id234", "Nguyen thi Tam", "06/12/1995", "Nữ", "English"));
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
    }}}