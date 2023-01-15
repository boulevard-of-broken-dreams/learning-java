class VariablePriorityCheck {
	static int i = 20;
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i); // Here the static data member and local variable having same name 
		System.out.println(VariablePriorityCheck.i);// the local variable always gets highest priority inside a method

	}
}