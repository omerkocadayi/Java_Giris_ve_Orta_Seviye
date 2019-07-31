class Animal{
  private String name;
  private String voice;
  public Animal() {      }
  public Animal(String name, String voice) { 
      this.name=name;   this.voice= voice;    
  }

  public void run() { System.out.println(  name+" is running"  ); }
  public void speak() { System.out.println( voice+" "+  voice+" "+ voice );    }
  
}

class Cat {
  private String name;
  private String voice;
  private int legs;
  public Cat () {      }
  public Cat(String name, String voice, int legs) { 
    this.name=name;   this.voice= voice; this.legs=legs;   
  }
  public void run() { 
     System.out.println( name+" is running with "+legs );    }
  public void speak() {  System.out.println( voice+" "+  voice+" "+ voice );    }
}

public class AnimalTest{
   public static void main(String[] args){

     Animal a1 =new Animal("Karabas", "hav");
     Cat    c1 =new Cat("Zeytin", "miyav", 4);
     a1.run(); a1.speak();
     c1.run(); c1.speak();

   }

}