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
 * Q.27  Write a C program to display the following character structure:

    A
    BB
    CCC
    DDDD
    CCC
    BB
    A

 * @author Sourav_Dash
 */
public class Pattern58 {
    public static void main(String[] args) {
        int row=10; 
        int alpha = 65;
        int value = 0;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                value = ((alpha+i)-1);
                System.out.print((char) value);
            }
            System.out.println("");
        }
        int count = 1;
        for (int i = row-1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print((char)( value-count));
            }
            count++;
            System.out.println("");
        }
    }
}
