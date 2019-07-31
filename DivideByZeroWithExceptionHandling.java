// Fig. 11.3: DivideByZeroWithExceptionHandling.java
// Handling ArithmeticExceptions and InputMismatchExceptions.
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling
{
   // demonstrates throwing an exception when a divide-by-zero occurs
   public static int quotient(int numerator, int denominator) throws ArithmeticException
   {
      return numerator / denominator; // possible division by zero
   } 

   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in); 
      boolean continueLoop = true; // determines if more input is needed

      do
      {
         try // read two numbers and calculate quotient
         {
            System.out.print("Please enter an integer numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Please enter an integer denominator: ");
            int denominator = scanner.nextInt();
             System.out.println("Result="+ quotient(numerator, denominator) );
            continueLoop = false; // input successful; end looping
         }
         catch (InputMismatchException inputMismatchException)
         {
            System.err.printf("%nException: %s%n",inputMismatchException);
            scanner.nextLine(); // discard input so user can try again
            System.out.println("You must enter integers. Please try again.");
         }
         catch (ArithmeticException arithmeticException)
         {
            System.err.printf("%nException: %s%n", arithmeticException);
            System.out.printf("Zero is an invalid denominator. Please try again.");
         } 
        
           catch (Exception e)
         {
            System.err.printf("%nException: %s%n", e);
         }

         finally{                  
                    System.out.println("��lem sonland�.");
         } 
      } while (continueLoop); 
   } 
} // end class DivideByZeroWithExceptionHandling
