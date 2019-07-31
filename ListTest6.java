// Fig. 16.2: CollectionTest.java
// Collection interface demonstrated via an ArrayList object.
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;


public class ListTest6{
   public static void main(String[] args){ 
         List<String> list = new ArrayList<String>();
   
         for(int i = 0; i <=5; i++)
          {                                           //       list
            list.add(String.valueOf(i));             //  0  1  2  3  4  5
          }
  
           for (String string : list) {
              System.out.print(string+" ");        // output 0 1 2 3 4 5
           }

           System.out.println();                  //

           ListIterator it = list.listIterator(); // it->list  

            it.next();                             // it->0  
            it.next();                             // it->1
            it.previous();                         // it->0
    
           while (it.hasNext())                   // true
           {
           System.out.print(it.next()+" ");       // output  1 2 3 4 5
           } 

   }
}
