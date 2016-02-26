package ru.lesson.lessons.other_lessons;
/**
 *Класс кошка
 *@author shadoof42
 *@since 14.02.2016
 */
public class Cat implements Pet{
    /**
     * Имя кошки
     */
    private String name;
    /**
     * Порода кошки
     */
    private String species;

    /**
     * Конструктор
     * @param name имя
     * @param species порода
     */
    public Cat(final String name,final String species){
        this.name = name;
        this.species = species;
    }

    /**
     * Поймать мышь
     */
    public void catchMouse(){
        System.out.println("Мышь поймана!");
    }

    /**
     * Издать звук
     * @return звук
     */
    @Override
    public void makeSound(){
        System.out.println(String.format("Myau %s", this.getName()));
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSpecies() {
        return this.species;
    }

    @Override
    public String toString() {
        return "Кошка{" +
                "кличка='" + name + '\'' +
                ", порода='" + species + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;

        if (!name.equals(cat.name)) return false;
        if (!species.equals(cat.species)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + species.hashCode();
        return result;
    }
}
