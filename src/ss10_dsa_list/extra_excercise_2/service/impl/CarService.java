package ss10_dsa_list.extra_excercise_2.service.impl;

import ss10_dsa_list.extra_excercise_2.model.Car;
import ss10_dsa_list.extra_excercise_2.service.ICar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarService  implements ICar {
    public Scanner scanner = new Scanner(System.in);
    public static List<Car> carList = new ArrayList<>();

    public void addNew(){
        Car car = this.getInfo();
        carList.add(car);
        System.out.println("Add new ok!!");
    }
    public void displayVehicle(){
        for (Car car:carList ){
            System.out.println(car);
        }
    }
    public void removeVehicle(){
        System.out.print(" Nhập vào biển kiểm soát muốn xóa: ");
        String seaOfControl = scanner.nextLine();
        for(int i = 0; i < carList.size();i++){
            if(carList.get(i).getSeaOfControl().equals(seaOfControl)){
                System.out.println(" Bạn muốn xóa phương tiện với thông tin: ");
                System.out.println();
                carList.remove(i);
            }

        }


    }
    public Car getInfo(){
        System.out.println(" Nhập biển kiểm soát: ");
        String seaOfControl = scanner.nextLine();
        System.out.println(" Nhập hãng sản xuất: ");
        String branch = scanner.nextLine();
        System.out.println(" Năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println(" Chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.println(" Số chỗ ngồi: ");
        int numberOfSeats = Integer.parseInt(scanner.nextLine());
        System.out.println(" Nhập kiểu xe: ");
        String type = scanner.nextLine();
        Car car = new Car(seaOfControl,branch,yearOfManufacture,owner,numberOfSeats,type);
        return car;
    }
}
