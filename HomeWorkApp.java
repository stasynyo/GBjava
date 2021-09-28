/** 
 * Java 1. Homework 3
 * @author Stas Zaitsev
 * @version 9/28/2021
 */

public class HomeWorkApp {   
    public static void main(String[] args) {
        Cat cat = new Cat("Bars", "yellow", 5);
        Dog dog = new Dog("Muhtar", "brown", 2);

        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            animal.voice();
            animal.run(136);
            animal.swim(4);
        }
        System.out.println("Count: " + Animal.getCountOfAnimals() + "\nCats: " + Cat.getCountOfAnimals() + "\nDogs: " + Dog.getCountOfAnimals());
    }
}