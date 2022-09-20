package ss11_DSA_stack_and_queue.excercise.reverse_interger_by_using_stack.interger;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        ReverseInterger reverseInterger = new ReverseInterger();
        Integer[]arrays =  reverseInterger.createArrays();
        reverseInterger.pushElementFromArrayToStack(arrays,stack);
        reverseInterger.pushElementFromStackBackToArray( arrays,stack);
    }
}
