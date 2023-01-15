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
 * Q.63 Write a C program to accept the number of rows of pyramid and print the star pyramid as:if entered number by user is 7 then output would be:

    *
    **
    ***
    ****
    ***
    **
    *

 * @author Sourav_Dash
 */
public class Pattern65 {
    public static void main(String[] args) {
        int row = 7;
        int half = (row/2)+1;
        int secondHalf = row - half;
        for (int i = 1; i <= half; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for (int i = secondHalf; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
