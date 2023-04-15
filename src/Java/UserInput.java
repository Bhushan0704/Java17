package Java;

import java.util.Scanner;

public class UserInput {
	
	public void userInput() {
	double StudentGPA;
	try (Scanner input = new Scanner(System.in)) {
		StudentGPA = input.nextDouble();
	}
	System.out.println("Enter Student GPA: " + StudentGPA);
}
}
