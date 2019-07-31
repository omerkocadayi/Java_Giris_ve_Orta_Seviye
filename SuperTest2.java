class A {
   protected static int i;
   protected int j;
  A(){
        System.out.println("A DC run"); 
   }  
  public static void print() {
    System.out.println(i);
  }
  public static void ata(int k) {
     i=k;
   }
}
class B extends A {
    private static int i;                                
    B(int a, int b) {
      i=a;
      A.ata(55);
      super.i=b; 
   }
   B(){
        System.out.println("A DC run");
    }
  public static  void print() {
   System.out.println(i);   
   System.out.println(super.i);
   }
} 
class SuperTest2 {
    public static void main(String args[]) {
    A a=new A(); 
    a.print();
    B b = new B(5, 25);  
    A.print();
    a.print();
    b.print();
  }
}