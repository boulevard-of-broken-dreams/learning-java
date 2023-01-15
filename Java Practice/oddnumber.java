class oddnumber{
	public static void main(String args[]){
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("Give your to check Even or Odd");
		int number = scn.nextInt();
		if (number%2==0) {
			System.out.print("Even Number");
		}else{
			System.out.print("Odd Number");
		}
	}
}