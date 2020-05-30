package mid;

import java.util.Scanner;

public class pp {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		System.out.println("This program calculat the submtion for three numbers.");
	     Scanner s = new Scanner(System.in);
	     System.out.print("Pleas enter the first number:");
		 num1= s.nextInt();
		 System.out.print("Pleas enter the second numbe:");
		 num2=s.nextInt();
		 System.out.print("Pleas enter the third number:");
		 num3=s.nextInt();
	     System.out.println("the submtion for the three numbers you enter="+ (num1+num2+num3) +".");

	}

}
