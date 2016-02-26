package ru.lesson.lessons.other_lessons;

/**
 * Класс домашнее живтоное
 * @author
 * @since
 */
public interface Pet{
	/**
	 * Издать звук
	 * @return звук
	 */
	public void makeSound();

	/**
	 * Получить имя
	 * @return имя
	 */
	public String getName();

	/**
	 * Получить породу
	 * @return порода
	 */
	public String getSpecies();
	/**
	 * Вывести на печать
	 * @return наименование животного
	 */
	public String toString();
}