class divisibleby7 {
	public static void main(String[] args) {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("Give your number to find out divisibleby by 7 or not");
		int number = scn.nextInt();
		if (number%7==0) {
			System.out.println("The number "+number+" is divisible by 7");
		}else{
			System.out.println("The number "+number+" is not divisible by 7");
		}
	}
}