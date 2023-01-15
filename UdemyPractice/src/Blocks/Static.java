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
package Blocks;

/**
 *
 * @author Sourav_Dash
 */
class Static {
    static {
        int i=10;
        int j=10;
        System.out.println(i+j);
    }
}

class TestClass{
    public static void main(String[] args) {
       Static sc = new Static();
       
    }
}                                                
