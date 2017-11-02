package assignment8_3;

public class DepositRunnable implements Runnable{
	
	private Account acct = new Account(200);
	

	@Override
	public void run() {
		try
	      {
	         for (int i = 1; i <= 5; i++)
	         {
	            acct.deposit(200);
	            Thread.sleep(1000);
	         }
	      }
	      catch (InterruptedException exception) {}
	   }

		
		
	}

	


