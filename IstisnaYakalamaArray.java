public class IstisnaYakalamaArray
{   
    public static void main(String arg[]) 
    {
        int sayilar[] = {1,2,3,4};   
        for (int i=0 ; i < 5 ; i++) 
        {
            try {
                System.out.println("-> " + sayilar[i]);
            } 
                catch (Exception ex) 
            {
                System.out.println("Hata Yakalandi "+ ex);
            } 
              finally { 
              System.out.println("bitti");
            }      
        }
      
  
    }
}