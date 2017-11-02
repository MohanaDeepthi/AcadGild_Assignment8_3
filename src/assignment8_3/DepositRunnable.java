package assignment8_3;

public class DepositRunnable implements Runnable{
	
	private BankAccount account;
	
	private double amount;
	private int repetetions;
	
	

	public DepositRunnable(BankAccount account, double amount, int repetetions) {
		this.account=account;
		this.amount=amount;
		this.repetetions=repetetions;
		
		
	}


	@Override
	public void run() {//implementing run method
		try
	      {
	         for (int i = 1; i <= repetetions; i++)//loop through no of repetetions
	         {
	        	
	        		account.deposit(amount);
	                Thread.sleep(1000);
	         }
	      }
	      catch (InterruptedException exception) {}
	   }

		
		
	}

	


