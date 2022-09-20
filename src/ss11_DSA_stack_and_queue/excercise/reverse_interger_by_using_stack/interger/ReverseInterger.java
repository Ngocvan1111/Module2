package ss11_DSA_stack_and_queue.excercise.reverse_interger_by_using_stack.interger;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseInterger {
    public static Scanner scanner = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    public Integer[] createArrays(){
        System.out.println("Nhập số phần tử của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        Integer[] array = new Integer[size];
        for(int i = 0; i < size;i++ ){
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        return array;
    }
    public Stack<Integer> pushElementFromArrayToStack(Integer[] array, Stack<Integer> stack ){
        for(int i=0;i<array.length;i++){
            stack.push(array[i]);
        }
        return stack;
    }
    public void pushElementFromStackBackToArray(Integer[] array, Stack<Integer> stack){
        int tempSize = stack.size();
        for(int i =0; i < tempSize;i++){
            array[i] = stack.pop();
        }
    }

}
