package ss10_dsa_list.extra_excercise_2.controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import ss10_dsa_list.extra_excercise_2.service.impl.CarService;

import java.util.Scanner;

public class Controller {
    private static Scanner scanner = new Scanner(System.in);
    public static void ManageMenu(){
        while (true){
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG--");
        System.out.println("     Chọn chức năng: ");
        System.out.println("1. Thêm mới phương tiện.");
        System.out.println("2. Hiện thị phương tiện.");
        System.out.println("3. Xóa phương tiện.");
        System.out.println("4. Tìm kiếm theo biển kiểm soát.");
        System.out.println("5. Thoát");
        System.out.println("Chọn: ");
        int choise = Integer.parseInt(scanner.nextLine());
        switch (choise){
            case 1:
                int choiseAdd = Controller.OptionAddVehicle();
                CarService carService = new CarService();
               switch (choiseAdd){
                   case 1:
                       carService.addNew();
                       break;
                   case 2:
                       carService.displayVehicle();

               }
            case 2:
            case 3:
            case 4:
            case 5:
                System.exit(0);


        }


    }}
    private static int OptionAddVehicle(){
        System.out.println("    Chọn chức năng: ");
        System.out.println("1. Thêm mới Car. ");
        System.out.println("2. Thêm mới Truck. ");
        System.out.println("3. Thêm mới Motobike. ");
        System.out.println("4. Thoát. ");
        System.out.println(" Chọn: ");
        return Integer.parseInt(scanner.nextLine());
    }
    private static int OptionDisplayVehicle(){
        System.out.println("    Chọn chức năng: ");
        System.out.println("1. Hiện thị Car. ");
        System.out.println("2. Hiện thị Truck. ");
        System.out.println("3. Hiện thị Motobike. ");
        System.out.println("4. Thoát. ");
        System.out.println(" Chọn: ");
        return Integer.parseInt(scanner.nextLine());
    }
    private static int OptionRemoveVehicle(){
        System.out.println("    Chọn chức năng: ");
        System.out.println("1. Xóa Car. ");
        System.out.println("2. Xóa Truck. ");
        System.out.println("3. Xóa Motobike. ");
        System.out.println("4. Thoát. ");
        System.out.println(" Chọn: ");
        return Integer.parseInt(scanner.nextLine());
    }
    private static int OptionReseachVehicle(){
        System.out.println("    Chọn chức năng: ");
        System.out.println("1. Tìm kiếm Car. ");
        System.out.println("2. Tìm kiếm Truck. ");
        System.out.println("3. Tìm kiếm Motobike. ");
        System.out.println("4. Thoát. ");
        System.out.println(" Chọn: ");
        return Integer.parseInt(scanner.nextLine());
    }

}
