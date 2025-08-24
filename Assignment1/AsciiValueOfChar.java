import java.util.Scanner;

public class AsciiValueOfChar {
    public static void main(String[] args) {
	char ch;
	int  ascii;
	 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0); 
        ascii = (int) ch;  

        System.out.println("The ASCII value of '" + ch + "' is: " + ascii);

	}
}
