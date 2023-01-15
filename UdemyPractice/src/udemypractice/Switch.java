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
public class Switch {
    public static void main(String[] args) {
        String language ="Node";
        
        switch(language){
            case "Node":
                System.out.println("This is Builtin On Top Of Chrome V8 Engine.");
                break;
            case "Java":
                System.out.println("This is Devloped By Sun MicroSYstems.");
                break;
            case "C":
                System.out.println("This is Core Language of all Language");
                break;
            case "C++":
                System.out.println("This is Builtin On Top Of C.");
                break;
            case "Javascript":
               System.out.println("This Most widely Used and Popular Language Of Web.");
               break; 
            default:
                System.out.println("I don't Know What the Language is.");
        }
    }
}
