package mid;
import java.util.Scanner;
public class linear {

	static int index = -1;
public static void liner() {
	 int array [] = {10,20,30,40,50,60,70,80,90,100};
     System.out.print("enter the number you need:");
    Scanner s = new Scanner(System.in);
	   int target= s.nextInt();
	   
     for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				System.out.println(+target+" is found at inde: "+i);
				index = i;
				break;
			}
		}
		if(index==-1) {
			System.out.println(+target+" is not found!");
		}
	
	
	
     
}

public static void main(String[] args) {
	liner();
	while(index==-1)
	{
		liner();
	}
}



}

