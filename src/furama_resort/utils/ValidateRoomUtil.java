package furama_resort.utils;

import furama_resort.exception.*;
import furama_resort.models.Room;

import java.util.List;
import java.util.Scanner;

public class ValidateRoomUtil extends ValidateFacilityUtil {
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

    public static String promotionService(){
        String promotionService;
        String regex = "[ ]+";
        while (true){
            try {
                System.out.println("Nhập vào khuyến mãi đi kèm cho room");
                promotionService = scanner.nextLine();
                if(promotionService == null || promotionService.matches(regex)){
                    throw new PromotionServiceException("Không được để trống !!");
                }
                break;

            }catch (PromotionServiceException e){
                System.out.println(e.getMessage());
            }
        }
        return promotionService;
    }

}
