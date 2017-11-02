package assignment8_3;

public class WithDrawRunnable implements Runnable{
	
	private BankAccount account;
	private double amount;
	private int repetetions;
	
	
	public WithDrawRunnable(BankAccount account, double amount, int repetetions) {
		this.account=account;
		this.amount=amount;
		this.repetetions=repetetions;
		
	}
	public void run()//implementing run
	   {
	      try
	      {
	         for (int i = 1; i <= repetetions; i++)//loop through repetitions
	         {
	        	
	        	 account.withdraw(amount);
	        	 Thread.sleep(100);
	         }
	      }
	      catch (InterruptedException exception) {}
	   }


}
