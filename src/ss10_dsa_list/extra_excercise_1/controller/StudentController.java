package ss10_dsa_list.extra_excercise_1.controller;

import ss10_dsa_list.extra_excercise_1.model.Student;
import ss10_dsa_list.extra_excercise_1.service.impl.StudentService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    public static Scanner scanner = new Scanner(System.in);

    public static void studentManage() throws IOException {
        StudentService studentService = new StudentService();

        int choise;
        while (true){
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN--");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Thêm mới sinh viên.");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Xem danh sách sinh viên");
            System.out.println("4. Tìm kiếm theo tên ");
            System.out.println("5. Thoát");
            System.out.println("6. Sắp xếp");
            System.out.print("Chọn chức năng: ");
            choise = Integer.parseInt(scanner.nextLine());

            switch (choise){
                case 1:
                        studentService.addNew();
                    break;
                case 2:
                        studentService.remove();
                    break;
                case 3:
                        studentService.display();
                    break;
                case 4:
                    studentService.research();
                case 5:
                    System.exit(0);
                    break;
                case 6:
                    studentService.sort();
                    break;
            }
        }}

}
