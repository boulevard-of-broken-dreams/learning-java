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
 Q. 57  Write a C program to display odd number series pyramid as:

    1
    3  5  7
    9 11 13 15 17 19

 * @author Sourav_Dash
 */
public class Pattern62 {
    public static void main(String[] args) {
        int row = 3;
        int value = 1;
        int incre = 1;
        int count = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= incre; j++) {
                System.out.print(value+" ");
                value += 2;
            }
            count++;
            incre+=count;
            System.out.println("");
        }
    }
}
