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

/**
 *
 Q.30.  Write a C program to display the following number triangle structure:-

     1
    21
   321
  4321
 54321

 * 
 * @author Sourav_Dash
 */
public class Pattern35 {
    public static void main(String[] args) {
        int row = 5;
        int count = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = row-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int h = count; h >= 1; h--) {
                System.out.print(h);
            }
            count++;
            System.out.println("");
        }
    }
}
