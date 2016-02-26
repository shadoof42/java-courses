package ru.lesson.lessons.other_lessons;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
*
*@author shadoof42
*@since 11.02.2016
*/
public class Clinic{
	/**
	 * Наименование клиники
	 */
	private String name;
	/**
	*Список клиентов
	*/
	private List<Client> clients;
	
	public Clinic(String name){
		this.name = name;
		this.clients = new LinkedList<Client>();
	}
	/**
	*добавить клиента
	*@param position позиция в списке
	*@param client клиент
	*/
	public void addClient(final int position, final Client client){
		this.clients.add(position,client);
	}

	/**
	 * Поиск клиента по его имени
	 * @param name имя клиента
	 * @return клиент
	 */
	public Client findClientByName(String name){
		Client client = null;
		if (!this.clients.isEmpty())
			for (Client item : this.clients){
				if (item.getName().equals(name)){
					client = item;
					break;
				}
			}
		else System.out.println("Для клиники " + this.name + " список клиентов пуст!");
		return client;
	}

	/**
	 * Поиск клиента по имени одного животного
	 * @param name клиент
	 * @return клиент
	 */
	public List<Client> findClientsByPetName(final String name){
		List<Client> clients = new ArrayList<Client>();
		if (!this.clients.isEmpty())
			for (Client item : this.clients){
				if (item.getName().equals(name)){
					clients.add(item);
				}
			}
		else System.out.println("Для клиники " + this.name + " список клиентов пуст!");
		return clients;
	}

	@Override
	public String toString() {
		return "Клиника{" +
				"название='" + name + '\'' +
				", клиенты=" + clients +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Clinic)) return false;

		Clinic clinic = (Clinic) o;

		if (!name.equals(clinic.name)) return false;

		return true;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
