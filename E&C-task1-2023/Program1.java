
/**
 * Write a program to accept a number from the user and check if .
 * it’s prime, coprime or circular prime.
 * Author: mihiran chakraborty
 * 
 */
import java.util.*;
public class Program1
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Enter the number to check if the previous number is coprime");
        int m=sc.nextInt();//taking the users input
        int c=n/2;
        int x=0;
        if(n==0||n==1)
        {
            System.out.println(n+" is not a prime number");
        }
        else 
        {
            for(int i=2;i<=c;i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+" is not a prime number");
                    x=1;
                    break;//checking for factors
                }
            }
            if(x==0)
            {
                System.out.println(n+" is a prime number");//output for function 1: checking for prime numbers
            }
        }
        int y = 1;
        int min, max;
        min = n;
        if (min > m)
        {
            min = m;
            max = n;
        }
        else
        {
            min = n;
            max = m;
        }
        while (max > min)//checking for common factors
        {
            int r = max % min;
            if (r == 0)
            {
                y = min;
                break;
            }
            else
            {
                max = min;
                min = r;
            }
        }
        if (y == 1)
        {
            System.out.println("Co Prime Numbers");
        }
        else
        {
            System.out.println("Not Co Prime Numbers");
        }//final output for function 2: checking whether two numbers are coprime
        boolean flag = true;
        int num, r, o = 0;
        num = n;
        while(num>0)
        {
            r = num % 10;
            o++;
            num = num / 10;
        }
        num=n;
        for(int i=1;i<=o;i++)
        {
            r=num % 10;
            num=num / 10;
            num=(r*(int)Math.pow(10,o-1))+num;
            if(!prime(num))
            {
                flag=false;
                break;
            }
        }//creating each permutation of the entered number and feeding it to prime method, note: needed some help with this part
        if(flag)
        {
            System.out.println("Circular Prime");
        }
        else
        {
            System.out.println("Not Circular Prime");
        }//final output for function 3: checking if the inputed number is circular prime
    }
    static boolean prime(int n)//checking whether each permutation is prime
    {
        int i=2;
        boolean flag=true;
        while(n>i)
        {
            if(n%2==0)
            {
                flag=false;
                break;
            }
            i++;
        }
        return flag;
    }
}
