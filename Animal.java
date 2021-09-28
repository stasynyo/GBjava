abstract class Animal implements IAnimal {
    String name;
    String color;
    int age;
    private static int countOfAnimals = 0;

    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        countOfAnimals++;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nColor: " + color + "\nAge: " + age;
    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }
}