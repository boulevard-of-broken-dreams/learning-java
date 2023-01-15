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
class Phone{
    void Display(){
        System.out.println("Version 1.0");
    }
}

class CellPhone extends Phone{
    @Override
    void Display(){
        System.out.println("Version 2.0");
    }
}

class Inheritance{
    public static void main(String[] args) {
        CellPhone c = new CellPhone();
        c.Display();
    }
}