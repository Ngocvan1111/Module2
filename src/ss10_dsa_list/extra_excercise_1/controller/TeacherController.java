package ss10_dsa_list.extra_excercise_1.controller;

import ss10_dsa_list.extra_excercise_1.service.impl.StudentService;
import ss10_dsa_list.extra_excercise_1.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    public static Scanner scanner = new Scanner(System.in);

    public static void teacherManage(){
        while (true){
            System.out.println("--CHÀO MỪNG TỚI TRÌNH QUẢN LÝ GIẢNG VIÊN--");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Thêm mới giảng viên.");
            System.out.println("2. Xóa giảng viên");
            System.out.println("3. Xem danh sách giảng viên");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            int choise = Integer.parseInt(scanner.nextLine());
            TeacherService teacherService = new TeacherService();

            switch (choise){
                case 1:
                    teacherService.addNew();
                    break;
                case 2:
                    teacherService.remove();
                    break;
                case 3:
                    teacherService.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }}
}
