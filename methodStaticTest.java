class Class{
  public static double a; 
  public Class(){a=1.1; }
  public  static void print(){
      a++;
      System.out.println("a="+a--);
      a++;
  }
}


public class methodStaticTest 
{
   
   public static void main(String[] args) 
   { 
    Class obj0=new Class();
    obj0.print();
    Class.a=1.12;
    obj0.print();
    Class.print();
   } 
}

