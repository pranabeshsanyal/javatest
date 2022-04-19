package bankApplication;

public class SavingsAccount extends Account{
	public static double interest = 0;
	public static Account a = new Account();
	
	public SavingsAccount() {
		interest = 0;
	}
	
	public SavingsAccount(Account a) {
		SavingsAccount.a = a;
	}
	public static void addInterest(double i) {
		interest = i;
		a.deposit(interest);
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		SavingsAccount.interest = interest;
	}
//	@Override
//	public void newAccount(int i, double d)
//	{
//		a.setId(i);
//		a.setBalance(d);
//	}
}
