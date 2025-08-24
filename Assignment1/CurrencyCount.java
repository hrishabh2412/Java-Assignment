import java.util.Scanner;

public class CurrencyCount{
	public static void main(String[] args){
		int num,countof10,countof5,countof1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Amount :");
		num = sc.nextInt();

		countof10 = num / 10;
		countof5 = (num%10)/5;
		countof1 = (num%10)%5;
		
		System.out.println("Count of 10 :"+countof10);
		System.out.println("Count of 5 :"+countof5);
		System.out.println("Count of 1 :"+countof1);
}
}