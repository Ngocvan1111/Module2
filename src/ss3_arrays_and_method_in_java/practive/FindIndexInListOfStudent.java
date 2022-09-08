package ss3_arrays_and_method_in_java.practive;

import java.util.Scanner;

public class FindIndexInListOfStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strs = {"Lại Văn N","Lại Văn A","Lại Văn B","Lại Văn C"};
        System.out.print("Enter the name need to find index: ");
        String inputValue = scanner.nextLine();
        int check = findIndex(strs,inputValue);
        if(check == -1){
            System.out.print("This name no in List of Student");
        }
        else {
            System.out.println("This name at: "+check);
        }

    }
    public static int findIndex(String[] strs, String str){
        for(int i = 0;i<strs.length;i++){
            if(strs[i].equals(str)){
                return i;
            }
        }
        return -1;

    }
}
