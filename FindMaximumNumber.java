package com.bridgelabz.testmaxium;
import java.util.Arrays;
import java.util.Collections;

public class FindMaximumNumber<Z extends Comparable<Z>>
{
	Z num1,num2,num3;
	
	FindMaximumNumber( Z x ,Z y,Z z)
	{
		num1=x;
		num2=y;
		num3=z;
		
	}
	
	public static <E extends Comparable<E>>E checkMaximum(E x,E y,E z)
	{
		E max;
		if(x.compareTo(y)> 0 && x.compareTo(z)>0)
		{
			System.out.println(x+" iS Maximum");
			max=x;
		}
		else if(y.compareTo(x) >0 && y.compareTo(z)>0)
		{
			System.out.println(y+" is Maximum");
			max=y;
		}
		else
		{
			System.out.println(z+" is Maximum");
			max=z;
		}
		return max;
			
		
	}
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
	public static <E extends Comparable<E>>E checkMaximum(E x[])
	{
		E max=Collections.max(Arrays.asList(x));
		return max;
	}
	public Z testMaximum()
	{
		
		Z max=checkMaximum(num1,num2,num3);
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
