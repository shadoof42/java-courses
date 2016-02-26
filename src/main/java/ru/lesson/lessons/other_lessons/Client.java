package ru.lesson.lessons.other_lessons;

import java.util.ArrayList;
import java.util.List;

/**
* Класс клиент
*@author shadoof42
*@since 11.02.2016
*/
public class Client {
	/**
	 * Идентификатор клиента
	 */
	private String id;
	/**
	 * Имя клиента
	 */
	private String name;
	/**
	 * Список животных, которые закреплены за клиентом
	 */
	private List<Pet> pets;

	/**
	 * Конструктор
	 * @param id идентификтатор клиента
	 * @param name имя клиента
	 */
	public Client(final String id, final String name) {
		this.id = id;
		this.name = name;
		this.pets = new ArrayList<Pet>();
	}

	/**
	 * Получить id клиента
	 * @return id клиента
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Получить имя клиента
	 * @return  имя клиента
	 */
	public String getName() {
		return name;
	}

	/**
	 * Получить список животных, закрепленных за клиентом
	 * @return список животных
	 */
	public List<Pet> getPet() {
		return this.pets;
	}

	/**
	 * Добавить новое домашнее животное
	 * @param pet домашнее животное, принадлежащее пользователю
	 */
	public void addPet(final Pet pet){
		this.pets.add(pet);
	}

	/**
	 * Удалить в случае смерти животного
	 * @param pet мертвое животное
	 */
	public void removePet(final Pet pet){
		this.pets.remove(this.pets.indexOf(pet));
	}

	/**
	 * Найти животное у пользователя
	 * @param name Имя животного
	 * @return объект Животное
	 */
	public Pet findPetByName(final String name){
		Pet pet=null;
		for (Pet item : this.pets) {
			if (pet.getName().equals(name)){
				pet=item;
				break;
			}
			else System.out.println("У клиента " + this.name + " нет питомца с таким именем : " + name);
		}
		return pet;
	}

	/**
	 * Вывод клиента на печать
	 *
	 * @return строка с клиентом
	 */
	@Override
	public String toString() {
		return "Клиент{" +
				"id='" + id + '\'' +
				", имя клиента='" + name + '\'' +
				", питомцы=" + pets +
				'}';
	}

	/**
	 * Вывести на печать список питомцев
	 * @return список питомцев
	 */
	public List<String> petsToString(){
		List<String> petStringList = new ArrayList<String>();
		for (Pet pet : this.pets){
			pets.add(pet);
		}
		return petStringList;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Client)) return false;
		Client client = (Client) o;
		if (!id.equals(client.id)) return false;
		if (!name.equals(client.name)) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id.hashCode();
		result = 31 * result + name.hashCode();
		return result;
	}
}