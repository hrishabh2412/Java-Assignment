import java.util.Scanner;

public class PreAndNextCharacter {
    public static void main(String[] args) {
	char ch,pre,next;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0); 
        pre = (char)(ch - 1);
        next = (char)(ch + 1);

        System.out.println("The previous character is " + pre);
        System.out.println("The next character is " + next);

       
    }
}
