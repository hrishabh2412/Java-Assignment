import java.util.Scanner;
 public class AreaAndCircumference{
	public static void main(String[] args){
		float r;
		double area,circum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius :");
		r = sc.nextFloat();

		area= Math.PI*r*r;
		circum = 2*Math.PI*r;

	System.out.println("Area is :" +area);
	System.out.println("Circumference is :" +circum);
		
	
	
   }	

}

	