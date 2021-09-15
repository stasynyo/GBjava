/** 
 * Java 1. Homework 3
 * @author Stas Zaitsev
 * @version 9/14/2021
 */

import java.util.Arrays;
import java.util.Random;

public class HomeWorkApp {   
    public static void main(String[] args) {
        int[] taskOne = new int[10];
        taskOne = fillArray(taskOne, 2);
        swapBinaries(taskOne);

        int[] taskTwo = new int[100];
        for (int i = 0; i < taskTwo.length; i++ ) {
            taskTwo[i] = 1 + i;
        }
        System.out.println(Arrays.toString(taskTwo));

        int[] taskThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < taskThree.length; i++){
            if (taskThree[i] < 6){
                taskThree[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(taskThree));

        int[][] taskFour = new int[9][9];
        for (int i = 0; i < taskFour.length; i++ ) {
            for (int j = 0; j < taskFour.length; j++ ) {
                if (i == j || j == taskFour.length - i - 1 || i == taskTwo.length - j -1 ){
                    taskFour[i][j] = 1;
                }
                System.out.print(taskFour[i][j] + " ");  
            } 
            System.out.println();    
        }

        System.out.println(Arrays.toString(createArray(2, 3)));

        int[] taskSix = new int[70];
        taskSix = fillArray(taskSix, 10);
        System.out.println(Arrays.toString(taskSix));
        defineMaxMin(taskSix);

        int[] taskSeven = {1, 1, 1, 2, 1};
        System.out.println(checkBalance(taskSeven));
    }

    static void swapBinaries(int[] arr){
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] > 0 ?  0 : 1; 
        }
        System.out.println(Arrays.toString(arr));
    }

    static int[] fillArray(int[] arr, int numeralSystem) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(numeralSystem);
        }
        return arr;
    }
    
    static int[] createArray(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++ ) {
            arr[i] = initialValue;
        }
        return arr;
    }

    static void defineMaxMin(int[] arr) {
        int maximum = arr[0];
        int minimum = arr[0];

        for (int a : arr) {
            if (a > maximum) {
                maximum = a;
            }
            if (a < minimum) {
                minimum = a;
            }
        }
        System.out.println("Maximum = " + maximum + "\nMinimum = " + minimum);
    }

    static boolean checkBalance (int[] arr) {
        int sum = 0;
        int resum = 0;

        for (int i = 0; i < arr.length; i++ ) {
            sum += arr[i];
        }

        for (int i = arr.length - 1; i > 0; i-- ) {
            resum += arr[i];
            int temp = sum;
            temp -= resum;
            if (resum == temp) {
                return true; 
            }
        }
        return false; 

//        return (sum %= 2) == 0;
    }
}