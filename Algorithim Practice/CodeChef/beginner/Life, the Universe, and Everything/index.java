import java.util.Scanner;
class index{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			int value = s.nextInt();
			if(value!=42)
				System.out.println(value);
			else
				break;
		}
	}
}