package furama_resort.services.impl;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import furama_resort.models.*;
import furama_resort.services.IBookingService;
import furama_resort.utils.DayComparetor;
import furama_resort.utils.ReadDataUtil;
import furama_resort.utils.ValidateBookingUtil;
import furama_resort.utils.WriteDataUtil;

import java.io.IOException;
import java.util.*;
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
        DayComparetor dayComparetor = new DayComparetor();
        assert bookingList != null;
        bookingList.sort(dayComparetor);

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
        String bookingcode = ValidateBookingUtil.bookingCode();
        String startDay = ValidateBookingUtil.startDay();
        String endDay = ValidateBookingUtil.endDay();
        String code = ValidateBookingUtil.customerCode();
        String serviceCode = ValidateBookingUtil.serviceCode();
        String rentalTypes = ValidateBookingUtil.rentalTypes();
        Booking booking = new Booking(bookingcode,startDay,endDay,code,serviceCode,rentalTypes);
        return booking;
    }
}
