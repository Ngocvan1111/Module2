package furama_resort.services.impl;

import furama_resort.models.Customer;
import furama_resort.services.ICustomerService;
import furama_resort.utils.ReadDataUtil;
import furama_resort.utils.ValidateCustomerUtil;
import furama_resort.utils.ValidateEmployeeUtil;
import furama_resort.utils.WriteDataUtil;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class CustomerService implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> customerList = new ArrayList<>();
    @Override
    public void addNew() throws IOException, DataFormatException {
        customerList = ReadDataUtil.readCustomerDataFromFile();
        Customer customer = this.getInfor();
        customerList.add(customer);
        WriteDataUtil.writeToCustomerFile(customerList);


    }

    @Override
    public void display() {
        customerList = ReadDataUtil.readCustomerDataFromFile();
        if(customerList!=null) {
            if (customerList.size() == 0) {
                System.out.println("Danh sách trống !!!");
            } else {
                for (Customer customer : customerList) {
                    System.out.println(customer.toString());
                }

            }
        }


    }

    @Override
    public void edit() throws IOException, DataFormatException {
        customerList = ReadDataUtil.readCustomerDataFromFile();
        System.out.println("Nhập mã khách hàng cần chỉnh sửa: ");
        String code = scanner.nextLine();
        boolean flag = true;
        for(int i =0;i<customerList.size();i++){
            if(customerList.get(i).getCode().equals(code)){
                Customer customer = this.getInfor();
                customerList.set(i,customer);
                System.out.println("Thông tin khách hàng đã được sửa !!!");
                WriteDataUtil.writeToCustomerFile(customerList);
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Không có thông tin khách hàng cần chỉnh sửa !!!!");
        }


    }
    private Customer getInfor() {
        String code =  ValidateCustomerUtil.code();
        String name = ValidateCustomerUtil.name();
        LocalDate birthDay = ValidateCustomerUtil.birthDay();
        String gender = ValidateCustomerUtil.gender();
        int identityCard = ValidateCustomerUtil.identityCard();
        int phoneNumber = ValidateCustomerUtil.phoneNumber();
        String email = ValidateCustomerUtil.email();
        String customerType = ValidateCustomerUtil.customerType();
        String address = ValidateCustomerUtil.adrress();
        Customer customer = new Customer(code,name,birthDay,gender,identityCard,phoneNumber,email,customerType,address);
        return customer;

    }

}
