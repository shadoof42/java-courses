package ru.lesson.lessons.other_lessons;
/**
 * Класс "Пользователь"
 */
public class User {
    /**
     * Идентификатор пользователя
     */
    private String id;
    /**
     * Имя пользователя
     */
    private String name;
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Пользователь{" +
                "id='" + id + '\'' +
                ", имя='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        if (!id.equals(user.id)) return false;
        if (!name.equals(user.name)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }
}
