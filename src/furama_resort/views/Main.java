package furama_resort.views;

import furama_resort.controllers.FuramaController;
import furama_resort.utils.ValidateUtil;

import java.io.IOException;
import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) throws IOException, DataFormatException {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();

    }
}
