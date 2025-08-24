import java.util.Scanner;
 	public class SurfaceAreaAndVolumeOfCylinder{
		public static void main(String [] args){
		float r,h;
		double SurfaceArea,Volume;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius : ");
		r = sc.nextFloat();

		System.out.println("Enter Height : ");
		h = sc.nextFloat();

		SurfaceArea = 2*Math.PI*r*r + 2*Math.PI*r*h;
		Volume = Math.PI*r*r*h;

	System.out.println("SurfaceArea is: "+SurfaceArea);
	System.out.println("Volume is : " +Volume);
}
}
		