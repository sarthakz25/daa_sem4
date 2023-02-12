package exp2;

import java.util.*;

public class exp2q4 
{
	public static void main(String[] args)
	{
		int i, num, arr[], sea, c = 0;
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements:");
        num = sc.nextInt();
        arr = new int[num];
        System.out.println("enter the "+num+" elements ~");
        for(i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter an element to search: ");
        sea = sc.nextInt();
        for(i=0;i<num;i++)
        {
            if(arr[i]==sea)
            {
                c = 1;
                System.out.println("element '"+sea+"' found at the position '"+(i+1)+"'");
            }
        }
        if(c==0)
        {
            System.out.println("element '"+sea+"' not found!");
        }
	}
}
