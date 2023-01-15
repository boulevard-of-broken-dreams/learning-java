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
public class Pattern57 {
    public static void main(String[] args) {
        int row = 5;
        int colrow = (row*2)-1;
        int remember = 0;
        for (int i = 0; i < colrow; i++) {
            for (int j = 0; j <= i; j++) {
                if (i>row-2) {
                    break;
                }
                System.out.print((char)(65+i));
                remember = 65+i;
            }
            System.out.println("");
            for (int k = remember-1; k >= 65; k--) {
                System.out.print((char)(remember-1));
            }
            System.out.println("");
        }
    }
}
