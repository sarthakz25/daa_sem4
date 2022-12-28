package daaprograms;

import java.util.*;

public class insort 
{
	public static void main(String[] args)
	{
		int i, j, num, arr[], key;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of array elements:");
		num = sc.nextInt();
		arr = new int[num];
		System.out.println("enter the "+num+" elements ~");
		for(i=0; i<num; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("the unsorted array is ~");
		for(i=0; i<num; i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(i=1; i<num; i++)
		{
			key = arr[i];
			j = i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		System.out.println("\nthe sorted array is ~");
		for(i=0; i<num; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
