// Fig. 16.2: CollectionTest.java
// Collection interface demonstrated via an ArrayList object.
import java.util.List;
import java.util.ArrayList;


public class ListTest3{
   public static void main(String[] args){
   
     List<String> list = new ArrayList<String>();
     
     for(int i = 0; i <=8; i++)
     {
         list.add(String.valueOf(i+2));   // list-> 2 3 4 5 6 7 8 9 10 
     }
     

                                                                              // ekran

     System.out.println("size="+list.size()); //                                 size=9
     System.out.println(list.get(5));         //                                 7
     list.set(5, "55");                     // list-> 2 3 4 5 6 55 8 9 10 
     
     System.out.println(list.get(5));     //                                     55
      System.out.println("List  :" + list);  //                                  [2 3 4 5 6 55 8 9 10]

   }
}
