
/**
 * Write a program to display the ASCII code of the number/letter entered by the user
 *
 * Author: Mihiran Chakraborty
 * 
 */
import java.util.Scanner;
public class Program3
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char x=sc.next().charAt(0);//accepting user input
        int y=x;//datatype conversion
        System.out.println("The ASCII value of the given character is "+ y);//final output
    }
}
