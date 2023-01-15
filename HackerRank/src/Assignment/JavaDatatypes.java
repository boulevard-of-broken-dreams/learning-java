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
public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        long integer = 2147483648l;
        long longInteger = -9223372036854775808l;
        long positiveLong = 9223372036854775807l;
        for(int i=0;i<t;i++)
        { 
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=-32768 && x<= 32767) System.out.println("* short");;
                if(x>=-integer && x<=(integer-1))System.out.println("* int");
                if(x>=longInteger && x<=(positiveLong))System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
