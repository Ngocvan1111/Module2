package furama_resort.utils;

import furama_resort.exception.*;
import furama_resort.models.Customer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidateUtil {
    private static Scanner scanner = new Scanner(System.in);
    public static String code() throws IOException {
        List<Customer> customerList = ReadEmployeeUtil.readCustomerDataFromFile();

        String code;
        while (true){
            try {

                System.out.println("Nhập mã khách hàng: ");
                code = scanner.nextLine();
                String regex = "^[E]\\d{4}";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(code);
                if(!matcher.matches()){
                    throw new CodeNameException("Sai định dạng");
                }
                for(int i = 0;i<customerList.size();i++){
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
    public static String name(){
        String name;
        while (true){
            try {
                System.out.println("Nhập tên khách hàng: ");
                name = scanner.nextLine();
                String regex = "^([A-ZĐ][a-záàảãạăâẩắằấầặẵẫêậéèẻẽẹếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+[ ])+[A-ZĐ][a-záàảãạăâẩắằấầặẵẫậéèẻẽẹếềểễệóòêỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+$";
                if(!name.matches(regex)){
                    throw new NameException("Sai định dạng!!");
                }
                break;

            }catch (NameException e){
                e.printStackTrace();
            }

        }return name;

    }
    public static LocalDate birthDay() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dayOfBirth;
        String[] dayOfBirthArr;
        int year;
        int month;
        int day;
        while (true){
            try {
                System.out.print("Nhập ngày sinh: ");
                dayOfBirth = LocalDate.parse(scanner.nextLine(),formatter);
                dayOfBirthArr = dayOfBirth.toString().split("-");
                year = Integer.parseInt(dayOfBirthArr[0]);
                month = Integer.parseInt(dayOfBirthArr[1]);
                day = Integer.parseInt(dayOfBirthArr[2]);
                if(year > LocalDate.now().getYear()){
                    throw new BirthdayException("over year now");
                }
                else if(year == LocalDate.now().getYear()){
                    if( month >  LocalDate.now().getMonthValue()){
                        throw new BirthdayException("over month now");
                    }
                    else if(month == LocalDate.now().getMonthValue()){
                        if(day > LocalDate.now().getDayOfMonth()){
                            throw new BirthdayException("over day now");
                        }
                    }
                }
                break;

            } catch (BirthdayException | DateTimeParseException e){
                System.out.println(e.getMessage());
            }

        }return dayOfBirth;
    }
    public static String gender(){
        String gender = "";
        while (true){
            try {
                System.out.println("Nhập giới tính: ");
                System.out.println("1. Male");
                System.out.println("2. Female");
                System.out.println("3. Unknow");

                int choise = Integer.parseInt(scanner.nextLine());
                InputSectionException.checkInputChoiseForGender(choise);
                switch (choise){
                    case 1:
                        gender = "Male";
                        break;
                    case 2:
                        gender = "Female";
                        break;
                    case 3:
                        gender = "Unknow";
                        break;
                }
                break;

            }catch (InputSectionException | NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
        return gender;
    }
    public static int identityCard(){
        int regex = [\\d{9}];
        int identityCard;
        while (true){
            try {
                System.out.println("Nhập CMND: ");
                identityCard = Integer.parseInt(scanner.nextLine());
                if(!identityCard.matches(regex)){
                   throw new IdentityCardException("Sai định dạng");
                }

            }catch (IdentityCardException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
