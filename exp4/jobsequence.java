package exp4;

import java.util.Scanner;

public class jobsequence
{
    static void bubbleSort(int[] d, int[] p, int[] job) // d=deadlines, p=profit
    {
        int size = p.length;
        for(int i=0; i<size-1; i++) 
        {
            for(int j=0; j<(size-i-1); j++) 
            {
                if(p[j] < p[j+1]) 
                {
                    int temp_p = p[j];
                    p[j] = p[j+1];
                    p[j+1] = temp_p;
                    //
                    int temp_d = d[j];
                    d[j] = d[j+1];
                    d[j+1] = temp_d;
                    //
                    int temp_job = job[j];
                    job[j] = job[j+1];
                    job[j+1] = temp_job;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int duration[];
        int profit[];
        int job[];
        int x[];
        int n; //to store size
        System.out.print("enter the size: "); //inputs
        n = sc.nextInt();
        duration = new int[n];
        profit = new int[n];
        job = new int[n];
        x = new int[n];
        System.out.println("input the durations and profits ~");
        for(int i=0; i<n; i++) 
        {
            System.out.print("enter the duration "+(i+1)+": ");
            duration[i] = sc.nextInt();
            System.out.print("enter the profit "+(i+1)+": ");
            profit[i] = sc.nextInt();
            job[i] = i+1;
        }
        //to sort D, P and J arrays according to decreasing increasing order of profits
        bubbleSort(duration, profit, job);
        //to find the largest duration
        int max = duration[0];
        for(int i=1; i<n; i++)
        {
            if(duration[i] > max)
            {
                max = duration[i];
            }
        }
        //job sequencing algorithm
        for(int i=0; i<n; i++)
        {
            for(int j=duration[i]-1; j>=0; j--)
            {
                if(x[j] == 0)
                {
                    x[j] = job[i];
                }
            }
        }
        //to calculate profits
        double total_profit = 0;
        for(int i=0; i<max; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(x[i] == job[j])
                {
                    total_profit += profit[j];
                }
            }
        }
        System.out.print("job sequence: ");
        for(int i=0;i<max;i++)
        {
            System.out.print("J"+x[i]+" ");
        }
        System.out.println("\nthe total profit = "+total_profit);
    }
}
