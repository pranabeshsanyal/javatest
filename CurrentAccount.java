package bankApplication;
/*81*/
public class CurrentAccount extends Account{
	public boolean overdraft = false;
	Account a = new Account();
	public double balance = 0;
	
	public boolean getOverdraft() {
		balance = a.getBalance();
		if(balance < 0) {
			return true;
		}else return false;
	}
	public CurrentAccount() {
		balance = 0;
	}
}
