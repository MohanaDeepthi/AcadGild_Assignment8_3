package assignment8_3;//package name

public class Account {//Account class
	private  double balance=0.0;
	public Account(double balance){
		this.balance=balance;
	}
	
	public  void deposit(double amount){
		if(amount<0){
			throw new  IllegalArgumentException("invalid amount Can�t deposit.");
		}
		this.balance+=amount;
		System.out.println("Deposit "+amount+" in thread"+Thread.currentThread().getId()+", balance is " +balance);
		
	}
	
	public  void withdraw(double amount){
		if(amount<0||amount>this.balance){
			throw new  IllegalArgumentException("invalid amount Can�t withdraw.");
			
		}
		this.balance-=amount;
		System.out.println("Withdraw "+amount+" in thread "+ Thread.currentThread().getId()+ ", balance is "+balance);
	}
}
