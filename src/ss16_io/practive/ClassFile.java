package ss16_io.practive;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class ClassFile {
    public static void main(String[] args) throws IOException {

        File dir = new File("Books"); dir.mkdir();
        File f = new File("Books/foo.txt");
        if(dir.isDirectory()){
            String[] dirContents = dir.list();
            for(int i = 0; i < Objects.requireNonNull(dirContents).length; i++){
                System.out.println(dirContents[i]);
            }
        }
        System.out.println(dir.getAbsolutePath());

    }
}
