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
public class Prime {
    public static void main(String[] args) {
        int num = 5;
        int count = 0;
        int range = num/2;
        
        for (int i = 2; i <= range; i++) {
            if (num%i==0) {
                count += 1;
                break;
            }
        }
        
        if (count==0) {
            System.out.println(num+" is Prime Number.");
        }else{
            System.out.println(num+" isn't Prime Number.");
        }
    }
}
