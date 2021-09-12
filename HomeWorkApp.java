/** 
 * Java 1. Homework 2
 * @author Stas Zaitsev
 * @version 9/10/2021
 * */ 

public class HomeWorkApp {   
    public static void main(String[] args) {
        System.out.println(checkYear(2100));
    }

    static boolean checkSum (int a, int b) {
        return  a + b >= 10 && a + b <= 20 ? true : false;
    }

    static void checkSign (int a) {
        System.out.println(a >= 0 ? "Positive" : "Negative" );
    }

    static boolean checkNegative(int a) {
        return a < 0;
    }

    static void printPhrase(String phrase, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(phrase);
        }
    }

    static boolean checkYear(int year) {
        if (year > 100) {
            int temp = year % 100;
            year -= temp;
            temp %= 4;
            year %= 4;
            return year == 0 && temp == 0;
        }
        return ( year %= 4 ) == 0; 
    }
}