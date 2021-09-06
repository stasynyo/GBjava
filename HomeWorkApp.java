public class HomeWorkApp {   
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords(){
        System.out.println("Orange\n" + "Banana\n" + "Apple\n");
    }
    static void checkSumSign() {
        int a = 10;
        int b = -12;
        System.out.println(a + b >= 0 ? "The sum is positive" : "The sum is negative");
    }
    static void printColor(){
        int value = 47;
        if (value > 100) {
            System.out.println("Green");
        }
        else if (value < 0) {
            System.out.println("Red");
        }
        else {
            System.out.println("Yellow");
        }
    }
    static void compareNumbers(){
        int a = 3000;
        int b = 3000;
        System.out.println(a < b ? "a < b" : "a >= b");
    }
}