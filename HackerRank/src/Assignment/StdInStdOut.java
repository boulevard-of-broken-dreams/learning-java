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
public class StdInStdOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number : ");
            int x = sc.nextInt();
            System.out.println("Enter a Floating Point Number");
            double y = sc.nextDouble();
            System.out.println("Enter a String : ");
            sc.nextLine();
            String s = sc.nextLine();    
        
            System.out.println("String: "+s);
            System.out.println("Double: "+y);
            System.out.println("Int: "+x);
    }
}
