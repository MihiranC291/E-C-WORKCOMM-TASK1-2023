
/**
 * write a program to find the minimum and maximum element of the array
 *
 * Author: Mihiran Chakraborty
 * 
 */
import java.util.Scanner;
public class Program4
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int intarray[];
        intarray=new int[10000];//allocating memory to the array
        int min,max;
        System.out.println("Please enter the length of the array");
        int l=sc.nextInt();
        System.out.println("Enter your numerical elements");//accepting the elements from the user
        for(int i=0;i<=l-1;i++)//entering the elements into the array
        {
            int b=sc.nextInt();
            intarray[i]=b;
        }
        min=max=intarray[0];
        for(int j=1;j<=l-1;j++)//to find the required minimum and maximum values by comparisons with a loop
        {
            if(min>intarray[j])
            {
                min=intarray[j];
            }
            if(max<intarray[j])
            {
                max=intarray[j];
            }
        }
        System.out.println("The maximum value of the array is "+max);
        System.out.println("The minimum value of the array is "+min);//final output
    }
}
