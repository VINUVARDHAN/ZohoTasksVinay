package com.learn.java.ch4;

public class UnitCoversions {
	public static void main(String args[])
	{
		RupeesToDollor(2);
	}
	public static void CentimeterToMeter(int cm)
	{
		System.out.print(cm*Math.pow(10, -2)+" meter");
	}
	public static void MetersToKilometers(int m)
	{
		System.out.print(m*Math.pow(10, -3)+" kilometer");
	}
	public static void InchToFeet(int inch)
	{
		System.out.print(inch*0.0833+" feet");
	}
	public static void SqftToCent(int sqft)
	{
		System.out.print(sqft*0.00229+" cent");
	}
	public static void GramsToKg(int gram)
	{
		System.out.print(gram*Math.pow(10, -3)+" kg");
	}
	public static void RupeesToDollor(int rupees)
	{
		System.out.print(rupees/76.75+" dollor");
	}
}
