class MainOverLoading {
	public static void main(String[] args) {
		System.out.println("String []");
		main();
		main(45);
	}

	public static void main(){
		System.out.println("main()");
	}

	public static void main(int i){
		System.out.println("main(int i)");
	}
}