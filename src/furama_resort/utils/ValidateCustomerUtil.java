package furama_resort.utils;

import furama_resort.exception.CodeNameException;
import furama_resort.exception.IdentityCardException;
import furama_resort.exception.InputSectionException;
import furama_resort.exception.PhoneNumberException;
import furama_resort.models.Customer;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCustomerUtil extends ValidateUtil {
    private static Scanner scanner = new Scanner(System.in);
    public static String code(){
        List<Customer> customerList = ReadDataUtil.readCustomerDataFromFile();

        String code;
        while (true){
            try {

                System.out.println("Nhập mã khách hàng: ");
                code = scanner.nextLine();
                String regex = "^[C]\\d{4}";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(code);
                if(!matcher.matches()){
                    throw new CodeNameException("Sai định dạng");
                }
                for(int i = 0; i< Objects.requireNonNull(customerList).size(); i++){
                    if(customerList.get(i).getCode().equals(code)){
                        throw new CodeNameException("Code đã tồn tại !!!");

                    }
                }
                break;
            }catch (CodeNameException e){
                e.printStackTrace();
            }


        }return code;

    }
    public static int identityCard() {
        List<Customer> customerList = ReadDataUtil.readCustomerDataFromFile();
        String regex = "\\d{9}";
        int identityCard;
        String identityCardTemp;
        while (true){
            try {
                System.out.println("Nhập CMND: ");
                identityCardTemp = scanner.nextLine();
                if(!identityCardTemp.matches(regex)){
                    throw new IdentityCardException("Sai định dạng");
                }
                identityCard = Integer.parseInt(identityCardTemp);
                for (int i =0;i<customerList.size();i++){
                    if(customerList.get(i).getIdentityCard() == (identityCard)){
                        throw new IdentityCardException("CMND đã tồn tại !!");
                    }
                }
                break;

            }catch (IdentityCardException e){
                System.out.println(e.getMessage());
            }
        }
        return identityCard;
    }
    public static int phoneNumber() {
        List<Customer> customerList = ReadDataUtil.readCustomerDataFromFile();
        String regex = "[0]\\d{9}$";
        int phoneNumber;
        String phoneNumberCardTemp;
        while (true){
            try {
                System.out.println("Nhập số điện thoại: ");
                phoneNumberCardTemp = scanner.nextLine();
                if(!phoneNumberCardTemp.matches(regex)){
                    throw new PhoneNumberException("Sai định dạng");
                }
                phoneNumber = Integer.parseInt(phoneNumberCardTemp);
                for (int i =0;i<customerList.size();i++){
                    if(customerList.get(i).getPhoneNumber() == (phoneNumber)){
                        throw new PhoneNumberException("Số điện thoại đã tồn tại !!");
                    }
                }
                break;

            }catch (PhoneNumberException e){
                System.out.println(e.getMessage());
            }
        }
        return phoneNumber;

    }
    public static String customerType(){
        String customerType = "";
        while (true){
            try {
                System.out.println("Nhập loại khách hàng: ");
                System.out.println("1. Diamond");
                System.out.println("2. Platinum");
                System.out.println("3. Gold");
                System.out.println("4. Silver");
                System.out.println("5. Member");

                int choice = Integer.parseInt(scanner.nextLine());
                InputSectionException.checkInputChoiseCustomerType(choice);
                switch (choice){
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
                break;

            } catch (InputSectionException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }return customerType;


    }
    public static String adrress(){
        System.out.println("Nhập địa chỉ: ");
        return scanner.nextLine();
    }
}
