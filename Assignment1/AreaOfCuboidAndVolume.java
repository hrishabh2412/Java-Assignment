import java.util.Scanner;
	public class AreaOfCuboidAndVolume{
		public static void main(String[] args){
		float l,b,h;
		double area,volume;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length : ");
		l = sc.nextFloat();

		System.out.println("Enter Breadth : ");
		b = sc.nextFloat();

		System.out.println("Enter Height : ");
		h = sc.nextFloat();

		area = 2 *(l*b + b*h + h*l);
		volume = l*b*h;

	System.out.println("Surface Area :" +area);
	System.out.println(" Volume :" +volume);

		
}
}