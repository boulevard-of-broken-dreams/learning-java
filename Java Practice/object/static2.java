class static2 {
	public static int i = 10;
	public int j = 20;

	static void m1(){
		i = 20;
		System.out.println(i);
	}
}

class staticB{
	public static void main(String[] args) {
		System.out.println(static2.i);
		static2.m1();
	}
}