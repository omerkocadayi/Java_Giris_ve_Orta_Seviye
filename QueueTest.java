import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;



public class QueueTest {

    public static void main(String[] args) {

        Queue<String> kuyruk = new LinkedList<String>();

       kuyruk.offer("adapazar�");
       kuyruk.offer("arifiye");
       kuyruk.offer("akyaz�");
       kuyruk.offer("hendek");
       kuyruk.offer("karasu");
       kuyruk.offer("tarakl�");
       kuyruk.offer("serdivan");

      Iterator it = kuyruk.iterator();
      System.out.println("Initial Size of Queue :" + kuyruk.size());
   
      while (it.hasNext()) {
           String iteratorValue = (String) it.next();
           System.out.println("Kuyrukta sonraki ��e :" + iteratorValue);
      }

      // get value and does not remove element from queue
         System.out.println("Queue.peek() :" + kuyruk.peek());
 
      // get first value and remove that object from queue
     
     System.out.println("Queue.poll() :" + kuyruk.poll());
     System.out.println("Kuyru�un kalan ��e say�s� :" + kuyruk.size());
      System.out.println("Queue.peek() :" + kuyruk.peek());
 }  
}