package furama_resort.services;

import java.io.IOException;
import java.util.zip.DataFormatException;

public interface InterfaceService {
    void addNew() throws IOException, DataFormatException;
    void display() throws IOException;

}
