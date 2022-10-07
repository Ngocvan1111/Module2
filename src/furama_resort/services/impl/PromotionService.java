package furama_resort.services.impl;

import furama_resort.models.Booking;
import furama_resort.models.Customer;
import furama_resort.services.IPromotionService;
import furama_resort.utils.ReadDataUtil;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PromotionService  implements IPromotionService {
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public List<String> CustomerListUseYearService() {
        List<Customer> customerServiceList = ReadDataUtil.readCustomerDataFromFile();
        List<Booking> bookingList = ReadDataUtil.readBookingDataFromFile();
        List<String> customerToGetVoucherList = new ArrayList<>();
        for(int i =0;i< bookingList.size();i++){
            if(bookingList.get(i).getTypeForRent().equals("Year") ){
                for(int j =0;j<customerServiceList.size();j++){
                    if(customerServiceList.get(j).getCode().equals(bookingList.get(i).getCode())){
                        customerToGetVoucherList.add(customerServiceList.get(i).getName());
                    }

                }
            }
        }return customerToGetVoucherList;

    }
    public void displayCustomerListUseYearService(){
        List<String> customerList = CustomerListUseYearService();
        for(String s:customerList){
            System.out.println(s);
        }
    }

    @Override
    public int[] offerPromotionalVouchers( ) {
        System.out.println("Nhập số lượng voucher");
        System.out.println("Nhập số lượng voucher || 10%");
        int voucher10 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng voucher || 20%");
        int voucher20 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng voucher || 30%");
        int voucher30 = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[]{voucher10,voucher20,voucher30};
        return arr;

    }

    @Override
    public void displayCustomerListGetVoucher() {
        List<String> customerList = CustomerListUseYearService();
        int[]arr = offerPromotionalVouchers();
        for(int i =0;i<customerList.size() && i< arr[0]+arr[1]+arr[2];i++){
            if(i<arr[2]){
                System.out.println(customerList.get(i)+ " || Nhận Voucher 30%");
            }
            else if(i<arr[2]+arr[1]){
                System.out.println(customerList.get(i) + " || Nhận Voucher 20%");
            }
            else if(i < arr[2]+arr[1]+arr[0]){
                System.out.println(customerList.get(i) +" || Nhận Voucer 10%");
            }
        }

    }
}
