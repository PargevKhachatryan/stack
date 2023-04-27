package stack;

import java.util.ArrayList;
import java.util.List;

/**

 A generic stack implementation using a List.
 @param <T> the type of element in the stack.

 */
public class GenericStack<T> {
    List<T> stack = new ArrayList<>();

    /**

     Returns whether the stack is empty.
     @return true if the stack is empty, false otherwise
     */
    boolean empty() {
        return stack.size() == 0;
    }

    /**

     Adds an element to the top of the stack.
     @param element the element to be added
     */
    void push(T element){
        stack.add(element);
    }

    /**

     Removes the top element from the stack.
     @throws RuntimeException if the stack is empty
     */
    void pop(){
        if(empty()){
            throw new RuntimeException("Stack is empty!");
        }
        stack.remove(stack.size() - 1);
    }

    /**

     Returns the top element of the stack without removing it.
     @return the top element of the stack
     @throws RuntimeException if the stack is empty
     */
    T peek(){
        if(empty()){
            throw new RuntimeException("Stack is empty!");
        }
        return stack.get(stack.size() -1);
    }


}
