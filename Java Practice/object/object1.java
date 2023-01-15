class C{
	int i = 10;
	public void display(){
		System.out.println("Display Starts");
		System.out.println(i);
		System.out.println("Display Ends");
	}
}

class D{
	public static void main(String[] args) {
		C c = new C();
		c.display();
		c.i = 100;
		c.display();
	}
}