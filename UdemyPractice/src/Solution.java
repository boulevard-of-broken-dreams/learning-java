import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[] arr = new int[testCase];
        for(int i=0;i<testCase;i++){
           int testCase2 = sc.nextInt();
           arr[i]=testCase2;
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}