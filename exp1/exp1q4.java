package daaprograms;

import java.util.*;

public class exp1q4 
{
	public static void main(String[] args)
	{
		int i, j, num, arr1[], arr2[];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of array elements:");
		num = sc.nextInt();
		arr1 = new int[num];
		arr2 = new int[num];
		System.out.println("enter the "+num+" elements ~");
		for(i=0; i<num; i++)
		{
			System.out.println("enter element "+(i+1)+" of the array:");
			arr1[i] = sc.nextInt();
		}
		for(i=0; i<num; i++)
		{
			arr2[i] = arr1[i];
		}
		System.out.println("the array 1 elements are ~");
		for(j=0; j<num; j++)
		{
			System.out.print(arr1[j]+" ");
		}
		System.out.println("\nthe array 2 elements are ~");
		for(j=0; j<num; j++)
		{
			System.out.print(arr2[j]+" ");
		}
	}
}
