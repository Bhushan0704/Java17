package Java;

import java.util.Scanner;

//Assestment
// 1 .Create a MCQ test 

public class Assestment {

	public void assestment() {
		
		String question = "Which of the following is odd number = Choice a= 2, Choice b = 3, Choice c = 4";
		String choiceOne = "2";
		String ChoiceTwo = "3";
		String ChoiceThree = "4";
		
		String CorrectAns = ChoiceTwo;
		
		System.out.println(question);
		
		System.out.println("choose one of the following:" + choiceOne + " " + " "+ ChoiceTwo + " " + ChoiceThree);
		
		try (Scanner sc = new Scanner(System.in)) {
			String input = sc.next();
			
			if(CorrectAns.contentEquals(input)) {
				System.out.println("Congrats, your answer is correct");
			}
			else {
				System.out.println("Incorrect Answer, The Correct Answer is" + CorrectAns);
			}
		}
	}
}
