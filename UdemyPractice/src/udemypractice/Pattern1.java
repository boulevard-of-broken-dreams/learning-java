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
package udemypractice;

/**
 *
 * @author Sourav_Dash
 */
public class Pattern1 {
    public static void main(String[] args) {
        int row = 10;
        for (int i = 1; i <= row; i++) {
            if (i==1 || i==row) {
                for (int j = 1; j <= row; j++) {
                    System.out.print("#");
                }
            }else{
                for (int k = 1; k <= row; k++) {
                    if (k==1 || k==row) {
                        System.out.print("#");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
