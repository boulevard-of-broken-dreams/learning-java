import java.util.*;

class Account{
	public static double bal;
	int accNo;
	public void getCurrentBal(){
		System.out.println("Current Balance is "+bal);
	}
	public void WithdrawMoney(double amt){
		if (bal>=amt) {
			System.out.println("Processing");
			System.out.println("Collect your cash");
			bal = bal-amt;
		}else{
			System.out.println("Insufficient balance");
		}
	}
	public void AddMoney(double amt){
		System.out.println("Wait a second your transcation is working.");
		bal += amt;
		System.out.println("Your money added to wallet");
	}
}

class atm{
	public static void main(String[] args) {
		Account acc = new Account();
		acc.accNo = 79999;
		Scanner sc = new Scanner(System.in);
		int isContinue;
		do{
			System.out.println("Welcome to Bitcoin bank");
			System.out.println("1: Show current balance");
			System.out.println("2: Withdraw Money");
			System.out.println("3: Add Money");
			System.out.print("Choose your selection");
			int option = sc.nextInt();
			System.out.println("");
			switch (option) {
				case 1:
					acc.getCurrentBal();
					break;
				case 2:
					System.out.print("How much money you want withdraw ?");
					double money = (double) sc.nextInt();
					acc.WithdrawMoney(money);
					break;
				case 3:
					System.out.print("How much money you want add ?");
					double addAoney = (double) sc.nextInt();
					acc.AddMoney(addAoney);
					break;
				default:
					System.out.println("Invalid choice");
			}
			System.out.println("Would like to do any operations?");
			System.out.println("Enter 1");
			isContinue = sc.nextInt();
		}while (isContinue==1);
		System.out.println("Thanks for using BitcoinBank");
	}
}