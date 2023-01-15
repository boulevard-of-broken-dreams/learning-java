import java.util.*;

class function1 {
	static int first;
	static int second;
	public static void main(String[] args) {
		// Scanner scn = new Scanner(System.in);
		System.out.println("Welcome to small calculator app.");
		opearations();

	}

	public static void opearations(){
		Scanner scn = new Scanner(System.in);
		System.out.println("which opearations do you want to do?");
		System.out.println("Add = 1,Substract = 2,Multiply = 3,Division = 4,Reminder Division = 5 To Quit = 7");
		int option = scn.nextInt();
		if (option<6 && option>0) {
			System.out.println("Enter your first number.");
			first = scn.nextInt();
			System.out.println("Enter your second number.");
			second = scn.nextInt();
			switch (option) {
				case 1:
					System.out.println("The Addtion of "+first+" And "+second+" is " +(add(first,second)));
					opearations();
					break;
				case 2:
					System.out.println("The Substraction of "+first+" And "+second+" is " +(substract(first,second)));
					opearations();
					break;
				case 3:
					System.out.println("The Multiplication of "+first+" And "+second+" is " +(multiply(first,second)));
					opearations();
					break;
				case 4:
					System.out.println("The Division of "+first+" And "+second+" is " +(division(first,second)));
					opearations();
					break;
				case 5:
					System.out.println("The Reminder division of "+first+" And "+second+" is " +(reminderDivision(first,second)));
					opearations();
					break;
				default:
					System.out.println("There is no such command available.");
			}
		}else{
			System.out.println("Quited");
		}
	}

	public static int add(int first,int second){
		return first+second;
	}

	public static int substract(int first,int second){
		return first-second;
	}

	public static int multiply(int first,int second){
		return first*second;	
	}

	public static double division(int first,int second){
		return first/second;
	}

	public static int reminderDivision(int first,int second){
		return first%second;
	}
}