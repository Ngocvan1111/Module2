package ss11_DSA_stack_and_queue.pratice.implement_stack_in_class_linkedlist;

import ss10_dsa_list.excercise.array_list.MyArraysList;

import java.util.LinkedList;

public class GenericStackClient {
    public void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        MyGenericStack<String> stack1 = new MyGenericStack();
        stack.push("Lại");
        stack.push("Văn");
        stack.push("Ngọc");
        System.out.println("1.1 Size of stack after push operation: "+stack.size() );
        System.out.println("1.2 Pop elements from stack : ");
        while (!stack.isEmpty()){
            stack1.push(stack.get());
            System.out.printf("%s",stack.pop());
            System.out.println("//////////////////////");
        }
        System.out.println("\n1.3. Size of stack after pop operation: "+stack.size());
        while (!stack1.isEmpty()){
            System.out.printf("%s",stack1.pop());
            System.out.println("//////////////////////");
        }

    }
    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }

    public static void main(String[] args) {
        GenericStackClient genericStackClient = new GenericStackClient();
        genericStackClient.stackOfStrings();
    }
}

