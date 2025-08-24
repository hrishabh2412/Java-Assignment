import java.util.Scanner;
	public class ArithmeticAndHarmonicMean{
		public static void main(String[] args){
		int a,b;
		float am,hm;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Two numbers :");
		a = sc.nextInt();
		b = sc.nextInt();

		am = (a+b)/2;
		hm = (a*b)/(a+b);

	System.out.println("Arithmetic Mean : " +am);
	System.out.println("Harmonic Mean : " +hm);

}
}