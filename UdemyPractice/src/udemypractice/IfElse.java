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
public class IfElse {
    public static void main(String[] args) {
        int number = 58;
         if (number >= 80 && number < 100) {
             System.out.println("Your grade is A for "+number);
        } else if(number >= 50 && number < 80){
            System.out.println("Your grade is B for "+number);
        }else if(number >= 30 && number < 50){
            System.out.println("Your grade is C for "+number);
        }else{
            System.out.println("Your grade is D for "+number);
        }
         
        if (number > 60) {
            System.out.println("Thanks For Attending The Exam.");
        }else{
            System.out.println("You may re-attend the exam.");
        }
    }
}
