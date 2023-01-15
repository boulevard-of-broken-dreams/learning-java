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
 * '
 * Q.19  Write a C program to print the following triangle:
        *	








        *	*	*	






        *	*	*	*	*	




        *	*	*	*	*	*	*	


        *	*	*	*	*	*	*	*	*	
        *	*	*	*	*	*	*	*	*	*	*
 * 
 * @author Sourav_Dash
 */
public class Pattern31 {
    public static void main(String[] args) {
        int row =6;
        int count = 1;
        int column = (row*2)-1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print("*");
                for (int a = 1; a <= row; a++) {
                    System.out.print(" ");
                }
            }
            count += 2;
            for (int r = 1; r <= column-2; r++) {
                System.out.println("");
            }
            column -= 2;
        }
    }
}
