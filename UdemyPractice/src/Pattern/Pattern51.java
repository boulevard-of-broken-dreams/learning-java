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
 *      * * * * * * * * * *  
          * * * * * * * * *  
            * * * * * * * *  
              * * * * * * *  
                * * * * * *  
                  * * * * *  
                    * * * *  
                      * * *  
                        * *  
                          * 
 * 
 * @author Sourav_Dash
 */
public class Pattern51 {
    public static void main(String[] args) {
        int row = 10;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k < row; k++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
