class multiplicationTable {
	public static void main(String[] args) {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("Enter number to find multiplicationTable");
		int number = scn.nextInt();
		multiplication(number);
	}

	public static void multiplication(int multiplicationNumber){
		for (int i=1;i<=10 ;i++ ) {
			System.out.println(multiplicationNumber+" * "+i+" = "+(multiplicationNumber*i));	
		}
		java.util.Scanner scn2 = new java.util.Scanner(System.in);
		System.out.println("Would you like see other table.For Yes=1 No=2");
		int option = scn2.nextInt();
		switch (option) {
			case 1:
				System.out.println("Enter number to find multiplicationTable");
				int mNumber = scn2.nextInt();
				multiplication(mNumber);
				break;
			case 2:
				System.out.println("Thanks for using Multiplication Table");
				break;
		}
	}
}