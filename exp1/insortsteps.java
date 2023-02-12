package daaprograms;

import java.util.*;

public class insortsteps 
{
	public static void main(String[] args)
	{
		int i, j, k, num, arr[], swap = 0, comp = 0, key;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of array elements:");
		num = sc.nextInt();
		arr = new int[num];
		System.out.println("enter the "+num+" elements:");
		for(i=0; i<num; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("the unsorted array is ~");
		for(i=0; i<num; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nthe sorting steps are:");
		for(i=1; i<num; i++)
		{
			key = arr[i];
			j = i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1] = arr[j];
				j--;
				comp++;
				swap++;
			}
			arr[j+1] = key;
			if(j>=0)
			{
				if(arr[j]<key)
				{
					comp++;
				}
			}
			for(k=0; k<num; k++)
			{
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
		System.out.println("the sorted array is ~");
		for(i=0; i<num; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("number of comparisons = "+comp);
		System.out.println("number of swaps = "+swap);
	}
}
