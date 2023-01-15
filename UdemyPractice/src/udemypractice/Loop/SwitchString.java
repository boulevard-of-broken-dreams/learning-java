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

/**
 *
 * @author Sourav_Dash
 */
import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String day = sc.next();
        
        switch(day){
            case "sourav" :
                System.out.println("His name is Sourav Kumar Dash.");
                break;
            case "anil" :
                System.out.println("His Name is Anil Kumar Dash.");
                break;
            case "panda" :
                System.out.println("His Name is Panda.");
                break;
            default:
                System.out.println("This name is not present in our Application.");
        }
    }
}
