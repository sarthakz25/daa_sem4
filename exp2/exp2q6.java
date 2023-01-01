package daaprograms;

import java.util.*;

public class exp2q6 
{
	int fibo_rec(int num)
	{
        if(num<=1)
        {
        	return num;
        }
        else
        {
        	return fibo_rec(num-1) + fibo_rec(num-2);
        }
    }
    void fibo_itr() 
    {
        int i, next, first = 0, second = 1;
        System.out.println("the fibonacci series using iterative method is ~");
        for(i=0; i<10; i++)
        {
        	if(i>1 && i<8)
        	{
                System.out.print(first+" ");
        	}
            next = first + second;
            first = second;
            second = next;
        }
    }
    public static void main(String [] args)
    {
        exp2q6 f = new exp2q6();
        f.fibo_itr();
        System.out.println("\nthe fibonacci series using recursive method is ~");
        for(int i=2;i<8;i++)
        {
            System.out.print(f.fibo_rec(i)+" ");
        }
    }
}
