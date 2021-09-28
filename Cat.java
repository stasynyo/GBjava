class Cat extends Animal {
    private final int maxRunLen = 200;
    // private final int maxSwimLen = 0;
    private int countOfCats = 0;

    Cat(String name, String color, int age){
        super(name, color, age);
        countOfCats++;
    }

    public void voice() {
        System.out.println("meow");
    }

    public void run(int lenght) {
        System.out.println(lenght > maxRunLen ? "Cats can’t run that much" : "Cat has ran " + lenght + " meters");
    }
    
    public void swim(int lenght) {
        System.out.println("Cats can't swim");
    }

    public int getCountOfCats() {
        return countOfCats;
    }
}
