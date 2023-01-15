/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.Scanner;

/**
 *
 * @author Sourav_Dash
 */
public class JavaIntToString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String j = String.valueOf(n);
        if(n==Integer.parseInt(j))
	{
            System.out.println("Good job");
	}
	else
	{
            System.out.println("Wrong answer.");
	}
    }
}