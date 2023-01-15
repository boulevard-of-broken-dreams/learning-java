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
package Methods;

import java.util.Scanner;

/**
 *
 * @author Sourav_Dash
 */
public class Array {
    public static void main(String[] args) {
        int myArray[] = new int[8];
        for (int i = 0; i < myArray.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Value");
            int x = sc.nextInt();
            myArray[i]=x;
        }
        
        for (int j = 0; j < myArray.length; j++) {
            System.out.println("The value of arr["+j+"]"+"="+myArray[j]);
            
        }
    }
}
