import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;



public class QueueTest {

    public static void main(String[] args) {

        Queue<String> kuyruk = new LinkedList<String>();

       kuyruk.offer("adapazarý");
       kuyruk.offer("arifiye");
       kuyruk.offer("akyazý");
       kuyruk.offer("hendek");
       kuyruk.offer("karasu");
       kuyruk.offer("taraklý");
       kuyruk.offer("serdivan");

      Iterator it = kuyruk.iterator();
      System.out.println("Initial Size of Queue :" + kuyruk.size());
   
      while (it.hasNext()) {
           String iteratorValue = (String) it.next();
           System.out.println("Kuyrukta sonraki öðe :" + iteratorValue);
      }

      // get value and does not remove element from queue
         System.out.println("Queue.peek() :" + kuyruk.peek());
 
      // get first value and remove that object from queue
     
     System.out.println("Queue.poll() :" + kuyruk.poll());
     System.out.println("Kuyruðun kalan öðe sayýsý :" + kuyruk.size());
      System.out.println("Queue.peek() :" + kuyruk.peek());
 }  
}