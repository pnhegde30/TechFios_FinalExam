package projectsExam;

import java.util.*;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random ranNum = new Random();
		int count; 
		int[] numberArray = new int[500]; //Generating 500 numbers
		numberArray[0] = ranNum.nextInt(1000); //Initialize first number
		int largest = numberArray[0]; 
		int smallest = numberArray[0];
		
		System.out.println("Random Numbers: ");
		for (count = 1; count < 500; count++) {
			numberArray[count] = ranNum.nextInt(1000); //store numbers
			largest = Math.max(largest, numberArray[count]); //compare with previous largest 
			smallest = Math.min(smallest, numberArray[count]); //compare with previous smallest
			
			System.out.println(numberArray[count]);
			
		}
		
		System.out.println("The smallest is: " + smallest);

	}

}
