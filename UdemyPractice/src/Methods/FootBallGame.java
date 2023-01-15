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
public class FootBallGame {

	public static void main(String[] args) {
		int goalsHomeBarc = 2;
		int goalsAwayBarc = 1;
		int goalsHomeMad = 2;
		int goalsAwayMad = 1;
		int totalGoalsMad = goalsHomeMad + goalsAwayMad;
		int totalGoalsBarc = goalsHomeBarc + goalsAwayBarc;
		
		if(totalGoalsMad == totalGoalsBarc){
		    // When the overall result is even,
		    //goals scored away count double
		    // so we update the goals away for 
		    //each team and compare again.
		    goalsAwayBarc = goalsAwayBarc *2;
		    
		    // The 'variable *= X' operator means 
		    //the same as 'variable = variable * X'
		    goalsAwayMad *=2;
		    
		    // We calculate again the overall result
		     totalGoalsMad = goalsHomeMad + goalsAwayMad;
		    totalGoalsBarc = goalsHomeBarc + goalsAwayBarc;
		    
		    // We show the result
		    System.out.println("Overall Result is ");
		    System.out.print("F.C. Barcelona "+totalGoalsBarc);
		    System.out.println(" - Real Madrid "+totalGoalsMad);
		    
		    if(totalGoalsMad > totalGoalsBarc){
		        System.out.println("Madrid passes the round!");
		    }else{
		        System.out.println("Barcelona passes the round!");
		    }
		}else{
		    
		    // If the overall is not even 
		    // there is a clear winner.
		    System.out.println("Overall Result is ");
		    System.out.print("F.C. Barcelona "+totalGoalsBarc);
		    System.out.println(" - Real Madrid "+totalGoalsMad);
		    
		    if(totalGoalsMad > totalGoalsBarc){
		        System.out.println("Madrid passes the round!");
		    }else{
		        System.out.println("Barcelona passes the round!");
		    }
		}
	}
}
