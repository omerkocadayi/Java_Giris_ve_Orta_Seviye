// Fig. 16.15: PriorityQueueTest.java
// PriorityQueue test program.
import java.util.PriorityQueue;

public class PriorityQueueTest 
{
   public static void main(String[] args) 
   {
 
      PriorityQueue<Double> queue = new PriorityQueue<>();

      // insert elements to queue
      queue.offer(1.0);      System.out.println(queue); // view  elements of Queue
      queue.offer(165.0);    System.out.println(queue); // view  elements of Queue
      queue.offer(125.0);    System.out.println(queue); // view  elements of Queue
      queue.offer(109.0);    System.out.println(queue); // view  elements of Queue
       System.out.println(queue); // view  elements of Queue
      System.out.println(queue.peek()); // view top element
     
      System.out.print("Polling from queue: ");

      // display elements in queue
      while (queue.size() > 0)
      {
         System.out.printf("%.1f ", queue.peek()); // view top element
         queue.poll(); // remove top element
      }
      System.out.println();
      System.out.println("elements="+queue); // view  elements of Queue 
   } 
} // end class PriorityQueueTest


