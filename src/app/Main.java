package app;

public class Main {

    public static void main(String[] args) {

        // Створюємо об'єкти
        Person person1 = new Person("Vitalii", 27, "Banking specialist");
        Person person2 = new Person("Eugene", 30, "Java specialist");
        Person person3 = new Person("Oleksandr", 32, "Mechanic");

        System.out.println("1. \tІм'я: " + person1.getName() + ", Вік: " + person1.getAge() +
                ", Професія: " + person1.getProfession() + "\n\tІм'я: " + person2.getName() + ", Вік: " +
                person2.getAge() + ", Професія: " + person2.getProfession() + "\n\tІм'я: " + person3.getName() +
                ", Вік: " + person3.getAge() + ", Професія: " + person3.getProfession());

        person1.switchProfession(person1, "Java junior");

        // Вивід інформації після зміни професії
        System.out.println("\n2. \tІм'я: " + person1.getName() + ", Вік: " + person1.getAge() +
                ", Професія: " + person1.getProfession() + "\n\t(Після оновлення професії)");
    }
}