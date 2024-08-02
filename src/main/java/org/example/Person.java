package org.example;

public class Person {
    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void displayInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
    }

    public void updateProfession(String newProfession) {
        this.profession = newProfession;
    }

    public static void main(String[] args) {
        // Створення об'єктів для першої групи людей
        Person john = new Person("John", 30, "Інженер");
        Person mary = new Person("Mary", 25, "Вчитель");
        Person bob = new Person("Bob", 35, "Лікар");

        // Виведення інформації про першу групу людей
        john.displayInfo();
        mary.displayInfo();
        bob.displayInfo();

        // Створення об'єкту для Alice та оновлення її професії
        Person alice = new Person("Alice", 28, "Архітектор");
        alice.displayInfo();
        alice.updateProfession("Дизайнер");
        alice.displayInfo();
    }
}