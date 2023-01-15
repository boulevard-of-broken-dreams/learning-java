class fibonaci{
	public static void main(String[] args) {
		/* 0, 1, 1, 2, 3, 5, 8, 13, 21 */
		int num1=0,num2=1,num3,count=10,incre;
		System.out.println(num1+",");
		System.out.println(num2+",");
		for (incre=1;incre<=count;incre++) {
			num3 = num1 + num2;
			System.out.println(num3+",");
				num1 = num2;
				num2 = num3;
		}
	}
}