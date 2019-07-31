class A{
   public static int x;
   public int y;
   
   A(){
        System.out.println("DC run");
        x++;
        y--;
      }  
    void disp(){
       x++;
       y--;
       System.out.println(x+" "+y); 
    }
}



public class StaticTest1{
  

  public  static void main(String[] args){
    A a0=new A();
      a0.disp();
    A a1=new A();
      a1.disp(); 
    System.out.println(A.x+" "+ a0.x+" "+a1.x);
  }
}