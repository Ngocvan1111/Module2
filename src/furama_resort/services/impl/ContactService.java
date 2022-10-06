package furama_resort.services.impl;

import furama_resort.models.Contact;
import furama_resort.services.IBookingService;
import furama_resort.services.IContactService;
import furama_resort.utils.ReadDataUtil;
import furama_resort.utils.WriteDataUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class ContactService implements IContactService {
    IBookingService bookingService = new BookingService();
    List<Contact> contactList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void edit() {
        contactList = ReadDataUtil.readContactDataFromFile();
        System.out.println("Nhập số hợp đồng muốn chỉnh sửa: ");
        int numberContact = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<contactList.size();i++){
            if(contactList.get(i).getNumberContact() == numberContact){
                Contact contact = this.getInfo();
                contactList.set(i,contact);
                WriteDataUtil.writeToContactFile(contactList);
                System.out.println("Chỉnh sửa thành công !!!");
            }
        }

    }

    @Override
    public void addNew() throws IOException, DataFormatException {
        System.out.println("Danh sách booking cần tạo hợp đồng: ");
        bookingService.display();
        contactList = ReadDataUtil.readContactDataFromFile();
        Contact contact = this.getInfo();
        contactList.add(contact);
        WriteDataUtil.writeToContactFile(contactList);
        System.out.println("Thêm mới thành công ");
    }

    @Override
    public void display() throws IOException {
        contactList = ReadDataUtil.readContactDataFromFile();
        if(contactList != null){
            if(contactList.size() == 0){
                System.out.println("Danh sách rỗng");
            }
            else {
                for(Contact contact:contactList){
                    System.out.println(contact.toString());
                }
            }
        }


    }
    private Contact getInfo(){
        System.out.println("Nhập số hợp đồng");
        int numberContact = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mã booking");
        String bookingCode = scanner.nextLine();
        System.out.println("Nhập tiền đặt cọc");
        Double depositAmount =Double.parseDouble(scanner.nextLine()) ;
        System.out.println("Nhập tổng số tiền phải thanh toán ");
        Double totalPayment = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập mã khách hàng ");
        String customerCode = scanner.nextLine();
        Contact contact = new Contact(numberContact,bookingCode,depositAmount,totalPayment,customerCode);
        return contact;

    }
}
