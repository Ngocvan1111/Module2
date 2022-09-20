package ss11_DSA_stack_and_queue.excercise.check_brackets_in_expressions_using_stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        if (Bracket.checkUseBraketAtFirstAndLast(str) && Bracket.checkUseBraket(str, stack, queue)) {
            System.out.println("Used bracket is ok!!");
        } else System.out.println("Used bracket is not ok !! please fix");

    }

    public static boolean checkUseBraketAtFirstAndLast(String str) {
        String[] arrays = str.split("");
        if ((arrays[0].equals(")") || arrays[0].equals("(")) && (arrays[arrays.length - 1].equals(")") || arrays[arrays.length - 1].equals("("))) {
            return false;
        }
        return true;
    }

    public static boolean checkUseBraket(String str, Stack<String> stack, Queue<String> queue) {
        String[] arrays = str.split("");
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].equals("(") || arrays[i].equals(")")) {
                stack.add(arrays[i]);
                queue.offer(arrays[i]);
            }
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            if (stack.pop().equals(queue.poll())) {
                return false;
            }
        }
        return true;
    }
}
