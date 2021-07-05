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
	public static Double checkDoubleMaximum(Double[] x)
	{
		Double max=x[0];
		for(Double e:x)
		{
			if(e.compareTo(max)>0)
			{
				max=e;
			}
		}
		return max;
	}
	private static String checkStringMaximum(String[] x)
	{
		String max=x[0];
		for(String e:x)
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
	    Double arr1[]= {1.2,2.9,3.4};
	    System.out.println("Maximum number in double array is "+checkDoubleMaximum(arr1));
	    String arr2[]= {"Apple","Peach","Banana"};
	    System.out.println("Maximum in String array is "+checkStringMaximum(arr2));
	}

}
