import java.util.Scanner;

public class EmployeeSalary{
   public static void main (String[] args){
	float da,hra,tax,basicSalary, totalSalary;
	int id;
	String name;

	Scanner sc= new Scanner(System.in);

	System.out.println("Enter Employee Details:");

	System.out.println("ID : ");
	id = sc.nextInt();

	System.out.println("Name : ");
	name = sc.nextLine();
	name = sc.nextLine();


	System.out.println("Basic Salary : ");
	basicSalary = sc.nextFloat();

	System.out.println("DA (%) : ");
	da = sc.nextFloat();

	System.out.println("HRA (%) : ");
	hra = sc.nextFloat();

	System.out.println("TAX (%) : ");
	tax = sc.nextFloat();


	totalSalary = basicSalary + ((basicSalary*(da+hra-tax))/100);

	System.out.println("Total Salary : "+ totalSalary);


}

}
