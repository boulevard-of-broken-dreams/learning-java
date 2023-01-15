class PrimeOrComposite {
	public static void main(String[] args) {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("Enter the number to find out prime or composite");
		int number = scn.nextInt();
		int range = (int) number / 2;
		int count = 0;
		for (int i=2;i<=range;i++) {
			if (number%i==0) {
				count++;
				break;
			}
		}
		if (count==0) {
			System.out.println("Prime");
		}else{
			System.out.println("Composite");
		}
	}
}