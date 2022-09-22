package ss12_java_collection_framwork.excercise.practice_using_arraylist_linkedlist_in_java_collection_framework.service.impl;

import ss12_java_collection_framwork.excercise.practice_using_arraylist_linkedlist_in_java_collection_framework.model.Product;
import ss12_java_collection_framwork.excercise.practice_using_arraylist_linkedlist_in_java_collection_framework.service.IproductService;

import java.util.*;

public class ProductService extends Product implements IproductService, Comparable<ProductService> {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new  ArrayList<>();
    @Override
    public void addNewProduct() {
        Product product = this.getInfo();
        productList.add(product);
        System.out.println("Thêm mới thành công !!!");

    }
    public void updateInfoProduct(){
        System.out.println("Nhập id của sản phẩm cần sửa thông tin: ");
        String id = scanner.nextLine();
        Product product = this.getInfo();
        int tempI = 0;
        for(int i = 0; i<productList.size();i++){
            if(productList.get(i).getId().equals(id)){
                tempI = i;

            }
        }
        productList.set(tempI, product);


    }
    public void removeProduct(){
        System.out.println("Nhập id của sản phẩm cần xóa: ");
        String id = scanner.nextLine();
        Product product = this.getInfo();
        int tempI = 0;
        for(int i = 0; i<productList.size();i++){
            if(productList.get(i).getId().equals(id)){
                tempI = i;

            }
        }
        productList.remove(tempI);


    }
    public void displayProductList(){
        for (Product product:productList){
            System.out.println(product);
        }

    }
    public void reseachProduct(){
        System.out.print("Nhập id sản phẩm để tìm kiếm: ");
        String id = scanner.nextLine();
        for (int i = 0;i < productList.size();i++){
            if(productList.get(i).getId().contains(id)){
                System.out.println("Đây có phải là id bạn muốn tìm kiếm ? ");
                System.out.println(productList.get(i));

            }
            else {
                System.out.println("Sản phẩm không tồn tại !!!");
                System.out.println("Đảm bảo bản đã nhập đúng id sản phẩm");
            }
        }


    }
    public void arrangeProduct(){
        PriceComparable priceComparable = new PriceComparable();
        PriceComparableHighToLow priceComparableHighToLow = new PriceComparableHighToLow();
        System.out.println("Chọn chức năng theo số: ");
        System.out.println("1. Sắp xếp theo chiều tăng dần của giá.");
        System.out.println("2. Sắp xếp theo chiều giảm dần của giá. ");
        int choise = Integer.parseInt(scanner.nextLine());
        if(choise == 1){
            Collections.sort(productList,priceComparable);
            for (Product product:productList){
                System.out.println(product);
            }

        }
        else if(choise == 2){
            Collections.sort(productList,priceComparableHighToLow);
            for (Product product:productList){
                System.out.println(product);
            }
        }

    }


    public Product getInfo(){

        System.out.println("Nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        return product;
    }
    public   void addData(){
        productList.add(new Product("id123","Sản phẩm 1",10000));
        productList.add(new Product("id123","Sản phẩm 2",12000));
        productList.add(new Product("id132","Sản phẩm 3",9000));
        productList.add(new Product("id133","Sản phẩm 4",20000));

    }

    @Override
    public int compareTo(ProductService o) {
        if(getPrice() > o.getPrice()) return 1;
        else if (getPrice() < o.getPrice()) return -1;
        else return 0;

    }
}
