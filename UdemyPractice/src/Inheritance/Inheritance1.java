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
package Inheritance;

/**
 *
 * @author Sourav_Dash
 */
class Inheritance1 extends Object{
    int i = 346;
    public void display(){
        System.out.println("The value is "+i);
    }
}

class Inheritance2 extends Inheritance1{
    int j = 2356;
    void show(){
        System.out.println("The value is "+j);
    }
}

class main{
    public static void main(String[] args) {
        Inheritance2 i1 = new Inheritance2();
        i1.display();
        i1.show();
    }
}
