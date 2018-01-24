import java.util.Scanner;

public class IntFacts {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int userNum;
		String name;
		boolean isOdd;
		boolean isEven;
		String a;
		
		System.out.print("Please enter your name: ");
		name = input.next();
		
		do {
			isOdd = false;
			isEven = false;
			System.out.print("Enter a number from 1 to 100: ");
		
			userNum = input.nextInt();
			System.out.print(name +"'s number is ");
		
			if (userNum % 2 == 0) {
				isEven = true;
			} else {
				isOdd =  true;
			}
		
			if (userNum >= 2 && userNum <= 25 && isEven){
				System.out.println("Even and less than 25");
			} else if (isEven && userNum <= 60 && userNum >= 26) {
				System.out.println("Even");
			} else if (userNum > 60 && isEven) {
				System.out.println(userNum +"Even");
			} else if (userNum > 60 && isOdd) {
				System.out.println(userNum + " Odd and over 60");
			} else if (isOdd) {
				System.out.println("Odd");
			} else {
				System.out.println("Invalid!");
			}
			System.out.println("Continue, " + name + "? (y/n)");
			a = input.next();
		} while (a.equals("Y") || a.equals("y"));
	System.out.println("Program terminated\nGoodbye " + name);
	}

}
