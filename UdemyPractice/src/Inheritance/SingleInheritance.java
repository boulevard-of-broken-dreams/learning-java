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
class Tree{
    void show(){
        System.out.println("2.0");
    }
}

class Leaf extends Tree{
    void show(){
        System.out.println("3.0");
    }
}

class Root extends Tree{
    void show(){
        System.out.println("4.0");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Leaf l = new Leaf();
        l.show();
        Root r = new Root();
        r.show();
    }
}
