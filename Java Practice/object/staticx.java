class staticx {
	static int i = 10;
	int j = 20;

	public static void main(String[] args) {
		m1();
		staticx sc = new staticx();
		sc.m2();
	}

	static void m1(){
		System.out.println(i);
		// System.out.println(j); //Compile time error because we cann't use non-static 
								  //variabel in static context 
	}

	void m2(){
		System.out.println(i);
		System.out.println(j);
	}
}