package app;

public class Person {

    // Ініціалізації змінних для конструктора
    String name;
    int age;
    String profession;

    // Генеруємо конструктор
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    // Метод для зміни професії
    public void switchProfession (Person person, String newProfession) {
        person.setProfession(newProfession);
    }

    //Getters для отримання даних
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    //Setters для зміни даних
    public void setProfession(String profession) {
        this.profession = profession;
    }
}
