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
public class JavaStaticInitializerBlock {
    static boolean flag = false;
    static Scanner sc = new Scanner(System.in);
    static int breadth = sc.nextInt();
    static int height = sc.nextInt();
    static {
        try {
            if (breadth<=0 || height<=0) {
                throw new Exception("Breadth and height must be positive");
            }else{
                flag = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
  
    };
    public static void main(String[] args) {
        if(flag){
            int area = breadth * height;
            System.out.println(area);
        }
    }
}
