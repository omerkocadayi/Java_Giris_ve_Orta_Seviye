// Fig. 16.2: CollectionTest.java
// Collection interface demonstrated via an ArrayList object.
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;


public class ListTest5{
   public static void main(String[] args){ 
         List<String> list = new ArrayList<String>();
   
         for(int i = 0; i <5; i++)
          {
            list.add(String.valueOf(i));  
          }
           System.out.println(list);               //                           0  1  2  3  4
          
          ListIterator it = list.listIterator();   // it

             System.out.println(it.next());        //                           0     it->0
             it.next();                            // it->1
             System.out.println(it.next());        //                           2     it->2

             it.previous();                        // it->1
             
             while (it.hasNext())                  //
              {
                System.out.print(it.next()+" ");   //                            2  3  4
              } 
   }
}
