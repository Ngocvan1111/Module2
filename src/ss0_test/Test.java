package ss0_test;

import furama_resort.exception.DayInputException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String [] args)     {
        Scanner scanner = new Scanner(System.in);
        String str;
        do{
            System.out.println(" nhaapj");
            str = scanner.nextLine();
        }while (!addDayBirth(str));
        System.out.println(str);
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd/MM/yyyy HH");
        LocalDate birthDay = LocalDate.parse(str,formatter);
        LocalDate nowsub = LocalDate.now();
        if(birthDay.compareTo(LocalDate.now()) < 10){
            System.out.println("sai");
        }



   
    }
    private static boolean addDayBirth(String targe ) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH");
       simpleDateFormat.setLenient(false);
       try{
           simpleDateFormat.parse(targe);
           return true;
       }catch (ParseException e){
    }return false;
}}
