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

public class FibbonaciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter The Range : ");
        int range = sc.nextInt();
        
        int num1 = 0;
        int num2 = 1;
        int num3 =0;
        System.out.print(num1+","+num2+",");
        for (int i = 1; i <= range; i++) {
            num3 = num1 + num2;
            System.out.print(num3+",");
            num1 = num2;
            num2 = num3;
        }
    }
}
