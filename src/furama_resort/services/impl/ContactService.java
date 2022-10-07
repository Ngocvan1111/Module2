package furama_resort.services.impl;

import furama_resort.models.Booking;
import furama_resort.models.Contact;
import furama_resort.services.IBookingService;
import furama_resort.services.IContactService;
import furama_resort.utils.ReadDataUtil;
import furama_resort.utils.ValidateContactUtil;
import furama_resort.utils.WriteDataUtil;

import java.io.IOException;
import java.util.*;
import java.util.zip.DataFormatException;

public class ContactService implements IContactService {
    private static Scanner scanner = new Scanner(System.in);
    List<Booking> bookingList = ReadDataUtil.readBookingDataFromFile();
    List<Contact> contactList = new ArrayList<>();
    Queue<Booking> queueBookingList = new ArrayDeque<>() ;

    private Queue<Booking> tranfeListToQueue(List<Booking> bookingList ){
        queueBookingList = new ArrayDeque<>() ;
        for(int i =0;i<bookingList.size();i++){
            queueBookingList.offer(bookingList.get(i));
        }
        return queueBookingList;
    }
    private List<Booking> tranfeQueueToList(Queue<Booking> queueBookingList ){
        bookingList = new ArrayList<>();
        for(int i =0; i< queueBookingList.size();i++){
            bookingList.add(queueBookingList.poll());
        }
        return bookingList;

    }
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
        contactList = ReadDataUtil.readContactDataFromFile();
        System.out.println("Danh sách booking cần tạo hợp đồng: ");
        for(int i =0;i<bookingList.size();i++ ){
            System.out.println(bookingList.get(i));
        }
        Contact contact = this.getInfo();
        contactList.add(contact);
        WriteDataUtil.writeToContactFile(contactList);
        System.out.println("Thêm mới thành công ");
        Queue<Booking> queueBookingList = tranfeListToQueue(bookingList);
        queueBookingList.poll();
        List<Booking> bookingList = tranfeQueueToList(queueBookingList);
        WriteDataUtil.writeToBookingFile(bookingList);
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
        String bookingCode = ValidateContactUtil.bookingCode();
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
