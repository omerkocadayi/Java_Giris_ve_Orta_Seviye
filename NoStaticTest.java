class A{
   public int x;
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



public class NoStaticTest{
  

  public  static void main(String[] args){
    A a0=new A();
      a0.disp();
    A a1=new A();
      a1.disp(); 
  }
}