 //Class: CMSC203 CRN 32295
 //Program: Assignment #
 //Instructor: Ahmad Tarek
 //Summary of Description: This program is the driver for a code that was provided to us by the department.
//The original code provided us a random number and we needed to build a code that will let the user play with the random code.
 //Due Date: MM/DD/YYYY (<02/23/2021>)
 //Integrity Pledge: I pledge that I have completed the programming assignment independently.
 //I have not copied the code from a student or any source.
//My name : Sagiv Reich


import java.util.Scanner; 
public class DriverForCode {

	public static void main(String[] args) {
		int i=0;
		String again ="yes";
		while(again.equalsIgnoreCase("yes"))
		{
			int result1;
			Scanner answer1 = new Scanner(System.in);
			RNG randnum = new RNG(); // declare the code from the original cod that was provided
			int highrange=100;
			int lowrange=0;
			int theAnswer = randnum.rand();
			// define the variables at the beggining of the program
			
			
			System.out.println(" Please enter an number between 0-100");
		// ask the user to enter a number
		
		 highrange=100;
		 lowrange=0;
		
		
	System.out.println (theAnswer);
			
					for(i=0;i<15;i++) // for loop will run maximum 15 times before it will end. 
					{
						int userAnswer=answer1.nextInt(); //users answer
						if (userAnswer < 0 || userAnswer>100) { // make sure user dont submit number bellow 0 and beyond 100
							System.out.println ("ERROR Try again");
						 userAnswer=answer1.nextInt(); //give the user another chance to submit his guess
					}
						{
						if (userAnswer>theAnswer) { 
							highrange=userAnswer;
							System.out.println ("Almost - now try between"+lowrange+"-"+userAnswer);
							//if the user submitted a number that is greater than the answer then it will 
							//change the max number and give the user a new range
						}
						if( userAnswer<theAnswer) {
							lowrange=userAnswer;

							System.out.println ("Almost - now try between"+userAnswer+"-"+highrange);
							//if the user submitted a number that is bellow the answer then it will 
							//change the min number and give the user a new range
							
						}
						if (userAnswer == theAnswer) {

							System.out.println  ("well done ! ");
						break;
						
						// if the user ggot the right answer he will get a "well done" line and 
						//will go to the next step which is the question if the user want to continue to play
						}
						i++;
						}
					}
					
					answer1.nextLine();
				
					System.out.println ("Again?");
					// ask the user if he wants to continue to play
                    
                    again = answer1.nextLine ();
		
		}
		System.out.println("Program finished. Thank you, Sagiv Reich");
		// if no - program is done.
	}
			
			

}
