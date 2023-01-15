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
 * @author Sourav_Dash
 * 
 * Q.25  Write a c program for following number structure:

    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
    4 4 4 4
    3 3 3
    2 2
    1

 */
public class Pattern59 {
    public static void main(String[] args){
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        for (int k = row-1; k >= 1; k--) {
            for (int h = 1; h <= k; h++) {
                System.out.print(k+" ");
            }
            System.out.println("");
        }
    }
}
