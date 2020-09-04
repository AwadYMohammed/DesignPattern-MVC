/*
 * Imagine that this class requires lots of configuration
 * before use, e.g. via constructor parameters
 */
package com.demo;
public class Cat extends AbstractAnimal  implements Animal {

	@Override
	public void speak() {
		System.out.println("Meouw!");
	}

}
