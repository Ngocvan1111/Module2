package furama_resort.utils;

import furama_resort.exception.AreaException;
import furama_resort.exception.NumberPeopleException;
import furama_resort.exception.ServiceCodeException;
import furama_resort.exception.ServiceNameException;
import furama_resort.models.Room;

import java.util.List;
import java.util.Scanner;

public class ValidateRoomUtil {
    private static Scanner scanner = new Scanner(System.in);
    public static String serviceCode(){
        List<Room> roomList = ReadDataUtil.readRoomDataFromFile();
        String regex = "^SVRO-[0-9]{4}$";
        String serviceCode;
        while (true){
            try {
                System.out.println("Nhập mã dịch vụ: ");
                serviceCode = scanner.nextLine();
                if(!serviceCode.matches(regex)){
                    throw new ServiceCodeException("Lỗi định dạng !!!");
                }
                for(int i=0;i<roomList.size();i++){
                    if(roomList.get(i).getServiceCode().equals(serviceCode)){
                        throw new ServiceCodeException(" Service code đã tồn tại!");
                    }
                }
                break;

            }catch (ServiceCodeException e){
                System.out.println(e.getMessage());
            }
            }return serviceCode;

    }
    public static String serviceName(){
        String regex ="^[A-ZĐ][a-záàảãạăâẩắằấầặẵẫêậéèẻẽẹếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+$";
        String serviceName;
        while (true){
            try{
                System.out.println("Input serviceName");
                serviceName = scanner.nextLine();
                if(!serviceName.matches(regex)){
                    throw new ServiceNameException("Lỗi định dạng!!");
                }
                break;
            }catch (ServiceNameException e){
                System.out.println(e.getMessage());
            }
        }
        return serviceName;
    }
    public static Double area(){
        double area;
        while (true){
            try{
                System.out.println("Nhập vào diện tích sử dụng ");
                area = Double.parseDouble(scanner.nextLine());
                if(area <=  30){
                    throw new AreaException("Điện tích sử dụng quá nhỏ || area > 30 ||"+area);
                }
                break;
            }catch (AreaException | NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }return area;

    }
    public static Double price(){
        double price;
        while (true){
            try{
                System.out.println("Nhập vào diện tích sử dụng ");
                price = Double.parseDouble(scanner.nextLine());
                if(price <  0){
                    throw new AreaException("Lương không thể nhỏ hơn không || area < 0 ||"+price);
                }
                break;
            }catch (AreaException | NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }return price;

    }
    public static int maxPeople(){
        int people;
        while (true){
            try {
                people = Integer.parseInt(scanner.nextLine());
                if(people < 0 || people > 20){
                    throw new NumberPeopleException("Số người không hợp lệ: 0 < people < 20 ||"+people);
                }
                break;
            }catch (NumberPeopleException | NumberFormatException e){
                System.out.println(e.getMessage());

            }
        }return people;

    }



}
