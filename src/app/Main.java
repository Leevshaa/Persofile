package app;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Vitalii", 27, "Banking specialist");
        Person person2 = new Person("Eugene", 30, "Java specialist");
        Person person3 = new Person("Oleksandr", 32, "Mechanic");

        System.out.println("Ім'я: " + person1.getName() + ", Вік: " + person1.getAge() +
                ", Професія: " + person1.getProfession() + "\nІм'я: " + person2.getName() + ", Вік: " +
                person2.getAge() + ", Професія: " + person2.getProfession() + "\nІм'я: " + person3.getName() +
                ", Вік: " + person3.getAge() + ", Професія: " + person3.getProfession());
    }
}
