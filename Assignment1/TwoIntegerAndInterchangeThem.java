import java.util.Scanner;
	public class TwoIntegerAndInterchangeThem{
		public static void main(String[] args){
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		a = sc.nextInt();
		System.out.println("Enter b : ");
		b = sc.nextInt();

		
	        System.out.println("Using + And – operator ");	

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a : " +a);
		System.out.println("b : " +b);
		System.out.println("Using / and * operator ");

		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println("a : " +a);
		System.out.println("b : " +b);

	  
	
}
}