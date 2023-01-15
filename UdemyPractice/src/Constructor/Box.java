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
class Box1{
    int height;
    int weight;
    int length;
    int color;
    
    Box1() {
    }
    
    Box1(int h,int w,int l){
        this.height = h;
        this.weight = w;
        this.length = l;
    }

    Box1(int h, int w, int l, int c) {
        this(h,w,l);
        this.color = c;
    }
    
    Box1(int n,int c){
        this(n,n,n,c);
    }
    
    Box1(Box1 b1){
        this(b1.height,b1.weight,b1.length,b1.color);
    }
    
    void display(){
        System.out.println("["+this.height+","+this.weight+","+this.length+","+this.color+"]");
    }
}

public class Box {
    public static void main(String[] args) {
        Box1 b1 = new Box1();
        Box1 b2 = new Box1(2,4,7);        
        Box1 b3 = new Box1(5,4,7,000);
        Box1 b4 = new Box1(5,000);
        Box1 b5 = new Box1(b4);
        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
    }
}
