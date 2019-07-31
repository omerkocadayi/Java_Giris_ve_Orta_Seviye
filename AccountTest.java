class Account {

   public String type;
   public double balance;

   public void setAccount(String typ, double blc){
     type=typ; balance=blc;
   }

   public String getType(){
     return type;
   }

   public double getBalance(){
     return balance;
   }

}

public class AccountTest{

    public static void main (String [] args){
     
       System.out.println("Account Test");

       Account acc0=new Account();
       acc0.type="Debit";
       acc0.balance=0.0;

       System.out.println( "acc type : "+"acc0.getType()" );
    }
}