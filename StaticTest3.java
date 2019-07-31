class A{
   public static int x;
   public static int y;
   public int z;
   
   A(){
        System.out.println("DC run");
        x++;  y++; z++;
      }  
    static void disp(){
       x++;   y--;
       System.out.println(x+" "+y); 
    }
}



public class StaticTest3{
  

  public  static void main(String[] args){
    A a0=new A();
      a0.z=25;
      a0.disp(); A.disp();
    A a1=new A();
      A.x=55; A.y=46;
      a1.disp(); A.disp(); 
    System.out.println(A.x+" "+ a0.x+" "+a1.x);
  }
}