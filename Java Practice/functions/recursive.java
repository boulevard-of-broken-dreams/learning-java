class recursive {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the starting point");
		int number = sc.nextInt();
		System.out.println(m1(number));
	}

	public static int m1(int number){
		if (number>=30) {
			return 0;
		}else{
			return m1(number++);
		}
	}
}