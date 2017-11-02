package assignment8_3;
import java.util.Scanner;


public class BankAccountTester
{
   public static void main(String[] args)
   {
	  double withDrawAmount,depositAmount ;
	  final int REPETITIONS;
	  BankAccount account = new BankAccount();
	  Thread t1=null,t2=null;
	  Scanner inpScan = new Scanner(System.in);//scanner object
	  	//taking input from user for withdraw and deposit amounts
	  	 System.out.println("Enter the withdraw  amount :");
	  	  withDrawAmount = inpScan.nextDouble();
		  System.out.println("Enter the deposit  amount :");
		  depositAmount=inpScan.nextDouble();
		  //taking method type to run synchronized or unsynchronized methods

		  System.out.println("Enter the number of times u want to repeat the operation");
		  REPETITIONS=inpScan.nextInt();
		  //instantiate deposit and wihtdraw runnable objects 
		  DepositRunnable d1 = new DepositRunnable(account, depositAmount, REPETITIONS);
		  WithDrawRunnable w1 = new WithDrawRunnable(account, withDrawAmount, REPETITIONS);
		  t1 = new Thread(d1);//creating deposit runnable thread
		  t2 = new Thread(w1);//creating withdraw runnable thread
	
		  try{
 
			  //run threads	
		      t1.start();
		      t2.start();
		  }
		  catch(Exception e){
			  e.printStackTrace();}
		  finally{
			  inpScan.close();  
		  }
     }
 
   
}

