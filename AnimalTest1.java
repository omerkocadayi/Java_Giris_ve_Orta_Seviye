class Animal{
  protected String name;
  protected String voice;
  public Animal() { System.out.println("Animal DC run" );  }
  public Animal(String name, String voice) { System.out.println("Animal PC run" );
      this.name=name;   this.voice= voice;    
  }

  public void run() { System.out.println(  name+" is running"  ); }
  public void speak() { System.out.println( voice+" "+  voice+" "+ voice );    } 
}

class Cat extends Animal  {
  
  protected int legs;
  public Cat () {  System.out.println("Cat DC run" );    }
  public Cat(String name, String voice, int legs) { System.out.println("Cat PC run" );
    this.name=name;   this.voice= voice; this.legs=legs;   
  }
  public void run() { 
     System.out.println( name+" is running with "+legs );    }
 
}
class Leopard extends Cat{
   private int spead;
   public Leopard(){ }
   public Leopard(String name, String voice, int legs, int spead) { 
     System.out.println("Leopard PC run" );
    this.name=name;   this.voice= voice; this.legs=legs; this.spead=spead;   
  }
  public void run() { 
     System.out.println( name+" is running with "+legs+ " and its spead "+spead );    }

}
public class AnimalTest1{
   public static void main(String[] args){

     Animal a1 =new Animal("Karabas", "hav");
     Cat    c1 =new Cat("Zeytin", "miyav", 4);
     Leopard l1= new Leopard("sarýok","leo",4,99);
     a1.run(); a1.speak();
     c1.run(); c1.speak();
     l1.run(); l1.speak();

   }

}