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
import java.util.Scanner;
/**
1	
2	2	
3	3	3	
4	4	4	4	
5	5	5	5	5	
 * 
 * @author Sourav_Dash
 */
public class Pattern41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Row: ");
        int row = sc.nextInt();
        System.out.println("");
        int n = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n+"\t");
            }
            System.out.println("");
            n++;
        }
    }
}
