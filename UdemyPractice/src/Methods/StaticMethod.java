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

/**
 *
 * @author Sourav_Dash
 */
public class StaticMethod {
    int nonStatic = 12;
    public static void main(String[] args) {
        System.out.println("main() Method Execution Starts");
        StaticMethod sm = new StaticMethod();
        System.out.println(sm.nonStatic);
        method1();
        System.out.println("main() Method Execution Ends");
   }
    
   static void method1(){
       System.out.println("Method1() Execution Starts");
       System.out.println("Method1() Execution Ends"); 
  }
}
