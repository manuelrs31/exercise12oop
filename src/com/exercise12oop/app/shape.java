package com.exercise12oop.app;
import com.exercise12oop.model.square;

import java.util.Scanner;

import com.exercise12oop.model.circle;
import com.exercise12oop.model.triangle;

public class shape {

	public static void main(String[] args)
	{
		
		double radio=0;
		// 
		square square1 = new square();
		circle circle1 = new circle();
		triangle triangle1 = new triangle();
		
		square square2 = new square(5.5,4.0);
		circle circle2 = new circle(8.5);
		triangle triangle = new triangle(5.0,6.0);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" input the radio of the circle");
		radio = input.nextDouble();
		circle1.setRadio(radio);
		System.out.println(" calculate area is: "+circle1.area(circle1.getRadio()));
		

	}

}
