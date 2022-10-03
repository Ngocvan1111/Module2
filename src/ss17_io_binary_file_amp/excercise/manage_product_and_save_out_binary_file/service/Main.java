package ss17_io_binary_file_amp.excercise.manage_product_and_save_out_binary_file.service;

import ss17_io_binary_file_amp.excercise.manage_product_and_save_out_binary_file.model.Product;
import ss17_io_binary_file_amp.practive.read_and_write_list_student_to_binary_file.variable.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Product> products = new  ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("Chọn chức năng theo số: ");
            System.out.println("1. Thêm mới");
            System.out.println("2. Hiện thị");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            int choise = Integer.parseInt(scanner.nextLine());
            Main main = new Main();
            switch (choise){
                case 1:
                    main.add();
                    break;
                case 2:
                    main.display();
                    break;
                case 3:
                    main.reseach();
                    break;
                case 4:
                    System.exit(0);
            }
        }


    }
    public static void writeTofile(String path, List<Product> product){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static List<Product> readDataFromFile(String path){
         products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return products;
    }
    public void add(){
        products = readDataFromFile("D:\\01_codegym\\module2\\src\\ss17_io_binary_file_amp\\excercise\\manage_product_and_save_out_binary_file\\data\\product_data.txt");
        Product product = this.getInfor();
        products.add(product);
        writeTofile("D:\\01_codegym\\module2\\src\\ss17_io_binary_file_amp\\excercise\\manage_product_and_save_out_binary_file\\data\\product_data.txt",products);


    }
    public void display(){
        products = readDataFromFile("D:\\01_codegym\\module2\\src\\ss17_io_binary_file_amp\\excercise\\manage_product_and_save_out_binary_file\\data\\product_data.txt");
        for(Product product:products){
            System.out.println(product.getinfo());
        }
    }
    public void reseach(){
        products = readDataFromFile("D:\\01_codegym\\module2\\src\\ss17_io_binary_file_amp\\excercise\\manage_product_and_save_out_binary_file\\data\\product_data.txt");
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        int code = Integer.parseInt(scanner.nextLine());
        for(int i =0; i<products.size();i++){
            if(products.get(i).getCode() == code){
                System.out.println("Đây có phải là sản phẩm bạn muốn tìm: \n"+ products.get(i));
            }
        }
        System.out.println("Không có sản phẩm muốn tìm !!!");

    }
    private Product getInfor(){
        System.out.print("Nhập mã sản phẩm: ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String branch = scanner.nextLine();
        System.out.println("Nhập giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mô tả sản phẩm: ");
        String description = scanner.nextLine();
        Product product = new Product(code,nameProduct,branch,price,description);
        return product;


    }


}
