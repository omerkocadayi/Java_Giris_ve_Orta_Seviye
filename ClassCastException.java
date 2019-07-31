class A{
  private int x;
  A(){x=10;}
  public int getX(){return x;}
}

class B extends A{
  private int y;
  B(){y=100;}
  public int getY(){return y;}
}

class C extends A{
  private int z;
  C(){z=1000;}
  public int getZ(){return z;}
}

public class ClassCastException
{   
    public static void main(String arg[]) 
    {
       A a = new A();
       B b = new B();
       C c = new C();
      try{
          int k;
          k=0;
       
          if(k==0)
           {
             b=(B)a;
           }
         }
      catch (Exception ex) 
         {
          System.out.println("hata var "+ex);
         }
    }
}






