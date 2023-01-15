/*
* If Static value and local value define with same name than while Acessing Jvm Gives preference to 
* Local variable.To Access Static variable gives reference of Class.
*/
class VarDemo4 {
	static int i=20;
	public static void main(String[] args) {
		int i=10;
		System.out.println(i);
		System.out.println(VarDemo4.i);
	}
}