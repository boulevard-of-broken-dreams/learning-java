// With third variable
class SwappingOfVariable {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = x;
		x = y;
		y = z;
		System.out.println(x);
		System.out.println(y);
	}
}

// without third variable
class SwappingOfVariable2 {
	public static void main(String[] args) {
		int x = 50;
		int y = 60;
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println(x);
		System.out.println(y);
	}
}