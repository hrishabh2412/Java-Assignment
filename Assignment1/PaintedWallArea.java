import java.util.Scanner;

public class PaintingWallArea {
	public static void main(String[] args) {
		double length,breadth,height,
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter room length: ");
          	length = sc.nextDouble();
        	System.out.print("Enter room breadth: ");
        	breadth = sc.nextDouble();
        	System.out.print("Enter room height: ");
        	height = sc.nextDouble();

        	// Door dimensions
        	System.out.print("Enter door length: ");
        	double doorLength = sc.nextDouble();
        	System.out.print("Enter door breadth: ");
        	double doorBreadth = sc.nextDouble();

        	// Window dimensions
        	System.out.print("Enter window length: ");
        	double windowLength = sc.nextDouble();
        	System.out.print("Enter window breadth: ");
        	double windowBreadth = sc.nextDouble();

        	// Areas
        	double wallArea = 2 * height * (length + breadth);
        	double doorArea = doorLength * doorBreadth;
        	double windowArea = windowLength * windowBreadth;

        	double paintArea = wallArea - (doorArea + 2 * windowArea);
        	double whitewashArea = length * breadth;

        	// Output
        	System.out.println("Area to be painted (walls): " + paintArea);
        	System.out.println("Area to be whitewashed (roof): " + whitewashArea);

         }
}
