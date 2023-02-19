package exp5;

import java.util.*;

public class mergesort 
{
	void merge(int left[], int right[], int arr[]) //function to merge left and right subarrays into og array
	{
		int sizeL = left.length;
		int sizeR = right.length;
		int i=0, j=0, k=0; //i = smallest unpicked in L, j = smallest unpicked in R, k = index to fill in A
		while(i<sizeL && j<sizeR)
		{
			if(left[i] < right[j])
			{
				arr[k] = left[i];
				i++;
				k++;
			} 
			else
			{
				arr[k] = right[j];
				j++;
				k++;
			}
		}
		//after above while loop, only one of below while loops will work as only one subarray will have left over numbers
		while(i<sizeL)
		{
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<sizeR)
		{
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	void mergeSort(int A[]) //recursive function to sort the array
	{
		int size = A.length;
		if(size < 2)
		{
			return; //exit call for recursion
		}
		int mid = size/2;
		int L[] = new int[mid];
		int R[] = new int[size-mid];
		for(int i=0; i<mid; i++) 
		{
			L[i] = A[i]; //to create left subarray
		}
		for(int i=mid; i<size; i++) 
		{
			R[i-mid] = A[i]; //to create right subarray
		}
		//recursive calls to sort left and right halves
		mergeSort(L);
		mergeSort(R);
		merge(L, R, A); //merge sorted halves
	}
	void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		mergesort ob = new mergesort();
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("enter the size: ");
		size = sc.nextInt();
		int arr[];
		arr = new int[size];
		System.out.println("enter the "+size+" elements: ");
		for(int i=0; i<size; i++) 
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("unsorted array ~ ");
		ob.display(arr);
		ob.mergeSort(arr);
		System.out.println("sorted array ~ ");
		ob.display(arr);
	}
}
