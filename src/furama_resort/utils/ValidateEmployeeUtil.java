package furama_resort.utils;

import furama_resort.exception.*;
import furama_resort.models.Customer;
import furama_resort.models.Employee;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmployeeUtil extends ValidateUtil{
    private static Scanner scanner = new Scanner(System.in);
    public static String code()  {

        List<Customer> customerList = ReadDataUtil.readCustomerDataFromFile();

        String code;
        while (true){
            try {

                System.out.println("Nhập mã nhân viên: ");
                code = scanner.nextLine();
                String regex = "^[E]\\d{4}";
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
    public static int identityCard()  {
        List<Employee> employeeList = ReadDataUtil.readEmployeeDataFromFile();
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
                for (int i = 0; i< Objects.requireNonNull(employeeList).size(); i++){
                    if(employeeList.get(i).getIdentityCard() == (identityCard)){
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
        List<Employee> employeeList = ReadDataUtil.readEmployeeDataFromFile();
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
                for (int i = 0; i< Objects.requireNonNull(employeeList).size(); i++){
                    if(employeeList.get(i).getPhoneNumber() == (phoneNumber)){
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
    public static String level(){
        String level = "";
        int choice;
        while (true){
            System.out.println("Chọn trình độ nhân viên: ");
            System.out.println("1. Secondary school");
            System.out.println("2. College");
            System.out.println("3. University");
            System.out.println("4. Master's degree");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                InputSectionException.checkInputChoiceLevelOfEmployee(choice);
                switch (choice){
                    case 1:
                        level = "Secondary";
                        break;
                    case 2:
                        level = "College";
                        break;
                    case 3:
                        level = "University";
                    case 4:
                        level = "Master's degree";
                        break;
                }
                break;
            }
            catch (InputSectionException | NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }return level;

    }
    public static String position(){
        String position = "";
        int choice;
        while (true){
            System.out.println("Chọn vị trí làm việc của nhân viên: ");
            System.out.println("1. Receptionist staff");
            System.out.println("2. Service staff");
            System.out.println("3. Expert staff");
            System.out.println("4. Supervisory staff");
            System.out.println("5. Management staff");
            System.out.println("6. Director");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                InputSectionException.checkInputChoicePositionOfEmployee(choice);
                switch (choice){
                    case 1:
                        position = "Receptionist staff";
                        break;
                    case 2:
                        position = "Service staff";
                        break;
                    case 3:
                        position = "Expert staff";
                        break;
                    case 4:
                        position = "Supervisory staff";
                        break;
                    case 5:
                        position = "Management staff";
                        break;
                    case 6:
                        position = "Director";
                        break;
                }
                break;
            }
            catch (InputSectionException | NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }return position;

    }
    public static double salary(){
        double salary;
        while (true){
            try {
                System.out.println("Nhập lương nhân viên: ");
                salary = Double.parseDouble(scanner.nextLine());
                SalaryException.checkSalary(salary);
                break;

            }catch (SalaryException | NumberFormatException e){
                System.out.println(e.getMessage());
            }


        }return salary;
    }

}
