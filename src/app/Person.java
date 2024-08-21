package app;

public class Person {

    String name;
    int age;
    String profession;

    // Генеруємо конструктор
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public switchProfession (String name, )

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
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) // Перевіряємо, щоб вік не був від'ємним числом
            this.age = age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
