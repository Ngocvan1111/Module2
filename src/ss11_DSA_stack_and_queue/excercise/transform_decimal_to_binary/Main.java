package ss11_DSA_stack_and_queue.excercise.transform_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thập phân: ");
        int n = Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack = new Stack<>();
        Tranformation tranformation = new Tranformation();
        stack = tranformation.transformDecimalToBinary(n, stack);
        System.out.print("Số nhị phân là: ");
        while (stack.size() != 0){
            System.out.print(stack.pop());
        }

    }
}
