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
package Constructor;

/**
 *
 * @author Sourav_Dash
 */
class Employee{
    String name;
    static int id=100;
    Employee(String name){
        this.name=name;
        ++id;
    }
    
    void Display(){
        System.out.println(this.name);
        System.out.println(id);
    }
}

public class main {
    public static void main(String[] args) {
        Employee e = new Employee("Sourav Dash");
        e.Display();
    }
}
