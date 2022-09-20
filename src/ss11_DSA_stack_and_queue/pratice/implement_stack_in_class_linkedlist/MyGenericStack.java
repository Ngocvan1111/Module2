package ss11_DSA_stack_and_queue.pratice.implement_stack_in_class_linkedlist;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList();

    }

    public void push(T element){
        stack.addFirst(element);
    }
    public T peek(){
        return stack.peek();
    }
    public T pop(){
        if(isEmpty()){
            throw  new EmptyStackException();
        }
        else
            return stack.removeFirst();
    }
    public T get(){
        if(stack.size()>0){
            return   stack.getFirst();
        }
        else  return null;
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if(stack.size()==0){
            return true;
        }
        else return false;
    }
}
