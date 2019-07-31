class Account2 {

   private String type;    private double balance;

   public void setAccount(String typ, double blc){
     type=typ; balance=blc;
   }
   public String getType(){
     return type;
   }
   public double getBalance(){
     return balance;
   }
   public void showAccount(){
       System.out.println( "type : "+type );
       System.out.println( "balance  : "+balance );
   }
}

public class AccountTest2{

    public static void main (String [] args){
       System.out.println("Account Test");
       Account2 acc0=new Account2();
       Account2 acc1=new Account2();
       Account2 acc2= new Account2(); 
     
       acc0.setAccount("Debit", 0.0);
       acc1.setAccount("Saving", 10.0);
       acc2.setAccount("Debit", 100.0);

       System.out.println( "acc0 type : "+acc0.getType() );
       System.out.println( "acc0 balance  : "+acc0.getBalance() );

       System.out.println( "acc1 type : "+acc1.getType() );
       System.out.println( "acc1 balance  : "+acc1.getBalance() );

       
       acc2.showAccount();

    }
}