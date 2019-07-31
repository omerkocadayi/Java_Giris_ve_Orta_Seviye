// Fig. 16.3: ListTest.java
// Lists, LinkedLists and ListIterators.
import java.util.List;
import java.util.LinkedList;

public class ListTest8
{
   public static void main(String[] args)
   {
      String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
      List<String> list = new LinkedList<>();   
      print(list); // print list elements
      for (String color : colors) // color="black yellow green blue violet silver"
       list.add(color);
       print(list); // print list elements
       list.subList(0,3).clear();

       print(list); // print list elements
   }                                     

   private static void print(List<String> list)
   {
        
      for (String color : list)
         System.out.printf("%s ", color);
         System.out.println();
   }  

} 