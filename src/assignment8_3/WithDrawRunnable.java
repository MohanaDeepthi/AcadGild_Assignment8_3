package assignment8_3;

public class WithDrawRunnable {
	private Account acct = new Account(200);
	public void run()
	   {
	      try
	      {
	         for (int i = 1; i <= 10; i++)
	         {
	            acct.withdraw(200);
	            Thread.sleep(100);
	         }
	      }
	      catch (InterruptedException exception) {}
	   }


}
