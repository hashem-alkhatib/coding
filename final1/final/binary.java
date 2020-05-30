package mid;
import java.util.Scanner;
import java.util.Arrays;
public class binary {
	static int last;
	static int first;
	 public static void bainary(){  
		 System.out.print("enter the number you need:");
			Scanner s = new Scanner(System.in);
			int target= s.nextInt();   
		    int array[] = {88,66,7,4,5,70,20,8,0,80};
		    Arrays.sort(array);
	       last =array.length-1; 
	       first=array[0];
	        int mid = (first + last)/2;  
			   while( first <= last ){  
			      if ( array[mid] < target ){  
			        first = mid + 1;     
			      }else if ( array[mid] == target ){  
			        System.out.print(+target+ " is found at index: " + mid);  
			        break;  
			      }else{  
			         last = mid - 1;  
			      }  
			      mid = (first + last)/2;  
			   }  
			   if ( first > last ){  
			      System.out.println(+target+ " is not found!");  
			   }  
			 }
	 
	 public static void main(String[] args) {
			bainary();
			while(first > last)
			{
				bainary();
			}
		}

	 
	        
	 } 
