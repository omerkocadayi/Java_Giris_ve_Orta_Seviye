class A{
 public static int x;
 public static int y;
 A() { 
      System.out.println("DC run");
      x--;
      System.out.println(x+" "+y );
     }
    public  static void disp(){
     x++;
     y--;
      System.out.println(x+" "+y );
  }
}

public class StaticTest{
  public static void main(String[] arg){
    A a0= new A();
    A a1 = new A();
    A.x=55;
    System.out.println(A.x);
      a0.x=25; a0.y=16;
    System.out.println(A.x);




                          System.out.println(a0.x);
                          System.out.println(a1.x);
                          a1.x=85; a1.y=65;
                          System.out.println(a1.x);
                          a0.disp(); A.disp(); a1.disp(); A.disp();
  }
}