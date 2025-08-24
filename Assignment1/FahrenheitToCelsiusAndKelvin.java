import java.util.Scanner;
	public class FahrenheitToCelsiusAndKelvin{
		public static void main(String[] args){
		float f;
		double celsius,kelvin;
		Scanner sc = new Scanner(System.in);
		System.out.println("Fahrenheit is : ");
		f = sc.nextFloat();

		celsius = 5 * (f-32)/9;
		kelvin = celsius + 273.15;

	System.out.println("celsius is : " +celsius);
	System.out.println("kelvin is : "+kelvin);

		
}
}