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
class Triangle{
    int height;
    int width;

    Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    Triangle() {
    }
    
    Triangle(int n){
        height=width=n;
    }
    
    void display(){
        System.out.println("["+this.height+","+this.width+"]");
    }
    
    void area(){
        System.out.println(this.height*this.width);
    }
    
}

public class CostructorOverloading {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle();
        Triangle tr2 = new Triangle(100, 200);
        Triangle tr3 = new Triangle(20);
        tr1.display();
        tr1.area();
        tr2.display();
        tr2.area();
        tr3.display();
        tr3.area();
    }
}
