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
class Check{
    int i;
    void display(){
        System.out.println(i);
    }
}

public class AcessingVariable3 {
    public static void main(String[] args) {
        Check c1 = new Check();
        Check c2 = new Check();
        c1.i=100;
        c2.i=200;
        c1.display();
        c2.display();
    }
}
