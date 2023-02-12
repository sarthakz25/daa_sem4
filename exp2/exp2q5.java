package exp2;

import java.util.*;

public class exp2q5 
{
	int fact_rec(int num)
	{
        if(num>=1)
        {
        	return (num*fact_rec(num-1));
        }
        else
        {
            return 1;
        }
    }
    int fact_iter(int num)
    { 
        int i, fact = 1;
        for(i=1; i<=num; i++)
        {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        exp2q5 f = new exp2q5();
        System.out.println("the factorial of "+num+" using recursive method is "+f.fact_rec(num));
        System.out.println("the factorial of "+num+" using iterative method is "+f.fact_iter(num));
    }
}
