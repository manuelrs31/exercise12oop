package com.exercise12oop.model;

public abstract class shape implements shapeable
{
	 
	public String draw()
	{
		return " figure is being draw";
	}
	public String color()
	{
		return " figure is being is color";
	}
	public String erase()
	{
		return " figure is being is erase";
	}
	public double area()
	{
		return 0;
	}
	public double perimetro()
	{
		return 0;
	}

}
