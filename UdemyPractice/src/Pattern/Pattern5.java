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
 Pass1- 1 2 3 4 5
 Pass2- 1 2 3 4 5
 Pass3- 1 2 3 4 5
 Pass4- 1 2 3 4 5
 Pass5- 1 2 3 4 5

 * @author Sourav_Dash
 */
public class Pattern5 {
  public static void main(String[] args){
      for (int i = 1; i <= 5; i++) {
          System.out.print("Pass"+i+"-");
          for (int j = 1; j <= 5; j++) {
              System.out.print(j+" ");    
          }
          System.out.println("\n");
      }
     
  }
}
