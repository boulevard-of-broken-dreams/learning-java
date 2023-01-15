import java.util.Scanner;
class index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float totalBalance = sc.nextFloat();
		float withdrawAmt = sc.nextFloat();
		// withdrawAmt = sc.nextFloat();
		if (withdrawAmt%5==0 && withdrawAmt > 0.00 && withdrawAmt <= 2000.00 ) {
			if (withdrawAmt+0.5< totalBalance) {
				System.out.printf("%.2f",totalBalance-(withdrawAmt+0.5));
			}else{
				System.out.printf("%.2f",totalBalance);
			}
		}else{
			System.out.printf("%.2f",totalBalance);
		}
	}
}

// class index {
// 	public static void main(String[] args) {
// 		// Scanner sc = new Scanner(System.in);
// 		// float totalBalance = sc.nextFloat();
// 		// int withdrawAmt = sc.nextInt();
// 		// // withdrawAmt = sc.nextFloat();
// 		// if (withdrawAmt%5!=0) {
// 		// 	System.out.printf("%.2f",totalBalance);
// 		// }else if(withdrawAmt > totalBalance-0.50){
// 		// 	System.out.printf("%.2f",totalBalance);
// 		// }else{
// 		// 	float curBal = (float) (totalBalance-(withdrawAmt+0.5));
// 		// 	System.out.printf("%.2f",curBal);
// 		// }

// 		Scanner	s = new Scanner(System.in);
// 		int sumTowithdraw = s.nextInt();
// 		float totalbalance = s.nextFloat();
// 		if(sumTowithdraw%5 != 0){
// 			System.out.printf("%.2f", totalbalance);
// 		}
// 		else if(sumTowithdraw > (totalbalance-0.50)) {
// 			System.out.printf("%.2f", totalbalance);
// 		}
// 		else{
// 			float curBal = (float) (totalbalance - sumTowithdraw - 0.50);
// 			System.out.printf("%.2f", curBal);
// 		}
// 	}
// }