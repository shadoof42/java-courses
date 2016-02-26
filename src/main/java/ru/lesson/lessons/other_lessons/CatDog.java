package ru.lesson.lessons.other_lessons;

public class CatDog implements Pet{
	private final Pet cat;
	private final Pet dog;
	
	public CatDog(Pet cat, Pet dog){
		this.cat = cat;
		this.dog = dog;
	}
	
	@Override
	public void makeSound(){
		this.cat.makeSound();
		this.dog.makeSound();
	}
	@Override
	public String getName(){
		return String.format("%s%s", this.cat.getName(), this.dog.getName());
	}

	@Override
	public String getSpecies() {
		return null;
	}
}