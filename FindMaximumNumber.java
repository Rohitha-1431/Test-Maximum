package com.bridgelabz.testmaxium;

public class FindMaximumNumber {
	public static Integer checkIntMaximum(Integer[] x)
	{
		Integer max=x[0];
		for(Integer e:x)
		{
			if(e.compareTo(max)>0)
			{
				max=e;
			}
		}
		return max;
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome");
		Integer arr[]= {7,2,3};
	    System.out.println("Maximum number in integer array is "+checkIntMaximum(arr));		
	}	

}
