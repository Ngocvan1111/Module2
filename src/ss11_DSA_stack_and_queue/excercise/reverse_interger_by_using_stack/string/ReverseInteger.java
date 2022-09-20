package ss11_DSA_stack_and_queue.excercise.reverse_interger_by_using_stack.string;

import java.util.Scanner;
import java.util.Stack;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần đảo ngược: ");
        String str = scanner.nextLine();
        String[] arrays = str.split(" ");
        Stack<String> stack = new Stack<>();
        for (int i = 0;i<arrays.length;i++){
            stack.push(arrays[i]);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }

    }
}
