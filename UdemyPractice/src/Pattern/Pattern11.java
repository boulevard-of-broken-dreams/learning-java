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
 * 1+1/2+1/3+1/4+.........+1/n
 * @author Sourav_Dash
 */
import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args){
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row : ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            str += "(1+"+i+")/";
        }
        System.out.println(str);
    }
}
