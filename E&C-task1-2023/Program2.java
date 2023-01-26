
/**
 * Write a program to accept a number from the user and display it in reverse order
 *
 *  Author: Mihiran Chakraborty
 * 
 */
import java.util.Scanner;
public class Program2
{
    void main()
    {
        int a,reverse=0,r,x=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        a=sc.nextInt();//accepting the users input
        while(a!=0)//so that digits of each place value are considered
        {
            r=a%10;
            reverse=reverse*x+r;
            a/=10;
        }
        System.out.println("The reversed number is "+ reverse);//final output
    }
}
