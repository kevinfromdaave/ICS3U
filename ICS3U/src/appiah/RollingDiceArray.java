package appiah;
/*RollingDiceArray
 * Kevin Appiah
 * April 28, 2015
 * This program rolls a pair of dice twice, and shows how many times the outcome appears(proceed with errors)
 */

public class RollingDiceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		int dice1;
		int dice2;
		int sum;		
		int rolls = 10000;
		
		//Arrays
		String[] outcome = {"2","3","4","5","6","7","8","9","10","11","12"};
		int[] total = new int [11];
		
		//Calculations
		for (int i = 0; i<=rolls; i++){
			
			
			dice1 = (int)(Math.random()*6)+1;
			dice2 = (int)(Math.random()*6)+1;
			
			sum = dice1 + dice2;
			
			if(sum == 2){
				total[0]++;				
			}
			else if(sum == 3){
				total[1]++;
			}
			else if(sum == 4)
				total[2]++;
			else if(sum == 5)
				total[3]++;
			else if(sum == 6)
				total[4]++;
			else if(sum == 7)
				total[5]++;
			else if(sum == 8)
				total[6]++;
			else if(sum == 9)
				total[7]++;
			else if(sum == 10)
				total[8]++;
			else if(sum == 11)
				total[9]++;
			else if(sum == 12)
				total[10]++;
			
			
			
		
						
				
			
			
			
		}
		
		//Outcome
		
		for(int i = 0; i!=11; i++){
			System.out.println(outcome[i] + ": " + total[i] ); 
		}
			


		








	}

}
