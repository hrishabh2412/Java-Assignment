import java.util.Scanner;
	public class ToFindFinalVelocityAndDistance{
		public static void main(String[] args){
		float u,a,t,v,s;
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter Inital Velocity  : ");
		u = sc.nextFloat();
		System.out.println("Enter Acceleration : ");
		a = sc.nextFloat();
		System.out.println("Enter Time : ");
		t = sc.nextFloat();

		v=u+a*t;
		s = (u * t) + (0.5f * a * t * t);

	System.out.println("Final Velocity : " +v);
	System.out.println("Distance : " +s);

		
}
}