package furama_resort.services.impl;

import furama_resort.exception.CodeNameException;
import furama_resort.exception.NameException;
import furama_resort.models.Customer;
import furama_resort.services.ICustomerService;
import furama_resort.utils.ReadEmployeeUtil;
import furama_resort.utils.ValidateUtil;
import furama_resort.utils.WriteEmployeeUtil;

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
        customerList = ReadEmployeeUtil.readCustomerDataFromFile();
        Customer customer = this.getInfor();
        customerList.add(customer);
        WriteEmployeeUtil.writeTofile(customerList);


    }

    @Override
    public void display() throws IOException {
        customerList = ReadEmployeeUtil.readCustomerDataFromFile();
        for(Customer customer:customerList){
            System.out.println(customer.getInfo());
        }

    }

    @Override
    public void edit() throws IOException, DataFormatException {
        customerList = ReadEmployeeUtil.readCustomerDataFromFile();
        System.out.println("Nhập mã khách hàng cần chỉnh sửa: ");
        String code = scanner.nextLine();
        boolean flag = true;
        for(int i =0;i<customerList.size();i++){
            if(customerList.get(i).getCode().equals(code)){
                Customer customer = this.getInfor();
                customerList.set(i,customer);
                System.out.println("Thông tin khách hàng đã được sửa !!!");
                WriteEmployeeUtil.writeTofile(customerList);
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Không có thông tin khách hàng cần chỉnh sửa !!!!");
        }


    }
    private Customer getInfor() throws DataFormatException, IOException {
        String code =  ValidateUtil.code();
        String name = ValidateUtil.name();
        LocalDate birthDay = ValidateUtil.birthDay();
        String gender = ValidateUtil.gender();
        int identityCard = ValidateUtil.identityCard();
        System.out.println("Nhập số điện thoại: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.println("Nhập loại khách hàng: ");
        System.out.println("1. Diamond");
        System.out.println("2. Platinum");
        System.out.println("3. Gold");
        System.out.println("4. Silver");
        System.out.println("5. Member");
        String customerType = "";
        int choise = Integer.parseInt(scanner.nextLine());
        switch (choise){
            case 1:
                customerType = "Diamond";
                break;
            case 2:
                customerType = "Platinum";
                break;
            case 3:
                customerType = "Gold";
                break;
            case 4:
                customerType = "Silver";
                break;
            case 5:
                customerType = "Member";
                break;

        }
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(code,name,birthDay,gender,identityCard,phoneNumber,email,customerType,address);
        return customer;

    }

}
