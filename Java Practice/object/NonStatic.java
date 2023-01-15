class NonStatic{
	int i = 45;
	static int j = 156;
	public void display(){
		System.out.println("Display starts");
		System.out.println(i);
		System.out.println(j);
		System.out.println("Display ends");
	}
}

class NonStatic1{
	public static void main(String[] args) {
		NonStatic ns = new NonStatic();
		ns.display(); // This is not standard in java
		ns.i = 123;
		ns.j = 145;
		ns.display();
	}
}