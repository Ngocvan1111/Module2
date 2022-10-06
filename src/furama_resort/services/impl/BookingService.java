package furama_resort.services.impl;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import furama_resort.models.*;
import furama_resort.services.IBookingService;
import furama_resort.utils.ReadDataUtil;
import furama_resort.utils.WriteDataUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class BookingService implements IBookingService {
    private static Scanner scanner = new Scanner(System.in);
    CustomerService customerList = new CustomerService();
    FacilityService facilityService = new FacilityService();
    List<Booking> bookingList = new ArrayList<>();

    @Override
    public void addNew() throws IOException, DataFormatException {
        bookingList = ReadDataUtil.readBookingDataFromFile();
        FacilityService.setData();
        System.out.println("***** Dịch vụ sãn có tại FURAMA REORT ****");
        facilityService.display();
        System.out.println("***** Danh sách khách hàng *****");
        customerList.display();
        System.out.println("***** Danh sách dịch vụ đang bảo trì quý khách tham khảo sử dụng sau khi hoàn thành bảo trì ****");
        facilityService.displayListFacilityMaintenance();
        System.out.println("Nhập đầy đủ thông tin sau: ");
        Booking booking = this.getinfo();
        bookingList.add(booking);
        WriteDataUtil.writeToBookingFile(bookingList);
        System.out.println("Thêm mới thành công !!!");
        FacilityService.setData();
    }

    @Override
    public void display() throws IOException {
        bookingList = ReadDataUtil.readBookingDataFromFile();
        if(bookingList != null){
            if(bookingList.size() == 0){
                System.out.println("Danh sách không có gì");
            }
            else {
                for(Booking booking:bookingList){
                    System.out.println(booking.toString());
                }
            }
        }


    }
    private Booking getinfo(){
        System.out.println("Input Booking Code");
        String bookingcode = scanner.nextLine();
        System.out.println("Input startDay");
        String startDay = scanner.nextLine();
        System.out.println("Input endDay");
        String endDay = scanner.nextLine();
        System.out.println("Input customer code");
        String code = scanner.nextLine();
        System.out.println("Input service Code");
        String serviceCode = scanner.nextLine();
        System.out.println("Input rental types");
        String rentalTypes = scanner.nextLine();
        Booking booking = new Booking(bookingcode,startDay,endDay,code,serviceCode,rentalTypes);
        return booking;
    }
}
