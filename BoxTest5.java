// no this pointer
class Box{
 private int width;
 private int length;
 private int height;

 public void setValue(int width, int length, int height){
   this.width=width; this.length=length; this.height=height;
 }
 public int volume(){
    return width*length*height;
 }
 
 public Box getB(){
  return b;
 }
 public Box compareVolume(Box b2){
   if (this.volume()>b2.volume())
      return this;
   else
      return b2;
   
 }


}
public class BoxTest5{

  public static void main(String[] args){
    Box b1=new Box();     Box b2=new Box();
    b1.setValue(2,5,10);  b2.setValue(3,2,8);
    System.out.println("Bigger Box Volume = "+ (b1.compareVolume(b2) ).volume() );
  }
}