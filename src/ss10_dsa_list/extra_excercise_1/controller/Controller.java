package ss10_dsa_list.extra_excercise_1.controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import ss10_dsa_list.extra_excercise_1.service.IPerson;
import ss10_dsa_list.extra_excercise_1.service.impl.StudentService;

import java.util.Scanner;

public class Controller {
    public static Scanner scanner = new Scanner(System.in);

    public static void menuManage(){
        while (true){
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN VÀ GIẢNG VIÊN--");
        System.out.println("Chọn chức năng theo số (để tiếp tục): ");
        System.out.println("1. Trình quản lý Giảng viên.");
        System.out.println("2. Trình quản lý Sinh viên.");
        System.out.println("3. Thoát");
        System.out.print("Chọn chức năng: ");
        int choise = Integer.parseInt(scanner.nextLine());
        switch (choise){
            case 1:
                TeacherController.teacherManage();
                break;

            case 2:
                StudentController.studentManage();
                break;
            case 3:
                System.exit(0);
                break;
                }
        }}

}
