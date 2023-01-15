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
 *
    Q.16  Write a program to generate a following numbers structure:
    1	2	3	4	5

    1	2	3	4


    1	2	3



    1	2




    1

 * @author Sourav_Dash
 */
public class Pattern30 {
    public static void main(String[] args) {
        int row = 5;
        int range = 0;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-range; j++) {
                System.out.print(j);
                for (int k = 1; k <= j; k++) {
                    System.out.print(" ");
                }
           }
            for (int h = 1; h <= i; h++) {
                System.out.println("");
            }
            range++;
        }
    }
}
