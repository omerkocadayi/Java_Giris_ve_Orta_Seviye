import java.util.List; 
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collection;

 
public class ListTest7 {
   public static void main(String[] args) {
   
    ArrayList<String> list = new ArrayList<String>();
    list.add("1"); // 0->1
    list.add("2");  // 0->1   1->2 
    list.add("3");   // 0->1   1->2  2->3
    list.add("4");   // 0->1   1->2  2->3 3->4
    list.add(1,"5"); // insert "5" to index 1  0->1 1>5 2->2 3->3 4->4
    System.out.println("element at 2nd position: "+list.get(2)); 
      
     System.out.println(list); 
     ListIterator it = list.listIterator(); 
      
   
 
     while(it.hasNext()){  
       System.out.println(it.next());  
     }
     System.out.println("--");
      
     while(it.hasPrevious()){  
      System.out.println(it.previous());  
     }
   
  }
}
