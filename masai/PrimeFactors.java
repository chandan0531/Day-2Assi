package com.masai;

public class PrimeFactors {
public static void main(String[] args) {
	int num = 12;
		if(num<2 || num>100)
		{
			System.out.println("Invalid number");
		}
		else
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
				{
					System.out.println(i);
				}
			}
		}
	}
}
