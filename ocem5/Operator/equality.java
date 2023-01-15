/*
*It Shows a error beacause there are two type of variable. In equality Operator We have to 
*check always same type variable. 
*/
class equality {
	public static void main(String[] args) {
		int a =10;
		String b = "10";
		if (a == b) {
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
}