package Java;

import java.util.Scanner;

public class Loops {
	public void loop() {
		// Music Player Example
		
		Scanner scanner = new Scanner(System.in);
		
		Boolean isOnRepeat = true;
		
		while(isOnRepeat) {
			System.out.println("Playing same song again");
			System.out.println("Confirm Repeat");
			
			scanner.next();
			String input = scanner.next();
			if("Yes".equals(input)) {
				isOnRepeat = false;
			}
		}
		System.out.println("Playing Next Song");
	}
}
