/*
*Calculte and Addition Fibonaci Series
*
*/
class fibonaci {
	public static void main(String[] args) {
		int num1=0,num2=1,num3,i;
		System.out.println(num1);
		System.out.println(num2);
		for (i =1;i <= 6;i++ ) {
			num3 = num1+num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
	}
}