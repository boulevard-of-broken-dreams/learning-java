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
 * Q.42  Write a C program to print the following character triangle:
        EDCBA
        DCBA
        CBA
        BA
        A

 * @author Sourav_Dash
 */
public class Pattern56 {
    public static void main(String[] args) {
        int row = 5;
        int number = 65+row;
        int start = number-1;
        for (int i = 1; i <= row; i++) {
            for (int j = start; j >= 65; j--) {
                System.out.print((char)j);
            }
            start--;
            System.out.println("");
        }
    }
}
