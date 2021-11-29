package entities;

public class Product {
	
	private int accountN;
	private String holder;
	private double balance;
		
	public Product(int accountN, String holder, double initialDeposit) {
		super();
		this.accountN = accountN;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public Product(int accountN, String holder) {
		super();
		this.accountN = accountN;
		this.holder = holder;
	}

	public int getAccountN() {
		return accountN;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit (double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account: "
				+ accountN
				+ ", Holder:"
				+ holder
				+ ", Balance: $"
				+ String.format("%.2f", balance);
	}
}
