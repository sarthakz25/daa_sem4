package exp1;

import java.util.*;

public class exp1q2 
{
	public static void main(String[] args)
	{
		int i, j, num, arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of array elements:");
		num = sc.nextInt();
		arr = new int[num];
		System.out.println("enter the "+num+" elements ~");
		for(i=0; i<num; i++)
		{
			System.out.println("enter element "+(i+1)+" of the array:");
			arr[i] = sc.nextInt();
		}
		System.out.println("the array elements are ~");
		for(j=0; j<num; j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println("\nthe array elements in reverse are ~");
		for(j=num-1; j>=0; j--)
		{
			System.out.print(arr[j]+" ");
		}
	}
}
