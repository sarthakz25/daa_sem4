package daaprograms;

import java.util.*;

public class exp1q5 
{
	public static void main(String[] args)
	{
		int i, j, num, arr[], sum=0, mean=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of array elements:");
		num = sc.nextInt();
		System.out.println("enter the "+num+" elements ~");
		if(num<10)
		{
			arr = new int[num];
			for(i=0; i<num; i++)
			{
				System.out.println("enter element "+(i+1)+" of the array:");
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			System.out.println("the array elements are ~");
			for(j=0; j<num; j++)
			{
				System.out.print(arr[j]+" ");
			}
			mean = sum/num;
			System.out.println("\nthe sum of all elements = "+sum);
			System.out.println("the mean of all elements = "+mean);
		}
		else
		{
			System.out.println("the number should be less than 10\nplease try again :)");
		}
	}
}
