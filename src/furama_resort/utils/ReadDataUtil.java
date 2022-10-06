package furama_resort.utils;

import furama_resort.models.*;
import ss10_dsa_list.extra_excercise_1.model.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadDataUtil {
    public static List<Customer> readCustomerDataFromFile() {

        try{
            List<Customer> customerList = new ArrayList<>();
            File file = new File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\customer.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            String[] customerArrays;
            while ((line = bufferedReader.readLine()) != null){
                customerArrays = line.split(",");
                customerList.add(new Customer(customerArrays[0],customerArrays[1], LocalDate.parse(customerArrays[2]) ,customerArrays[3],Integer.parseInt(customerArrays[4]), Integer.parseInt(customerArrays[5]),customerArrays[6],customerArrays[7],customerArrays[8]));
            }
            bufferedReader.close();
            fileReader.close();
            return customerList;

        }catch (IOException e){
            System.out.println("Danh sách rỗng");
        }
        return null;

    }
    public static List<Employee> readEmployeeDataFromFile() {

        try{
            List<Employee> employeeList = new ArrayList<>();
            File file = new File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\employee.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            String[] employeeArray;
            while ((line = bufferedReader.readLine()) != null){
                employeeArray = line.split(",");
                employeeList.add(new Employee(employeeArray[0],employeeArray[1], LocalDate.parse(employeeArray[2]) ,employeeArray[3],Integer.parseInt(employeeArray[4]), Integer.parseInt(employeeArray[5]),employeeArray[6],employeeArray[7],employeeArray[8],Double.parseDouble(employeeArray[9])));
            }
            bufferedReader.close();
            fileReader.close();
            return employeeList;

        }catch (IOException e){
            System.out.println("Danh sách rỗng");
        }
        return null;

    }
    public static List<Villa> readVillaDataFromFile() {

        try{
            List<Villa> villaList = new ArrayList<>();
            File file = new File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\villa.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            String[] villaArray;
            while ((line = bufferedReader.readLine()) != null){
                villaArray = line.split(",");
                villaList.add(new Villa(villaArray[0],villaArray[1],Double.parseDouble(villaArray[2]), Double.parseDouble(villaArray[3]) ,Integer.parseInt(villaArray[4]), villaArray[5],villaArray[6],Double.parseDouble(villaArray[7]),Integer.parseInt(villaArray[8])));
            }
            bufferedReader.close();
            fileReader.close();
            return villaList;

        }catch (IOException e){
            System.out.println("Danh sách rỗng");
        }
        return null;

    }
    public static List<House> readHouseDataFromFile() {

        try{
            List<House> houseList = new ArrayList<>();
            File file = new File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\house.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            String[] houseArray;
            while ((line = bufferedReader.readLine()) != null){
                houseArray = line.split(",");
                houseList.add(new House(houseArray[0],houseArray[1],Double.parseDouble(houseArray[2]), Double.parseDouble(houseArray[3]) ,Integer.parseInt(houseArray[4]), houseArray[5],houseArray[6],Integer.parseInt(houseArray[7])));
            }
            bufferedReader.close();
            fileReader.close();
            return houseList;

        }catch (IOException e){
            System.out.println("Danh sách rỗng");
        }
        return null;

    }
    public static List<Room> readRoomDataFromFile() {

        try{
            List<Room> roomList = new ArrayList<>();
            File file = new File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\room.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            String[] roomArray;
            while ((line = bufferedReader.readLine()) != null){
                roomArray = line.split(",");
                roomList.add(new Room(roomArray[0],roomArray[1],Double.parseDouble(roomArray[2]), Double.parseDouble(roomArray[3]) ,Integer.parseInt(roomArray[4]), roomArray[5],roomArray[6]));
            }
            bufferedReader.close();
            fileReader.close();
            return roomList;

        }catch (IOException e){
            System.out.println("Danh sách rỗng");
        }
        return null;

    }
    public static List<Booking> readBookingDataFromFile() {

        try{
            List<Booking> bookingList = new ArrayList<>();
            File file = new File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\booking.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            String[] bookingArray;
            while ((line = bufferedReader.readLine()) != null){
                bookingArray = line.split(",");
                bookingList.add(new Booking(bookingArray[0],bookingArray[1], bookingArray[2],bookingArray[3], bookingArray[4],bookingArray[5]));
            }
            bufferedReader.close();
            fileReader.close();
            return bookingList;

        }catch (IOException e){
            System.out.println("Danh sách rỗng !!!");
        }
        return null;

    }
    public static List<Contact> readContactDataFromFile() {

        try{
            List<Contact> contactList = new ArrayList<>();
            File file = new File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\contact.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            String[] contactArray;
            while ((line = bufferedReader.readLine()) != null){
                contactArray = line.split(",");
                contactList.add(new Contact(Integer.parseInt(contactArray[0]),contactArray[1],Double.parseDouble(contactArray[2]),Double.parseDouble(contactArray[3]) , contactArray[4]));
            }
            bufferedReader.close();
            fileReader.close();
            return contactList;

        }catch (IOException e){
            System.out.println("Danh sách contact rỗng");
        }
        return null;

    }
    public static List<Facility> readFacilityNeedToMaintenanceDataFromFile() {

        try{
            List<Facility> facilityList = new ArrayList<>();
            Villa villa = new Villa();
            House house = new House();
            File file = new File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\facilityNeedToMaintenance.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            String[] facilityArray;
            while ((line = bufferedReader.readLine()) != null){
                facilityArray = line.split(",");
                if(line.contains(villa.getServiceCode())){
                    facilityList.add(new Villa(facilityArray[0],facilityArray[1],Double.parseDouble(facilityArray[2]), Double.parseDouble(facilityArray[3]) ,Integer.parseInt(facilityArray[4]), facilityArray[5],facilityArray[6],Double.parseDouble(facilityArray[7]),Integer.parseInt(facilityArray[8])));
                }
                else if(line.contains(house.getServiceCode())){
                    facilityList.add(new House(facilityArray[0],facilityArray[1],Double.parseDouble(facilityArray[2]), Double.parseDouble(facilityArray[3]) ,Integer.parseInt(facilityArray[4]), facilityArray[5],facilityArray[6],Integer.parseInt(facilityArray[7])));
                }
                else {
                    facilityList.add(new Room(facilityArray[0],facilityArray[1],Double.parseDouble(facilityArray[2]), Double.parseDouble(facilityArray[3]) ,Integer.parseInt(facilityArray[4]), facilityArray[5],facilityArray[6]));
                }
            }
            bufferedReader.close();
            fileReader.close();
            return facilityList;

        }catch (NullPointerException e){
            System.out.println("Danh sách villa rỗng");
        }
        catch (IOException e){
            System.out.println("Danh sách rỗng");
        }
        return null;

    }
}
