package com.example.demo;

public class Bean {
	
	private Animal animal;
	
	public Bean()
	{
		
	}
	
	public Bean(Animal animal)
	{
		this.animal = animal;
	}
	
	public void shout()
	{
		animal.makeNoise();
	}

}
