class variable1 {
	static int x=64; //static data memeber
	int y; // non-static data memeber
	public static void main(String[] args) {
		int z = 64; // local variable
		System.out.println(x);
		// System.out.println(y);
		System.out.println(z);
	}
}
