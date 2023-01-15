class FindPrimeBetweenTwoNumbers {
	public static void main(String[] args) {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("Enter lower range");
		int lowerRange = scn.nextInt();
		System.out.println("Enter Higher range");
		int higherRange = scn.nextInt();
		System.out.println("------------------------------");
		if (lowerRange < higherRange) {
			System.out.print("The prime numbers are ");
			for (int i=lowerRange;i<=higherRange;i++) {
				int range = (int) i/2;
				int count = 0;
				for (int j = 2;j<range;j++) {
					if (i%j==0) {
						count++;
						break;
					}
				}
				if (count==0) {
					System.out.print(i+",");
				}
			}
		}else {
			System.out.println("Higher Range is always higher from lower range.");
		}
	}
}