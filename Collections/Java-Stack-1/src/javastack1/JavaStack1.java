
package javastack1;

import java.util.Stack;


public class JavaStack1 {

    
    public static void main(String[] args) {
        
        //Create a stack
        Stack <Integer> stack = new Stack <Integer>();
        
        //Stack status
        System.out.println("Empty stack: " + stack);
        System.out.println("Is the stack empty?: " + stack.isEmpty());
        
        //Add elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        //Show all the stack's elements
        for (Integer i : stack) {
            System.out.println(i);
        }
        
        //Stack status
        System.out.println("Stack: " + stack);
        System.out.println("Is the stack empty?: " + stack.isEmpty());
        
        //Delete the last item
        stack.pop();
        
        //Search an item
        System.out.println("Is the item 3?: " + stack.search(3));
        
        //Last item added
        System.out.println("Last added: " + stack.peek());
    }
    
}
