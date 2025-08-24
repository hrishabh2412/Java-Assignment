import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args){
	float r;
	double area;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Radius : ");
	r = sc.nextFloat();

	area = Math.PI*r*r;

	System.out.println("Area is :"+area);
	
   }
}
   
