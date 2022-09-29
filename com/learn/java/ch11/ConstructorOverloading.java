package com.learn.java.ch11;

import java.util.Scanner;

public class ConstructorOverloading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want to calculate the area");
		System.out.println("Options are :\n1:Circle\n2:Triangle\n3:Rectangle\n4:Trapezoid\n5:Square\n6:Ellipse");
		int shape = sc.nextInt();
		switch(shape){
			case 1 :System.out.println("Enter radius of circle : ");
					float radius = sc.nextFloat();
					new Area(radius);
			break;
			case 2 :System.out.println("Enter height and base of triangle : ");
					float height = sc.nextFloat();
					float base = sc.nextFloat();
					new Area(height,base);
			break;
			case 3 :System.out.println("Enter height and length of rectangle : ");
					float hei = sc.nextFloat();
					float length = sc.nextFloat();
					new Area("rect",hei,length);
			break;
			case 4 :System.out.println("Enter smaller base ,bigger base and height values of trapezoid : ");
					float sl = sc.nextFloat();
					float bl = sc.nextFloat();
					float h = sc.nextInt();
					new Area(sl,bl,h);
			break;
			case 5 :System.out.println("Enter side length of square : ");
					float side = sc.nextFloat();
					new Area("square",side);
			break;
			case 6 :System.out.println("Enter bigger radius and smaller radius of ellipse: ");
					float big = sc.nextFloat();
					float small = sc.nextFloat();
					new Area("nn",3.142f,big,small);
			break;
			default:
					System.out.println("Number entered is invalid");
		}
		sc.close();
	}
}
class Area{
			//Circle
	Area(float radius){
		System.out.println("Area of circle is : "+(3.142*Math.pow(radius, 2)));
	}
			//Triangle
	Area(float height,float base){
		System.out.println("Area of Triangle is : "+(0.5*height*base));
	}
			//Rectangle
	Area(String shape,float height,float length){
		System.out.println("Area of Rectangle is : "+(height*length));
	}
			//Trapezoid
	Area(float a,float b,float height){
		System.out.println("Area of Trapezoid is : "+((a+b)*height/(2)));
	}
			//Square
	Area(String shape,float side){
		System.out.println("Area of Square is : "+(side*side));
	}
			//Ellipse
	Area(String shape,float pi,float a ,float b){
		System.out.println("Area of Ellipse is : "+(pi*a*b));
	}
}
	