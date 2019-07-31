class A {
  protected int i;
  public void print(){                                 
   System.out.println(i); 
  }
}
//Subclass B
class B extends A {
  int i;       
                             
  B(int a, int b) {
    super.i = a;     
    i = b;            
  }
 
  public void print() {
    System.out.println(super.i);
    super.print();
    System.out.println(i);  
  }
}
 
class SuperTest {
    public static void main(String args[]) {
    B b = new B(5, 25);
    b.print();
  }
}
