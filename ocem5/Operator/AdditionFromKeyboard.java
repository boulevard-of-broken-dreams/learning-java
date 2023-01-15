class AdditionFromKeyboard {
	public static void main(String[] args) {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("Enter First Number");
		int a = scn.nextInt();
		System.out.println("Enter First Number");
		int b = scn.nextInt();
		int sum = a + b;
		System.out.println("The Result Is :"+sum);
	}
}