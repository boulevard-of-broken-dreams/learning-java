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
public class JavaLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many You Put : ");
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.println("Enter a");
            int a = sc.nextInt();
            System.out.println("Enter b");
            int b = sc.nextInt();
            System.out.println("Enter N");
            int n = sc.nextInt();
            int dis = a;
            for (int j = 0; j < n; j++) {
                dis += Math.pow(2, j)*b;
                System.out.print(dis+" ");
            }
            System.out.println("");
        }
    }
}
