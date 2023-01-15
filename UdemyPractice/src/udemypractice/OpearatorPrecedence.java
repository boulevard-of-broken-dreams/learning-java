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
public class OpearatorPrecedence {
    public static void main(String[] args){
        System.out.println(3*(5%7));// 3*5=15
        System.out.println(3*5%7);//15%7=1
        System.out.println(3 + 5 % 7);//3+5=8
        System.out.println(( 3 + 5) % 7);//8%7=1
        System.out.println(6 * 5 + 11 % 20);//30+11=41
        System.out.println(( 6 * ( 5 + 11 ) ) % 20);//(6*16)%20)=16
    }
}
