class static3 {
	static int y = 12;
	static void display(){
		System.out.println("display starts");
		System.out.println(y);
		System.out.println("display ends");
	}
}

class static4{
	public static void main(String[] args) {
		static3.display();
		static3.y = 100;
		static3.display();
	}
}