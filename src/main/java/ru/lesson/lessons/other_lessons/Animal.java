package ru.lesson.lessons.other_lessons;

/***
	*класс Животное
	*@author shadoof42
	*@since 11.02.2016
	*/
public class Animal implements Pet {
	/**
	*Имя животного
	*/
	private String name;
	/**
	 * Порода
	 */
	private String species;
	/**
	*Конструктор
	* @param name имя животного
	*/
	public Animal(final String name, final String species){
		this.name = name;
		this.species = species;
	}

	/**
	 * Издвать звук
	 */
	@Override
	public void makeSound(){
		System.out.println(String.format("%s say %s", this.name, "beep"));
	}

	/**
	 * Получить имя
	 * @return имя животного
	 */
	@Override
	public String getName() {
		return null;
	}

	@Override
	public String getSpecies() {
		return null;
	}

	/**
	 * Голодно ли животное?
	 * @return голодно ли животное
	 */
	private boolean isHungry(){
		return true;
	}
}