// Fig. 16.2: CollectionTest.java
// Collection interface demonstrated via an ArrayList object.
import java.util.List;
import java.util.ArrayList;


public class ListTest4{
   public static void main(String[] args){
   
     List<String> list = new ArrayList<String>();  
     
     for(int i = 0; i <=7; i++)
     {
         list.add(String.valueOf(i+2));
     }

      System.out.println("first element of list="+list.get(0));
      System.out.println(list);
      for (int i = 0; i < list.size(); i++) {
          System.out.print(list.get(i)+" ");
      }
       System.out.println();
      
       for (String string : list) {
          System.out.print(string+" ");
       } 
       
   }
}
