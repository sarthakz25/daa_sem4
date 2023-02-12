package exp3;

import java.util.*;

public class knapsack 
{
	public static void main(String[] args)
    {
		int i, j, num, max, maxIndex;
		double weight[], profit[], pwratio[], currentw = 0, totprofit = 0, maxRatio;
		Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of weights: "); //input
        num = sc.nextInt();
        System.out.print("enter the max weight in sack: ");
        max = sc.nextInt();
        weight = new double[num];
        profit = new double[num];
        pwratio = new double[num];
        System.out.println("enter the weight with its profit ~");
        for(i=0; i<num; i++) 
        {
            System.out.print("enter the value of weight "+(i+1)+": ");
            weight[i] = sc.nextDouble();
            System.out.print("enter the profit of weight "+(i+1)+" with value "+weight[i]+": ");
            profit[i] = sc.nextDouble();
            pwratio[i] = profit[i]/weight[i]; //to calculate the profit weight ratio
        }
        for(i=0; i<num; i++) 
        {
            maxRatio = 0; //initialize
            maxIndex = 0;
            for(j=0; j<num; j++) //to find the max profit weight ratio
            {
                System.out.print(maxRatio);
                if(maxRatio<pwratio[j]) 
                {
                    maxRatio = pwratio[j];
                    maxIndex = j;
                }
            }
            System.out.println();
            pwratio[maxIndex] = 0;
            System.out.println(maxIndex); 
            if(currentw+weight[maxIndex] <= max) //to calculate the total profit
            {
                totprofit += profit[maxIndex];
                currentw += weight[maxIndex];
            }
            else 
            {
                totprofit += (((max-currentw)/weight[maxIndex]) * profit[maxIndex]);
                currentw = max;
                break;
            }
        }
        System.out.println("the total profit = "+totprofit);
    }
}
