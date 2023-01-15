class SmartPhone{
	String color = "blue";
	String brand = "Google";
	void call(){
		System.out.println("Calling");
	}
}

class TestClass{
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		decorate(phone);
		System.out.println("Phone color is "+phone.color+" and brand is "+phone.brand);
	}

	public static void decorate(SmartPhone sp){
		sp.color = "White";
		sp.brand = "Mi";
	}
}