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
public class BloodType {
    public static void main(String[] args) {
        System.out.println("Enter the Blood Type.");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        switch(s){
            case "A":
                System.out.println("You Should Focus on vegetable, grains, legumes and beans");
                break;
            case "B":
                System.out.println("You Should Focus on red meat, fruits, vegetables and dairy");
                break;    
            case "AB":
                System.out.println("You Should Focus on lean meat, seafood, dairy, vegetables and legumes");
                break;
            case "O":
                System.out.println("You Should Focus on high proteins in meat and fish, reduce carb intake, avoid dairy");
                break;
            default:
                System.out.println("No Blood Group Match Found.");
        }
    }
}
