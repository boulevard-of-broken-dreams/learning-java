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
public class DeleteSubString {
    public static void main(String[] args) {
        System.out.println("Enter The String : ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();       
        System.out.println("Enter The SubString : ");
        String substring = sc.nextLine();
        char letter;
        int k=0;
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
//            System.out.println(string.charAt(i));
              letter = string.charAt(i);
              if (letter==substring.charAt(0)) {
//                  System.out.println(letter+"=="+substring.charAt(0)+"=="+"true");
                  for (int j = 0; j < substring.length(); j++) {
                      if (string.charAt(i+k)==substring.charAt(i+k)) {
                          System.out.println("Found");
                      }else{
                          continue;
                      }
                  }
              }
        }
        
    }
}
