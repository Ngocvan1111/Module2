package furama_resort.utils;

import furama_resort.exception.AreaException;
import furama_resort.exception.InputSectionException;
import furama_resort.exception.NumberOfFloorException;
import furama_resort.exception.ServiceCodeException;
import furama_resort.models.Villa;

import java.util.List;
import java.util.Scanner;

public class ValidateVillaUtil extends ValidateFacilityUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static String serviceCode(){
        List<Villa> villaList = ReadDataUtil.readVillaDataFromFile();
        String regex = "^SVVL-[0-9]{4}$";
        String serviceCode;
        while (true){
            try {
                System.out.println("Nhập mã dịch vụ theo định dạng SVVL-XXXX || XXXX là số: ");
                serviceCode = scanner.nextLine();
                if(!serviceCode.matches(regex)){
                    throw new ServiceCodeException("Lỗi định dạng !!!");
                }
                for(int i=0;i<villaList.size();i++){
                    if(villaList.get(i).getServiceCode().equals(serviceCode)){
                        throw new ServiceCodeException(" Service code đã tồn tại!");
                    }
                }
                break;

            }catch (ServiceCodeException e){
                System.out.println(e.getMessage());
            }
        }return serviceCode;

    }
    public static String roomStandard(){
        String roomStandrad ="";
        int choice;
        while (true){
            try {
                System.out.println("Nhập tiêu chuẩn phòng: ");
                System.out.println("1. Tiêu chuẩn: *");
                System.out.println("2. Tiêu chuẩn: **");
                System.out.println("3. Tiêu chuẩn: ***");
                System.out.println("4. Tiêu chuẩn: ****");
                System.out.println("5. Tiêu chuẩn: *****");
                choice =Integer.parseInt(scanner.nextLine());
                InputSectionException.checkInputChoiseRoomStandradType(choice);
                switch (choice){
                    case 1:
                        roomStandrad = "*";
                        break;
                    case 2:
                        roomStandrad = "**";
                        break;
                    case 3:
                        roomStandrad = "***";
                        break;
                    case 4:
                        roomStandrad = "****";
                        break;
                    case 5:
                        roomStandrad = "*****";
                }
                break;

            }catch (InputSectionException | NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }return roomStandrad;
    }
    public static int numberOfFloor(){
        int numberOfFloor;
        while (true){
            try {
                System.out.println("Nhập số tầng ");
                numberOfFloor = Integer.parseInt(scanner.nextLine());
                if(numberOfFloor <= 0){
                    throw new NumberOfFloorException("Số tầng phải lớn hơn 0");
                }

                break;
            }catch (NumberOfFloorException e){
                System.out.println(e.getMessage());
            }

        }
        return numberOfFloor;

    }
    public static double swimmingPoolAre(){
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
}
