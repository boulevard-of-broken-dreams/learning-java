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
public class LongShort {
    public static void main(String[] args){
        long s1 = 9000000;
        long s2 = 9000000;
        long s3 = s1 * s2;
        System.out.println(s3);
        
        short s4 = 3400;
        int s5 = (int) (s4 * 10000);
        System.out.println(s5);
    }
}
