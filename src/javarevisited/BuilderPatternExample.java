/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package javarevisited;

/**
 * @author fluxmeister
 *
 */
public class BuilderPatternExample {

	public static void main(String[] args) {
		 //Creating object using Builder pattern in java
		Cake whiteCake = new Cake.Builder().sugar(1).butter(0.5)
				.eggs(2).vanila(2).flour(1.5). bakingpowder(0.75).milk(0.5).build();
		
		//Cake is ready to eat :)
		System.out.println(whiteCake);

	}

}