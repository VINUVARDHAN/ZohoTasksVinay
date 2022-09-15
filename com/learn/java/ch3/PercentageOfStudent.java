package com.learn.java.ch3;

public class PercentageOfStudent {
	public static void main(String [] args)
	{
		int subjectMarks[] = {33,34,35,36,37};
		float total=0,average,percentage;
		for (int i=0;i<5;i++)
		{
			total = total+subjectMarks[i];
		}
		average = total/5;
		percentage = total/200*100;
		System.out.println(total +": total");
		System.out.println(average +": average");
		System.out.println(percentage +": percentage");
	}
}
