package assignment8_3;

public class BankAccount {
	  private double balance;//declare balance variable
	
	   public BankAccount() //bank account constructor
	   {
	      balance = 0;
	   }
	   //synchronized deposit method
	   public  synchronized void deposit(double amount)
	   {
	      if(amount<0){//if deposit amount is negative
	    	  System.out.println("Invalid amount cannot deposit");
	      }
	      else{ //logic to deposit amount
		   System.out.print("Depositing " + amount);
	      double newBalance = balance + amount;
	      System.out.println(", new balance is " + newBalance);
	      balance = newBalance;
	      }
	   }
	   
	   
	   //not synchronized deposit method
	   public   void nonSyncdeposit(double amount)
	   {
	      if(amount<0){//if deposit amount is negative
	    	  System.out.println("Invalid amount cannot deposit");
	      }
	      else{ //logic to deposit amount
		   System.out.print("Depositing " + amount);
	      double newBalance = balance + amount;
	      System.out.println(", new balance is " + newBalance);
	      balance = newBalance;
	      }
	   }
	   
	   
	   //synchronized withdraw method
	   public synchronized void withdraw(double amount)
	   {
		  if((amount > balance)||(balance<0)){ //if balance is less
			  System.out.println("cannot withdraw in suffient balance");
		  } 
		  else{ //logic to withdraw amount
	      System.out.print("Withdrawing " + amount);
	      double newBalance = balance - amount;
	      System.out.println(", new balance is " + newBalance);
	      balance = newBalance;
		  }
	   }
	   
	 //synchronized withdraw method
	   public void nonSyncwithdraw(double amount)
	   {
		  if((amount > balance)||(balance<0)){ //if balance is less
			  System.out.println("cannot withdraw in suffient balance");
		  } 
		  else{ //logic to withdraw amount
	      System.out.print("Withdrawing " + amount);
	      double newBalance = balance - amount;
	      System.out.println(", new balance is " + newBalance);
	      balance = newBalance;
		  }
	   }
	   
	   public double getBalance()//returns balance amount
	   {
	      return balance;
	   }
	   
	 

    
}    