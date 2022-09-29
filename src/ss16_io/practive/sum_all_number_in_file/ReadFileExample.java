package ss16_io.practive.sum_all_number_in_file;

import java.io.*;

public class ReadFileExample {
    public void readFileText (String filePath){
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum =0;
            while ((line = br.readLine()) != null ){
                System.out.println(line);
                sum += Integer.parseInt(line);

            }
            System.out.println("Tổng: = "+sum);
            br.close();
        } catch (Exception e) {
            System.out.println("File khong ton tai hoac noi dung co loi!");
        }
    }

}
