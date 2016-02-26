package ru.lesson.lessons.other_lessons;

/**
 * Класс Собака
 */
public class Dog implements Pet {
	/**
	 * Имя собаки
	 */
	private String name;
	/**
	 * Порода собаки
	 */
	private String species;
	/**
	 * Конструктор
	 * @param name
	 * @param species
	 */
	public Dog(final String name, final String species){
		this.species = species;
		this.name = name;
	}
	/**
	 * Издать звук
	 */
	@Override
	public void makeSound(){
		System.out.println("Guf Guf!!!");
	}

	/**
	 * Поулчить имя собаки
	 * @return имя собаки
	 */
	@Override
	public String getName(){
		return this.name;
	}

	@Override
	public String getSpecies() {
		return this.species;
	}

	@Override
	public String toString() {
		return "Собака{" +
				"кличка='" + name + '\'' +
				", порода='" + species + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Dog)) return false;

		Dog dog = (Dog) o;

		if (!name.equals(dog.name)) return false;
		if (!species.equals(dog.species)) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + species.hashCode();
		return result;
	}
}