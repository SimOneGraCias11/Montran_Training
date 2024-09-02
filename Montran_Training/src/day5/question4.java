package day5;

class Bank {
	double balance;

	Bank(double previous_balance) {
		this.balance = previous_balance;
	}

	synchronized void deposit(double amount) {
		balance += amount;
		System.out.println("deposit  :" + amount);
		System.out.println("balance is :" + balance);

	}

	synchronized void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("withdraw  :" + amount);
			System.out.println("balance is :" + balance);
		} else {
			System.out.println("insufficent " + amount);
		}
	}

	synchronized void getbalance() {
		System.out.println("Current balance:" + balance);

	}
}

class DepositThreads extends Thread {
	Bank bank;
	double amount;

	public DepositThreads(Bank bank, double amount) {
		this.bank = bank;
		this.amount = amount;
	}

	public void run() {
		bank.deposit(amount);
	}

}
class WithdrawThreads extends Thread {
	Bank bank;
	double amount;

	public WithdrawThreads(Bank bank, double amount) {
		this.bank = bank;
		this.amount = amount;
	}

	public void run() {
		bank.withdraw(amount);
	}

}

class getbalanceThread extends Thread {
	Bank bank;

	public getbalanceThread(Bank bank) {
		this.bank = bank;
	}

	public void run() {
		bank.getbalance();
	}

}

public class question4 {

	public static void main(String[] args) {
		Bank b = new Bank(1000.00);
		DepositThreads depo=new DepositThreads(b,300);
		WithdrawThreads wd=new WithdrawThreads(b,1500);

		DepositThreads d=new DepositThreads(b,500);

		getbalanceThread gb=new getbalanceThread(b);
		
		depo.start();
		d.start();
		wd.start();
		gb.start();
		
		try {
			depo.join();
			wd.join();
			gb.join();
			d.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
