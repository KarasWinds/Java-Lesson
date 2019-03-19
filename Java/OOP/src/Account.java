
public class Account {
	String accountNo;
	double balance;
	
	Account(String accountNo, double balance){
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	void printAccData() {
		System.out.println("AccountNo = " + accountNo);
		System.out.println("Balance = " + balance);
	}
	
}
