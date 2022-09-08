package ss3_arrays_and_method_in_java.excercise;

import java.util.Scanner;

public class CountTheNumberOfIterationsForCharInString {
    public static void main(String[] args) {
        String str = "abcabc";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the char to check that Iterations in String\n Char = ");
        char c = scanner.nextLine().charAt(0);
        int count = 0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == c){
                count++;
            }

        }
        if(count>0){
            System.out.println("The iteration of "+c+" in string is: "+count);
        }
        else {
            System.out.println("that character is not in the string");

        }
    }
}
