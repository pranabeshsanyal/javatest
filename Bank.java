package bankApplication;

import java.util.Scanner;
public class Bank{

	static Account[] acc = 
		{
				new SavingsAccount(),
				new CurrentAccount()
		};
	static double interest = 0;
	static Scanner k = new Scanner(System.in);

	public static void main(String[] args) {
		acc[1].setBalance(-1);
		// TODO Auto-generated method stub
		System.out.println("Test");
//		for(int i = 0; i < acc.length; i++) {
//			acc[i].deposit(0.5);
//		}
		System.out.println(updateAccount());
		System.out.println("Account 1 Current Balance: " + acc[0].getBalance());
		System.out.println("Account 2 Current Balance: " + acc[1].getBalance());
	}

	public static String updateAccount() {
		System.out.println("Enter Interest:");
		interest = k.nextDouble();
		for(int i = 0; i < acc.length; i++) {
			if(acc[i].getBalance()<0) {
				System.out.println("email sent");
				acc[i].deposit(interest);
			}else acc[i].deposit(interest);
		} return "Deposit Added";
	}


}
