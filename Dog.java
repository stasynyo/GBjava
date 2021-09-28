class Dog extends Animal{
    final int maxRunLen = 500;
    final int maxSwimLen = 10;
    private static int countOfAnimals = 0;


    Dog(String name, String color, int age){
        super(name, color, age);
        countOfAnimals++;
    }

    public void voice() {
        System.out.println(name + "says: \"gaf-gaf!\"");
    }

    public void run(int lenght) {
        System.out.println(lenght > maxRunLen ? "Dogs can’t run that much" : name + " has ran " + lenght + " meters");
    }

    public void swim(int lenght) {
        System.out.println(lenght > maxSwimLen ? "Dogs can’t swim that much" : name + " has swam " + lenght + " meters");
    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }
}
