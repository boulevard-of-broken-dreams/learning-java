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
package Array;

/**
 *
 * @author Sourav_Dash
 */
public class Array1 {
   static int foo(String x, int number, int[] array){
        number = array.length;
        x = x + "xAtfoo";
        for (int i=0; i < number; i++){
            array[i] = array[i] + x.length();
            System.out.println(array[i]);
        }
        x = x + "Success";
        return x.length();
    }
    static void bar(){
        String s = new String("Hello");
        int num = 6;
        int [] array = {1, 2, 3, 4};
        int result;
        result = foo(s, num, array);
        System.out.println(result);
    } 
    
    public static void main(String[] args) {
        //bar();
        int [] arr = {25, 7, 7, 14, 14, 14, 21, 3, 3, 3, 5, 12, 12, 13, 13};
        System.out.println(countSorted(arr));
    }
    
    static int countSorted(int[] array){	
         int count = 1; 
         int max = 1;
     for (int k = 1; k < array.length; k++) {
         if (array[k-1] <= array[k]) {
             count++;
         } else {
             if (count > max) {
                 max = count;
             }
             count = 1;
         }
     }
     return max;
 }
}
