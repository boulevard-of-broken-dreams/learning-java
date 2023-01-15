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
public class Pattern60 {
    public static void main(String[] args){
        int alpha = 65;
        int row = 4;
        int c = 0;
        int z=1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                c = alpha+i;
                System.out.print((char) c);
            }
            System.out.println("");
        }
        for (int i = row-1; i >= 1; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print((char) (c-z));
            }
            z++;
            System.out.println("");
        }
    }
}
