package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account( int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account( int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.00;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public String toString() {
		return "Account " 
				+ number 
				+ ", Holder: " 
				+ holder 
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

}
