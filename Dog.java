class Dog extends Animal{
    final int maxRunLen = 500;
    final int maxSwimLen = 10;
    private int countOfDogs = 0;

    Dog(String name, String color, int age){
        super(name, color, age);
        countOfDogs++;
    }

    public void voice() {
        System.out.println("gaf-gaf");
    }

    public void run(int lenght) {
        System.out.println(lenght > maxRunLen ? "Dogs can’t run that much" : "Dog has ran " + lenght + " meters");
    }

    public void swim(int lenght) {
        System.out.println(lenght > maxSwimLen ? "Dogs can’t swim that much" : "Dog has swam " + lenght + " meters");
    }

    public int getCountOfDogs() {
        return countOfDogs;
    }
}
