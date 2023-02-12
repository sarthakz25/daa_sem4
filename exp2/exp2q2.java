package daaprograms;

import java.util.*;

public class exp2q2 
{
	public static void main(String[] args)
	{
		int i, j, k, num, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of variables:");
		num = sc.nextInt();
		String zero = "";
		for(i=0; i<Math.pow(2, num); i++)
		{
			String bin = Integer.toBinaryString(i);
			if(bin.length()<num)
			{
				for(j=0; j<(num-bin.length()); j++)
				{
					zero += "0";
				}
			}
			String comb = zero+bin;
			String fbin = "";
			for(k=0; k<comb.length(); k++)
			{
				if(comb.charAt(k) == '1')
				{
					fbin += "True\t";
				}
				else
				{
					fbin += "False\t";
				}
			}
			System.out.println(fbin);
			zero = "";
		}
	}
}
