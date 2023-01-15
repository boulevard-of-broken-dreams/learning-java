/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Sourav_Dash
 */
public class FizzBuzz {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        for (int i = 0; i < n; i++) {
            String sumline = br.readLine();
            int number = Integer.parseInt(sumline);
            for (int j = 1; j <= number; j++) {
                if (j%3==0 && j%5==0) {
                    System.out.println("FizzBuzz");
                } else if(j%5==0){
                    System.out.println("Buzz");
                }else if(j%3==0){
                    System.out.println("Fizz");
                }else{
                    System.out.println(j);
                }
            }
        }
    }
}
