/*
 * Copyright 2015 Sourav_Dash.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package Pattern;
import java.util.Scanner;

/**
 *
         1
        121
       12321
      1234321
     123454321
    12345654321
   1234567654321
 * @author Sourav_Dash
 */
public class Pattern39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Row : "); 
        int row = sc.nextInt();
        
        for (int i = 1; i <= row; i++) {
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int h = 1; h <= i; h++) {
                System.out.print(h);
            }
            if (i>1) {
                for (int k = i; k > 1; k--) {
                    System.out.print(k-1);
                }
            }
            System.out.println("");
        }
   }
}
