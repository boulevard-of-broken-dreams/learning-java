class pattern1 {
	public static void main(String[] args) {
		int column = 5;
		for (int i=1;i<=column;i++) {
			for (int j = 1;j<=i;j++) {
				System.out.print('*'+" ");
			}
			System.out.println("");
		}
	}
}

class pattern2 {
	public static void main(String[] args) {
		int column = 5;
		for (int i=column;i>=1;i--) {
			for (int j=i;j>=1;j--) {
				System.out.print('*'+" ");
			}
			System.out.println("");
		}
	}
}