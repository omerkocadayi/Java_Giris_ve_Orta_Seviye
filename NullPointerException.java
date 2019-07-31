class A{
  private int x;
  A(){x=10;}
  public int getX(){return x;}

}

public class NullPointerException
{   
    public static void main(String arg[]) 
    {
       A a;
              int y;
              y=0;

              if (y==0){
                  a=null;
               }
                else { 
                   a=new A();
               }
              System.out.println(a.getX());
     
    }
}













 /*    
        try {
              A a;
              int y;
              y=0;

              if (y==0){
                  a=null;
               }
                else { 
                   a=new A();
               }
              System.out.println(a.getX());
            } 
          catch (Exception ex) 
            {
                System.out.println(ex);
            }
        System.out.println("codes are running");                
      */