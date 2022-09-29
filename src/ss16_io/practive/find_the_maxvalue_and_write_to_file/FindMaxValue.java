package ss16_io.practive.find_the_maxvalue_and_write_to_file;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for(int i = 0;i < numbers.size();i++){
            if(max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("number.txt");
        int maxValue = FindMaxValue.findMax(numbers);
        readAndWriteFile.writeFile("result.txt",maxValue);
    }
}
