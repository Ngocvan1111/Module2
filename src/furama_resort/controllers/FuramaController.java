package furama_resort.controllers;

import furama_resort.services.impl.CustomerService;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
  public void displayMainMenu() throws IOException {
      CustomerService customerService = new CustomerService();

      while (true){
          System.out.println("***** RESORT FURAMA MANAGEMENT APPLICATION *****");
          System.out.println("Select option by number!!");
          System.out.println("1. Employee Management");
          System.out.println("2. Customer Management");
          System.out.println("3. Facility Management");
          System.out.println("4. Booking Management");
          System.out.println("5. Promotion Management");
          System.out.println("6. Exit");
          System.out.print("Select option: ");
          int choise = Integer.parseInt(scanner.nextLine());
          switch (choise){
              case 1:
                  choise =  menuEmployeeManagement();
                  switch (choise){
                      case 1:
                          break;
                      case 2:
                          break;
                      case 3:
                          break;
                      case 4:
                          displayMainMenu();
                  }break;
              case 2:
                  choise = menuCustomerManagement();
                  switch (choise){
                      case 1:
                          customerService.display();
                          break;
                      case 2:
                          customerService.addNew();
                          break;
                      case 3:
                          customerService.edit();
                          break;
                      case 4:
                          displayMainMenu();
                  }break;
              case 3:
                  choise = menuFacilityManagement();
                  switch (choise){
                      case 1:
                          break;
                      case 2:
                          break;
                      case 3:
                          break;
                      case 4:
                          displayMainMenu();
                  }break;
              case 4:
                  choise = menuBookingManagerment();
                  switch (choise){
                      case 1:
                          break;
                      case 2:
                          break;
                      case 3:
                          break;
                      case 4:
                          break;
                      case 5:
                          break;
                      case 6:
                          displayMainMenu();
                  }break;
              case 5:
                  choise = menuPromotionManagement();
                  switch (choise){
                      case 1:
                          break;
                      case 2:
                          break;
                      case 3:
                          displayMainMenu();
                  }break;
              case 6:
                  System.exit(0);

          }
      }
  }
  public static int menuEmployeeManagement(){
      System.out.println("1. Display list employees");
      System.out.println("2. Add new employee");
      System.out.println("3. Edit employee");
      System.out.println("4. Return main menu");
      return Integer.parseInt(scanner.nextLine());

  }
  public static int menuCustomerManagement(){
      System.out.println("1. Dislay list customers");
      System.out.println("2. Add new customer");
      System.out.println("3. Edit customer");
      System.out.println("4. Return main menu");
      return Integer.parseInt(scanner.nextLine());
  }
  public static int menuFacilityManagement(){
      System.out.println("1. Display list facility");
      System.out.println("2. Add mew facility");
      System.out.println("3. Display list facility maintenance");
      System.out.println("4. Return main menu");
      return Integer.parseInt(scanner.nextLine());
  }
  public static int menuBookingManagerment(){
      System.out.println("1. Add new booking");
      System.out.println("2. Display list booking");
      System.out.println("3. Create new constracts");
      System.out.println("4. Display list contracts");
      System.out.println("5. Edit contracts");
      System.out.println("6. Return main menu");
      return Integer.parseInt(scanner.nextLine());
  }
  public static int menuPromotionManagement(){
      System.out.println("1. Display list customers use service");
      System.out.println("2. Display list customers get voucher");
      System.out.println("3. Return main menu");
      return Integer.parseInt(scanner.nextLine());
  }
}
