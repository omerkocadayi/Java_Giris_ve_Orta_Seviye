class A {
   protected int i;
  A(){
        System.out.println("A DC run"); 
   }  
  public void print() {
    System.out.println(i);
  }
}
class B extends A {
    private int i;                                
    B(int a, int b) {
      this.i=a;

      super.i=b; 
   }
   B(){
        System.out.println("A DC run");
    }
  public void print() {
   System.out.println(i);
   System.out.println(super.i);   
   }
} 
class SuperTest1 {
    public static void main(String args[]) {
    A a=new A(); // A s�n�f�nda "a" nesnesi i�in bellekten dinamik
                 // olarak yer ayr�l�yor. 
    a.print();
    B b = new B(5, 25);  
    a.print();
    b.print();
  }
}