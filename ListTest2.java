// Fig. 16.2: CollectionTest.java
// Collection interface demonstrated via an ArrayList object.
import java.util.List;
import java.util.ArrayList;


public class ListTest2{
   public static void main(String[] args){
   
     List<String> list1 = new ArrayList<String>();
     List<String> list2 = new ArrayList<String>();
    
      

     for(int i = 0; i <=4; i++)
     {
         list1.add(String.valueOf(i));
     }
       
      list1.add(String.valueOf(25));
     
     for(int i = 0; i <=7; i++)
     {
         list2.add(String.valueOf(i));
     }

       System.out.println("List 1 :" + list1);
       System.out.println("List 2 :" + list2);
      
       list1.retainAll(list2);

       System.out.println("List 1 :" + list1);
       System.out.println("List 2 :" + list2); 
 
       list2.add(String.valueOf(75));
     System.out.println("List 1 :" + list1);
     System.out.println("List 2 :" + list2);
   
   }
}
