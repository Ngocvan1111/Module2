package furama_resort.views;

import furama_resort.controllers.FuramaController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}
