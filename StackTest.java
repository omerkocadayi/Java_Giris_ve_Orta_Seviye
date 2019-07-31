// Fig. 16.14: StackTest.java
// Stack class of package java.util.
import java.util.Stack;
import java.util.EmptyStackException;
public class StackTest 
{
   public static void main(String[] args)
   {
      Stack<Number> stack = new Stack<>(); // create a Stack   // stack

      stack.push(15);                                          //  15

      stack.push(25);                                          //  15 25

      System.out.println(stack);                               //          output 15 25
     
      stack.push(25);                                          // 15 25 25
 
      stack.push(35.5);                                        // 15 25 25 35.5
     
      stack.push(45);                                          // 15 25 25 35.5 45 
    
      stack.pop();                                             // 15 25 25 35.5
      
      System.out.println(stack);                               //         output 15 25 25 35.5
   } 

} // end class StackTest


