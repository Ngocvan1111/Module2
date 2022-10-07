package furama_resort.controllers;

import furama_resort.services.*;
import furama_resort.services.impl.*;

import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
  public void displayMainMenu() throws IOException, DataFormatException {
      ICustomerService customerService = new CustomerService();
      IEmployeeService employeeService = new EmployeeService();
      IFacilityService facilityService = new FacilityService();
      IBookingService bookingService = new BookingService();
      IContactService contactService = new ContactService();
      IPromotionService promotionService = new PromotionService();

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
                  while (true){
                      choise =  menuEmployeeManagement();
                      switch (choise){
                          case 1:
                              employeeService.display();
                              break;
                          case 2:
                              employeeService.addNew();
                              break;
                          case 3:
                              employeeService.edit();
                              break;
                          case 4:
                              displayMainMenu();
                      }

                  }
              case 2:
                  while (true){
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
                      }

                  }

              case 3:
                  while (true){
                      choise = menuFacilityManagement();
                      switch (choise){
                          case 1:
                              facilityService.display();
                              break;
                          case 2:
                              facilityService.addNew();
                              break;
                          case 3:
                              facilityService.displayListFacilityMaintenance();
                              break;
                          case 4:
                              displayMainMenu();
                      }

                  }

              case 4:
                  while (true){
                      choise = menuBookingManagement();
                      switch (choise){
                          case 1:
                              bookingService.addNew();
                              break;
                          case 2:
                              bookingService.display();
                              break;
                          case 3:
                              contactService.addNew();
                              break;
                          case 4:
                              contactService.display();
                              break;
                          case 5:
                              contactService.edit();
                              break;
                          case 6:
                              displayMainMenu();
                      }

                  }

              case 5:
                  while (true){
                      choise = menuPromotionManagement();
                      switch (choise){
                          case 1:
                              promotionService.displayCustomerListUseYearService();
                              break;
                          case 2:
                              promotionService.displayCustomerListGetVoucher();
                              break;
                          case 3:
                              promotionService.offerPromotionalVouchers();
                              break;
                          case 4:
                              displayMainMenu();
                      }
                  }

              case 6:
                  System.exit(0);

          }
      }
  }
  public static int menuEmployeeManagement(){
      System.out.println("***** MENU EMPLOYEE MANAGEMENT *****");
      System.out.println("Select option by number!!");
      System.out.println("1. Display list employees");
      System.out.println("2. Add new employee");
      System.out.println("3. Edit employee");
      System.out.println("4. Return main menu");
      System.out.print("Select option: ");
      return Integer.parseInt(scanner.nextLine());

  }
  public static int menuCustomerManagement(){
      System.out.println("***** MENU CUSTOMER MANAGEMENT *****");
      System.out.println("Select option by number!!");
      System.out.println("1. Display list customers");
      System.out.println("2. Add new customer");
      System.out.println("3. Edit customer");
      System.out.println("4. Return main menu");
      System.out.print("Select option: ");
      return Integer.parseInt(scanner.nextLine());
  }
  public static int menuFacilityManagement(){
      System.out.println("***** MENU FACILITY MANAGEMENT *****");
      System.out.println("Select option by number!!");
      System.out.println("1. Display list facility");
      System.out.println("2. Add mew facility");
      System.out.println("3. Display list facility maintenance");
      System.out.println("4. Return main menu");
      System.out.print("Select option: ");
      return Integer.parseInt(scanner.nextLine());
  }
  public static int menuBookingManagement(){
      System.out.println("***** MENU BOOKING MANAGEMENT *****");
      System.out.println("Select option by number!!");
      System.out.println("1. Add new booking");
      System.out.println("2. Display list booking");
      System.out.println("3. Create new constracts");
      System.out.println("4. Display list contracts");
      System.out.println("5. Edit contracts");
      System.out.println("6. Return main menu");
      System.out.print("Select option: ");
      return Integer.parseInt(scanner.nextLine());
  }
  public static int menuPromotionManagement(){
      System.out.println("***** MENU PROMOTION MANAGEMENT *****");
      System.out.println("Select option by number!!");
      System.out.println("1. Display list customers use service");
      System.out.println("2. Display list customers get voucher");
      System.out.println("3. Offer promotional vouchers");
      System.out.println("4. Return main menu");
      System.out.print("Select option: ");
      return Integer.parseInt(scanner.nextLine());
  }
}
