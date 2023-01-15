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

class Rect{
    int length;
    int breadth;

    public Rect() {
    }

    public Rect(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public Rect(Rect r){
        this.length=r.length;
        this.breadth=r.breadth;
    }
    
    void display(){
        System.out.println("["+this.length+","+this.breadth+"]");
    }
}

/**
 *
 * @author Sourav_Dash
 */
public class CopyConstructor {
    public static void main(String[] args) {
        Rect r1 = new Rect();
        Rect r2  = new Rect(10,20);
        Rect r3 = new Rect(r1);
        Rect r4 = new Rect(r3);
        r1.display();;
        r2.display();
        r3.display();
        r4.display();
    }
}
