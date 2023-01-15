class fibbonanci {
	public static void main(String[] args) {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("How may frequency of number you want.");
		int frequency = scn.nextInt();
		int first = 0;
		int second = 1;
		int third = 0;
		System.out.print(first+",");
		System.out.print(second+",");
		for (int i = 0;i<frequency-2;i++) {
			third = first+second;
			System.out.print(third+",");
			first = second;
			second = third;
		}
	}
}