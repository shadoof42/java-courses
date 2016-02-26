package ru.lesson.lessons.other_lessons;

/**
 * @author Shadoof42
 *
 */
public class ClinicRunner{
	private static ClinicRunner runner = new ClinicRunner();
	private Clinic clinicSvetoch = new Clinic("Светоч");

	private void putClinic(){

		Dog dog0 = new Dog("Жучка","Сербернар");
		Dog dog1 = new Dog("Шарик","Дворняжка");
		Dog dog2 = new Dog("Пират","Алабай");
		Dog dog3 = new Dog("Чебурек","Чао-чао");

		Cat cat0 = new Cat("Мурка","Московская");
		Cat cat1 = new Cat("Васька","Персидская длинношерстая");
		Cat cat2 = new Cat("Табак","Метис(московская + мей-кун)");
		Cat cat3 = new Cat("Милка","Сиамская");

		Client client0 = new Client("0","Иванов Иван Иванович");
		client0.addPet(cat0);
		client0.addPet(dog0);
		Client client1 = new Client("1","Петров Иван Сидорович");
		client0.addPet(cat1);
		client0.addPet(dog1);
		Client client2 = new Client("2","Петров Сергей Сидорович");
		client2.addPet(dog2);
		client2.addPet(dog3);
		Client client3 = new Client("3","Сидоров Сергей Петрович");
		client3.addPet(cat2);

		clinicSvetoch.addClient(0,client0);
		clinicSvetoch.addClient(1,client1);
		clinicSvetoch.addClient(2,client2);
		clinicSvetoch.addClient(3,client3);
	}

	public void printClinic(){
		System.out.println(clinicSvetoch);
	}

	public static void main(String[] args){
		runner.putClinic();
		runner.printClinic();
	}
}