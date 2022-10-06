package furama_resort.services.impl;

import furama_resort.controllers.FuramaController;
import furama_resort.models.*;
import furama_resort.services.IFacilityService;
import furama_resort.utils.ReadDataUtil;
import furama_resort.utils.ValidateRoomUtil;
import furama_resort.utils.WriteDataUtil;

import java.io.IOException;
import java.util.*;
import java.util.zip.DataFormatException;

public class FacilityService implements IFacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static LinkedHashMap<Facility, Integer> facilityLinkedList = new LinkedHashMap<>();
    static List<Villa> villaList = new ArrayList<>();
    static List<House> houseList;
    static List<Room> roomList;
    static List<Booking> bookingList;
    private static List<Facility> facilityMaintenanceList;

    public static void setData() {
        facilityLinkedList = new LinkedHashMap<>();
        villaList = ReadDataUtil.readVillaDataFromFile();
        houseList = ReadDataUtil.readHouseDataFromFile();
        roomList = ReadDataUtil.readRoomDataFromFile();
        bookingList = ReadDataUtil.readBookingDataFromFile();
        facilityMaintenanceList = ReadDataUtil.readFacilityNeedToMaintenanceDataFromFile();


        for (int i = 0; i < villaList.size(); i++) {
            facilityLinkedList.put(villaList.get(i), 0);
        }
        for (int i = 0; i < houseList.size(); i++) {
            facilityLinkedList.put(houseList.get(i), 0);
        }
        for (int i = 0; i < roomList.size(); i++) {
            facilityLinkedList.put(roomList.get(i), 0);
        }
        for (int j = 0; j < Objects.requireNonNull(bookingList).size(); j++) {
            for (Facility key : facilityLinkedList.keySet()) {
                if (bookingList.get(j).getServiceCode().equals(key.getServiceCode())) {
                    facilityLinkedList.replace(key, facilityLinkedList.get(key) + 1);
                    if (facilityLinkedList.get(key) >= 5) {
                        assert facilityMaintenanceList != null;
                        facilityMaintenanceList.add(key);
                        WriteDataUtil.writeToFacilityNeedToMaintenanceFile(facilityMaintenanceList);
//                        facilityLinkedList.remove(key);
                        if (key instanceof Villa) {
                            for (int i = 0; i < villaList.size(); i++) {
                                if (villaList.get(i).equals(key)) {
                                    villaList.remove(i);
                                    WriteDataUtil.writeToVillaFile(villaList);
                                }
                            }
                        } else if (key instanceof House) {
                            for (int i = 0; i < houseList.size(); i++) {
                                if (houseList.get(i).equals(key)) {
                                    houseList.remove(i);
                                    WriteDataUtil.writeToHouseFile(houseList);
                                }
                            }

                        } else {
                            for (int i = 0; i < roomList.size(); i++) {
                                if (roomList.get(i).equals(key)) {
                                    roomList.remove(i);
                                    WriteDataUtil.writeToRoomFile(roomList);
                                }
                            }

                        }
                    }
                }
            }
        }

    }

    @Override
    public void displayListFacilityMaintenance() {
        setData();
        for (Facility facility : facilityMaintenanceList) {
            if(facility != null){
                System.out.println(facility.toString());
            }
        }

    }


    @Override
    public void addNew() throws IOException, DataFormatException {
        System.out.println("Enter your choice: ");
        System.out.println("1. Add new villa");
        System.out.println("2. Add new house");
        System.out.println("3. Add new room");
        System.out.println("4. Back to menu");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                villaList = ReadDataUtil.readVillaDataFromFile();
                Villa villa = this.getInfoVilla();
                villaList.add(villa);
                WriteDataUtil.writeToVillaFile(villaList);
                System.out.println("Add completed");
                break;
            case 2:
                houseList = ReadDataUtil.readHouseDataFromFile();
                House house = this.getInfoHouse();
                houseList.add(house);
                WriteDataUtil.writeToHouseFile(houseList);
                System.out.println("Add completed");
                break;
            case 3:
                roomList = ReadDataUtil.readRoomDataFromFile();
                Room room = this.getInfoRoom();
                roomList.add(room);
                WriteDataUtil.writeToRoomFile(roomList);
                System.out.println("Add completed");
                break;
            case 4:
                FuramaController.menuFacilityManagement();
                break;

        }


    }

    @Override
    public void display() throws IOException {
        setData();
        for (Facility key : facilityLinkedList.keySet()) {
            if(key != null){
                System.out.println(key);
            }
        }

    }

    private Villa getInfoVilla() {
        Villa villa = new Villa();
        return villa;
    }

    private House getInfoHouse() {
        House house = new House();
        return house;
    }

    private Room getInfoRoom() {
        String serviceCode = ValidateRoomUtil.serviceCode();
        String serviceName = ValidateRoomUtil.serviceName();
        Double area = ValidateRoomUtil.area();
        Double price = ValidateRoomUtil.price();
        int people = ValidateRoomUtil.maxPeople();
        System.out.println("Input rental types");
        String rentalTypes = scanner.nextLine();
        System.out.println("Input promotionService: ");
        String promotionService = scanner.nextLine();
        Room room = new Room(serviceCode,serviceName,area,price,people,rentalTypes,promotionService);
        return room;
    }
}

