package Java;

import java.util.Scanner;

public class Operators {
	public void operators() {
		//Relational Operators
		//Consider: inpitNum < 5 
		//The less-than < is an example of an relational operator
		//The input to < are inputtedNum & 5
		//The result of inputtedNum < 5 is a boolean so we call inputtedNum <5 a boolean expression
		//Relational Operators: > , < , == , >= , <=, !=
		
		System.out.println("Pick up a number between 1 and 10");
		Scanner input = new Scanner(System.in);
		int inputtedNum = input.nextInt();
		
		if(inputtedNum < 5) {
		System.out.println("true");
		}
		else {
			System.out.println("False");
		}
	}
}
