class NonStatic2 {
	int i; // 0
	public static int j; // 0
	void increment(){
		i++;
		j++;
	}

	void display(){
		System.out.print(i);
		System.out.println(j);
	}
}

class NonStatic3{
	public static void main(String[] args) {
		NonStatic2 ob1 = new NonStatic2();
		NonStatic2 ob2 = new NonStatic2();
		NonStatic2 ob3 = new NonStatic2();
		ob1.increment(); // 1 1
		ob1.increment(); // 2 2
		ob2.increment(); // 1 3
		ob3.increment(); // 1 4
		ob1.display(); // 2 4
		ob2.display(); // 1 4
		ob3.display(); // 1 4
	}
}