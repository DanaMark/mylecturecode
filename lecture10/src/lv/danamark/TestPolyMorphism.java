package lv.danamark;

import lv.danamark.polymorphism.Animal;
import lv.danamark.polymorphism.Cat;
import lv.danamark.polymorphism.Dog;

public class TestPolyMorphism {

	
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		myAnimal.animalSound();
		myDog.animalSound();
		myCat.animalSound();
		
		
		

	}

}
