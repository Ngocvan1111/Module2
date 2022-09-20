package ss10_dsa_list.extra_excercise_2.view;

import ss10_dsa_list.extra_excercise_2.controller.Controller;
import ss10_dsa_list.extra_excercise_2.service.impl.CarService;

public class Main {
    public static void main(String[] args) {
//        Controller.ManageMenu();
        CarService carService = new CarService();
        carService.addNew();
        carService.addNew();
        carService.addNew();
        carService.displayVehicle();
        carService.removeVehicle();
        carService.displayVehicle();
    }
}
