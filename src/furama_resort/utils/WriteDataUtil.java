package furama_resort.utils;

import furama_resort.models.*;
import ss10_dsa_list.extra_excercise_1.model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteDataUtil {
    public static void writeToCustomerFile(List<Customer> customers)  {
        try {
            File file = new  File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\customer.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer s:customers) {
                bufferedWriter.write(s.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        }
    public static void writeToEmployeeFile(List<Employee> employees) {
        try {
            File file = new  File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\employee.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee s:employees) {
                bufferedWriter.write(s.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void writeToVillaFile(List<Villa> villas) {
        try {
            File file = new  File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\villa.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa s:villas) {
                bufferedWriter.write(s.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void writeToHouseFile(List<House> houses) {
        try {
            File file = new  File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\house.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (House s:houses) {
                bufferedWriter.write(s.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void writeToRoomFile(List<Room> rooms) {
        try {
            File file = new  File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\room.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Room s:rooms) {
                bufferedWriter.write(s.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void writeToBookingFile(List<Booking> bookings) {
        try {
            File file = new  File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\booking.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Booking s:bookings) {
                bufferedWriter.write(s.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void writeToContactFile(List<Contact> contacts) {
        try {
            File file = new  File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\contact.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Contact s:contacts) {
                bufferedWriter.write(s.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void writeToFacilityNeedToMaintenanceFile(List<Facility> facilities) {
        try {
            File file = new  File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\facilityNeedToMaintenance.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Facility s:facilities) {
                bufferedWriter.write(s.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
