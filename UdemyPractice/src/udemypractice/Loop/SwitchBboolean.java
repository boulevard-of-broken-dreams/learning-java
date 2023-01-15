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
package udemypractice.Loop;

import java.util.Scanner;

/**
 *
 * @author Sourav_Dash
 */

public class SwitchBboolean {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Boolean Value: ");
        boolean day = sc.nextBoolean();
         System.out.println(day);
        
//        switch(day){
//            case true :
//                System.out.println("His name is Sourav Kumar Dash.");
//                break;
//            case false :
//                System.out.println("His Name is Anil Kumar Dash.");
//                break;
//            default:
//                System.out.println("This name is not present in our Application.");
//        }
         System.out.println("We Can't use Boolean value in switch case.");
    }
}
