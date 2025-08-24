import java.util.Scanner;

public class PaintingWallArea {
	public static void main(String[] args) {
		double length,breadth,height, doorLength,doorBreadth,windowLength,windowBreadth,wallArea,doorArea,windowArea,paintArea,whiteWashArea;
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter room length: ");
          	length = sc.nextDouble();
        	System.out.print("Enter room breadth: ");
        	breadth = sc.nextDouble();
        	System.out.print("Enter room height: ");
        	height = sc.nextDouble();

        	System.out.print("Enter door length: ");
        	doorLength = sc.nextDouble();
        	System.out.print("Enter door breadth: ");
        	doorBreadth = sc.nextDouble();

        	System.out.print("Enter window length: ");
        	windowLength = sc.nextDouble();
        	System.out.print("Enter window breadth: ");
        	windowBreadth = sc.nextDouble();
        	
        	wallArea = 2 * height * (length + breadth);
        	doorArea = doorLength * doorBreadth;
        	windowArea = windowLength * windowBreadth;

        	paintArea = wallArea - (doorArea + 2 * windowArea);
        	whitewashArea = length * breadth;

        	
        	System.out.println("Area to be painted (walls): " + paintArea);
        	System.out.println("Area to be whitewashed (roof): " + whitewashArea);

         }
}
