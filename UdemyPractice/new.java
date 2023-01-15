import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            String sumLine = br.readLine();
            String[] tokens = sumLine.split(" ");
            int a = Integer.parseInt(tokens[i]);
            for (int j=1;j<= a;j++) {
                if (j%3==0 && j%5==0) {
                    System.out.println("FizzBuzz");
                }else if(j%3==0){
                    System.out.println("Fizz");
                }else if (j%5==0) {
                    System.out.println("Buzz");
                }else{
                    System.out.println(j);

                }
            }
        }
    }
}
