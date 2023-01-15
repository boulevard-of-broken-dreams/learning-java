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
public class JavaIfElse {
     public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The Number : ");
            int n=sc.nextInt();            
            String ans="";
            if(n%2==1)ans = "Weird";
            else
            {
               //Complete the code
               if(n>=2 && n<=5){
                 System.out.println("Not Weird");
               }else if(n>=6 && n<=20){
                 System.out.println("Weird");
               }
               if(n>20){
                 System.out.println("Not Weird");
               }
                
            }
            System.out.println(ans);
            
        }
}
