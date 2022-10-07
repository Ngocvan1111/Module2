package furama_resort.utils;

import furama_resort.exception.CodeNameException;
import furama_resort.exception.DayInputException;
import furama_resort.exception.InputSectionException;
import furama_resort.exception.ServiceCodeException;
import furama_resort.models.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateBookingUtil {
    private static String bridgeDay = "";
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isValiDateDay(String targe ) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setLenient(false);
        try{
            simpleDateFormat.parse(targe);
            return true;
        }catch (ParseException e){
        }return false;
    }
    public static String bookingCode(){
        List<Booking> bookings = ReadDataUtil.readBookingDataFromFile();
        String regex = "^BK-[0-9]{6}$";
        String serviceCode;
        while (true){
            try {
                System.out.println("Nhập mã dịch vụ: ");
                serviceCode = scanner.nextLine();
                if(!serviceCode.matches(regex)){
                    throw new ServiceCodeException("Lỗi định dạng !!!");
                }
                for(int i=0;i<bookings.size();i++){
                    if(bookings.get(i).getServiceCode().equals(serviceCode)){
                        throw new ServiceCodeException(" Booking code đã tồn tại!");
                    }
                }
                break;

            }catch (ServiceCodeException e){
                System.out.println(e.getMessage());
            }
        }return serviceCode;
    }
    public static String startDay(){
        String startDay;
        while (true){
            try {
                System.out.println("Nhập ngày bắt đầu dd/MM/yyyy");
                startDay = scanner.nextLine();
                if(!isValiDateDay(startDay)){
                    throw new DayInputException("Lỗi định dạng ngày tháng năm !!!");
                }
                DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localStrartDay = LocalDate.parse(startDay,formatter);
                if(localStrartDay.compareTo(LocalDate.now()) < 0){
                    throw new DayInputException("Ngày bắt đầu phải lớn hơn hôm thời gian booking");
                }
                bridgeDay = startDay;
                break;
            }catch (DayInputException e){
                System.out.println(e.getMessage());
            }
        }return startDay;
    }
    public static String endDay(){
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localStrartDay = LocalDate.parse(bridgeDay,formatter);

        String endDay;
        while (true){
            try {
                System.out.println("Nhập ngày kết thúc dd/MM/yyyy");
                endDay = scanner.nextLine();
                if(!isValiDateDay(endDay)){
                    throw new DayInputException("Lỗi định dạng ngày tháng năm !!!");
                }
                LocalDate localEndDay = LocalDate.parse(endDay,formatter);
                if(localEndDay.compareTo(localStrartDay)  < 0){
                    throw new DayInputException("Ngày kết thúc phải lớn hơn ngày bắt đầu !!!");
                }
                break;
            }catch (DayInputException e){
                System.out.println(e.getMessage());
            }
        }return endDay;}

    public static String customerCode(){
        List<Customer> customerList = ReadDataUtil.readCustomerDataFromFile();
        String customerCode;
        while (true){
            try{
                System.out.println("Nhập mã khách hàng: ");
                customerCode = scanner.nextLine();
                String regex = "^[C]\\d{4}";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(customerCode);
                if(!matcher.matches()){
                    throw new CodeNameException("Sai định dạng");
                }
                boolean flag = true;
                for(int i = 0; i< Objects.requireNonNull(customerList).size(); i++){
                    if(customerList.get(i).getCode().equals(customerCode)){
                        flag = false;
                    }
                }
                if(flag){
                    throw new CodeNameException(" Mã khách hàng không tồn tại !!!");
                }
                break;

            }catch (CodeNameException e){
                System.out.println(e.getMessage());
            }

        }return customerCode;
    }
    public static String serviceCode(){
        String regex = "^SVHO-[0-9]{4}$";
        String regex1 = "^SVRO-[0-9]{4}$";
        String regex2 = "^SVVL-[0-9]{4}$";
        List<Villa> villaList = ReadDataUtil.readVillaDataFromFile();
        List<House> houseList = ReadDataUtil.readHouseDataFromFile();
        List<Room> roomList = ReadDataUtil.readRoomDataFromFile();
        String serviceCode;
        while (true){
            try {
                System.out.println("Nhập mã dịch vụ theo định dạng SVVL-XXXX || XXXX là số: ");
                serviceCode = scanner.nextLine();
                if(!serviceCode.matches(regex) && !serviceCode.matches(regex1) && !serviceCode.matches(regex2)){
                    throw new ServiceCodeException("Lỗi định dạng !!!");
                }
                for(int i=0;i<houseList.size();i++){
                    if(houseList.get(i).getServiceCode().equals(serviceCode)){
                        return serviceCode;
                    }
                }
                for(int i=0;i<roomList.size();i++){
                    if(roomList.get(i).getServiceCode().equals(serviceCode)){
                        return serviceCode;
                    }
                }
                for(int i=0;i<villaList.size();i++){
                    if(villaList.get(i).getServiceCode().equals(serviceCode)){
                        return serviceCode;
                    }
                }
                throw new ServiceCodeException(" Mã không tồn tại !!!");

            }catch (ServiceCodeException e){
                System.out.println(e.getMessage());
            }
        }
    }
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
}
