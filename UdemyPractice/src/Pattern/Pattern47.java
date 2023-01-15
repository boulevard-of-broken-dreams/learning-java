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
 *      A
 *     A B
 *    A B C
 *   A B C D
 * @author Sourav_Dash
 */
public class Pattern47 {
    public static void main(String[] args) {
        int row = 5;
        int n =65;
        for (int i = 1; i <= row; i++) {
            for (int j = i; j < row; j++) {
                System.out.print(" ");
            }
            if (i>1) {
                for (int k = 1; k <= i; k++) {
                    System.out.print((char) n+" ");
                    n++;
                }
            }else{
                System.out.print((char) 65);
            }
            
            System.out.println("");
        }
    }
}
