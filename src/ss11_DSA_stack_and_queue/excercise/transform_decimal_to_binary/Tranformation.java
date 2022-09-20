package ss11_DSA_stack_and_queue.excercise.transform_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class Tranformation {
    public static Scanner scanner = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    public Stack<Integer> transformDecimalToBinary(Integer n, Stack<Integer> stack ){
        while (n != 0){
            int temp = n%2;
            stack.add(temp);
            n = (int)(n/2);
        }
        return stack;
    }
}
