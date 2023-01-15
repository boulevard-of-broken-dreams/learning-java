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
package Methods;

/**
 *
 * @author Sourav_Dash
 */
public class AcessingVariable {
    int i;
    static int j;
    public static void main(String[] args) {
        int h=123;
        AcessingVariable.j=30;
        AcessingVariable av = new AcessingVariable();
        av.i=100;
        System.out.println(h);
        System.out.println(AcessingVariable.j);
        System.out.println(av.i);
    }
}
