import java.util.*;

public class Main{
	
	public static void main(String[] args){
		System.out.println("Hello");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first number : ");
		int firstNum = input.nextInt();
		
		System.out.print("Enter your Second number : ");
		int secondNum = input.nextInt();
		
		int subResult = Galal.sub(firstNum, secondNum);
		System.out.println("Sub result is " + subResult);
		
		int mulResult = sayed.multiply(firstNum,secondNum);
		System.out.println("mul result " + mulResult);
	}

}