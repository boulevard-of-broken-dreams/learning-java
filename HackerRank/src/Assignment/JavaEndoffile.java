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
public class JavaEndoffile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean s = sc.hasNext();
        int i=1;
        while (s) {
            String b = sc.nextLine(); 
            System.out.print(i+" "); 
            System.out.println(b); 
            i++;
        }
    }
}
