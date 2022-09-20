package ss11_DSA_stack_and_queue.excercise.check_palindrome_via_queue;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.checkPalindrome(string));
    }
    public boolean checkPalindrome(String string){
        String[]arrays = string.toLowerCase().split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for(int i = 0;i<arrays.length;i++){
            stack.push(arrays[i]);
            queue.offer(arrays[i]);
        }
        for(int i = 0; i<arrays.length;i++){
            if(!stack.pop().equals(queue.poll())){
                return false;
            }
        }
        return true;

    }
}
