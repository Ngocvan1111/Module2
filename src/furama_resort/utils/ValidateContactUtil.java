package furama_resort.utils;

import furama_resort.exception.BookingCodeException;
import furama_resort.models.Booking;

import java.util.List;
import java.util.Scanner;

public class ValidateContactUtil {
    private static Scanner scanner = new Scanner(System.in);
    public static String bookingCode(){
        List<Booking> bookingList = ReadDataUtil.readBookingDataFromFile();
        String bookingCode;
        while (true){
            try {
                System.out.println("Nhập mã booking Code");
                bookingCode =scanner.nextLine();
                if(!bookingCode.equals(bookingList.get(0).getBookingCode())){
                    throw new BookingCodeException(" Lỗi trình tự thực hiện hợp đồng ||| Booking trước làm trước ||  "+bookingList.get(0).getInfo());
                }
                break;
            }catch (BookingCodeException e){
                System.out.println(e.getMessage());
            }
        }return bookingCode;
    }

}
