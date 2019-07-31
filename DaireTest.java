class Daire{

   private double yaricap;

   public void degerAta(double yaricap){
       this.yaricap=yaricap;  
   } 

   public double alan(){ 
      return (22/7)*yaricap*yaricap;
  }

  public void cevre(){
    System.out.println("Daire cevre = "+2*(22/7)*yaricap);
  }

  public Daire alanKarsilastir(Daire d){
     if( this.alan()>d.alan() )
      return this;
     else
      return d;
   }

}


public class DaireTest{
  public static void main(String[] args){
    Daire d1= new Daire();  
    Daire d2= new Daire();
    d1.degerAta(4.5); 
    d2.degerAta(3.5);
    d1.cevre();
    d2.cevre();
    System.out.println("Buyuk olan alan = "+(d1.alanKarsilastir(d2)).alan() );     
  }
}
