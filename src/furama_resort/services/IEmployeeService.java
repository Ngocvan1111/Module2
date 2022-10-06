package furama_resort.services;

import java.io.IOException;
import java.util.zip.DataFormatException;

public interface IEmployeeService extends InterfaceService {
    void edit() throws IOException, DataFormatException;
}
