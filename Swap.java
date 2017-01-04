import java.util.Scanner;
public class Swap {

	public static void main(String[] args) 
	 {
	      Scanner input = new Scanner(System.in);
	        System.out.println("Enter two numbers :");
	         System.out.println("num1 :");
	        int a = input.nextInt();
	         System.out.println("num2 :");
	        int b = input.nextInt();
	        a = a+b;
	        b = a-b;
	        a = a-b;
	     
			System.out.println("After Swap");
	        System.out.println("the value of num1 : " +a);
	        System.out.println("the value of num2 : " +b);
	        
	        input.close();
	    }
	
	

}
