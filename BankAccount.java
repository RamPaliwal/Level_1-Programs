package Level_1;

public class BankAccount {
	int balance;
	int account_number;
	public BankAccount(int bal,int acc_no) {
		this.balance=bal;
		this.account_number=acc_no;
	}
	public void deposit(int amount) {
		System.out.println("Successfully deposited Rs "+amount);
		balance=balance+amount;
		System.out.println("Current balance is Rs "+balance);
	}
	public void withdraw(int amount) {
		if(balance<amount) {
			System.out.println("Insufficient balance");
		}
		else {
			balance = balance-amount;
			System.out.println("Successfully withdrawn Rs "+amount);
			System.out.println("Remaining balance is Rs "+balance);
		}
	}
	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(20000,1011);
		a1.deposit(1000);
		a1.withdraw(5000);
	}
}