class Cat extends Animal {
    private final int maxRunLen = 200;
    // private final int maxSwimLen = 0;
    private static int countOfAnimals = 0;

    Cat(String name, String color, int age){
        super(name, color, age);
        countOfAnimals++;
    }

    public void voice() {
        System.out.println(name + "says: \"meow\"");
    }

    public void run(int lenght) {
        System.out.println(lenght > maxRunLen ? "Cats can’t run that much" : name + " has ran " + lenght + " meters");
    }
    
    public void swim(int lenght) {
        System.out.println("Cats can't swim");
    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }
}
