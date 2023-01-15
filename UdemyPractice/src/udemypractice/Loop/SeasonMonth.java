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

public class SeasonMonth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month in Number range from 1-12 : ");
        
        int month = sc.nextInt();
        switch(month){
            case 1  :
            case 2  :
            case 12 :
                System.out.println("The Current Season of this month is Winter");
                break;
            case 3  :
            case 4  :
            case 5  :
                System.out.println("The Current Season of this month is Spring");
                break;
            case 6  :
            case 7  :
            case 8  :
                System.out.println("The Current Season of this month is Summer");
                break;
            case 9  :
            case 10 :
            case 11 :
                System.out.println("The Current Season of this month is Winter");
                break;
            default:
                System.out.println("Your Input is Invalid");
        }
    }

    private static void function() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
