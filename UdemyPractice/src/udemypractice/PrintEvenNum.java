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
public class PrintEvenNum {
    public static void main(String[] args) {
        for (int i = 30; i <= 60; i++) {
            if (i%2==0) {
                System.out.println("--------------------");
                System.out.println("1/2 of "+i+" is "+i/2);
                System.out.println("1/3 of "+i+" is "+i/3);
                System.out.println("1/4 of "+i+" is "+i/4);
                System.out.println("--------------------");
                System.out.println("");                
                System.out.println("");

            }
        }
    }
}
