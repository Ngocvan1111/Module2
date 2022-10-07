package furama_resort.utils;

import furama_resort.exception.AreaException;
import furama_resort.exception.InputSectionException;
import furama_resort.exception.NumberPeopleException;
import furama_resort.exception.ServiceNameException;

import java.util.Scanner;

public class ValidateFacilityUtil {
    private static Scanner scanner = new Scanner(System.in);
    public static String rentalTypes(){
        String rentalTypes = "";
        while (true){
            try {
                System.out.println("Chọn kiểu thuê theo số");
                System.out.println("1. Thuê theo giờ");
                System.out.println("2. Thuê theo ngày");
                System.out.println("3. Thuê theo tháng");
                System.out.println("4. Thuê theo năm");
                int choice = Integer.parseInt(scanner.nextLine());
                InputSectionException.checkInputChoiceRentalTypes(choice);
                switch (choice){
                    case 1:
                        rentalTypes = "hours";
                        break;
                    case 2:
                        rentalTypes = "Date";
                        break;
                    case 3:
                        rentalTypes = "Month";
                        break;
                    case 4:
                        rentalTypes = "Year";
                        break;


                }
                break;
            }catch (InputSectionException | NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
        return rentalTypes;
    }
    public static int maxPeople(){
        int people;
        while (true){
            try {
                System.out.println("Nhập số người tối đa");
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
    public static Double price(){
        double price;
        while (true){
            try{
                System.out.println("Nhập vào giá của dịch vụ ");
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
    public static String serviceName(){
        String regex ="^[A-ZĐ][a-záàảãạăâẩắằấầặẵẫêậéèẻẽẹếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+$";
        String serviceName;
        while (true){
            try{
                System.out.println("Nhập vào tên dịch vụ");
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

}
