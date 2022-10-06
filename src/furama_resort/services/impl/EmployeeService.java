package furama_resort.services.impl;


import furama_resort.models.Employee;
import furama_resort.services.IEmployeeService;
import furama_resort.utils.ReadDataUtil;

import furama_resort.utils.ValidateEmployeeUtil;
import furama_resort.utils.WriteDataUtil;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeService implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void addNew()  {
        employeeList = ReadDataUtil.readEmployeeDataFromFile();
        Employee employee = this.getInfor();
        employeeList.add(employee);
        WriteDataUtil.writeToEmployeeFile(employeeList);


    }

    @Override
    public void display() {
        employeeList = ReadDataUtil.readEmployeeDataFromFile();
        if(employeeList !=null) {
            if (employeeList.size() == 0) {
                System.out.println("Danh sách trống !!!");
            } else {
                for (Employee employee : employeeList) {
                    System.out.println(employee.toString());
                }

            }
        }


    }

    @Override
    public void edit()  {
        employeeList = ReadDataUtil.readEmployeeDataFromFile();
        System.out.println("Nhập mã khách hàng cần chỉnh sửa: ");
        String code = scanner.nextLine();
        boolean flag = true;
        for(int i = 0; i< employeeList.size(); i++){
            if(employeeList.get(i).getCode().equals(code)){
                Employee employee = this.getInfor();
                employeeList.set(i,employee);
                System.out.println("Thông tin khách hàng đã được sửa !!!");
                WriteDataUtil.writeToEmployeeFile(employeeList);
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Không có thông tin khách hàng cần chỉnh sửa !!!!");
        }


    }
    private Employee getInfor() {
        String code =  ValidateEmployeeUtil.code();
        String name = ValidateEmployeeUtil.name();
        LocalDate birthDay = ValidateEmployeeUtil.birthDay();
        String gender = ValidateEmployeeUtil.gender();
        int identityCard = ValidateEmployeeUtil.identityCard();
        int phoneNumber = ValidateEmployeeUtil.phoneNumber();
        String email = ValidateEmployeeUtil.email();
        String level = ValidateEmployeeUtil.level();
        String position = ValidateEmployeeUtil.position();
        double salary = ValidateEmployeeUtil.salary();
        Employee employee = new Employee(code,name,birthDay,gender,identityCard,phoneNumber,email,level,position,salary);
        return employee;

    }

}

