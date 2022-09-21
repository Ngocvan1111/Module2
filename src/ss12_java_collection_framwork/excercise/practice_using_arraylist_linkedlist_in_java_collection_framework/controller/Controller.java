package ss12_java_collection_framwork.excercise.practice_using_arraylist_linkedlist_in_java_collection_framework.controller;

import ss12_java_collection_framwork.excercise.practice_using_arraylist_linkedlist_in_java_collection_framework.service.impl.ProductService;

import java.util.Scanner;

public class Controller {
    public static ProductService productService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);
    public static void productManager(){
        while (true){
            System.out.println("***** TRÌNH QUẢN LÝ SẢN PHẨM *****");
            System.out.println(" Chọn chức năng theo số: ");
            System.out.println("1. Thêm sản phẩm mới. ");
            System.out.println("2. Sửa thông tin sản phẩm. ");
            System.out.println("3. Xóa sản phẩm.");
            System.out.println("4. Hiện thị danh sách sản phẩm.");
            System.out.println("5. Tìm kiếm sản phẩm theo tên. ");
            System.out.println("6. Sắp xếp sản phẩm. ");
            System.out.println("7. Thoát");
            System.out.print("Chọn chức năng: ");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise){
                case 1:
                    productService.addNewProduct();
                    break;
                case 2:
                    productService.updateInfoProduct();
                    break;
                case 3:
                    productService.removeProduct();
                    break;
                case 4:
                    productService.displayProductList();
                    break;
                case 5:
                    productService.reseachProduct();
                    break;
                case 6:
                    productService.arrangeProduct();
                    break;
                case 7:
                    System.exit(0);

            }

        }


    }
}
