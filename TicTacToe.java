/** 
 * Java 1. Homework 4
 * @author Stas Zaitsev
 * @version 9/20/2021
 */

import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    TicTacToe () {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
        System.out.println(table.length);
        System.out.println("I want to play the game with you...");
    }

    void game() {
        System.out.println("Game on");
        initTable ();
        while (true) {
            printTable();
            turnHuman ();
            if (checkWin(SIGN_X)) {
                System.out.println("You are winner!");
                printTable();
                System.out.println(" Do you wanna play again? \n1  - Yes \n2 - No");
                if (scanner.nextInt() == 1) {
                    game();
                }
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                System.out.println(" Do you wanna play again? \n1  - Yes \n2 - No");
                if (scanner.nextInt() == 1) {
                    game();
                }
                break;
            }
            turnAI();
            if (checkWin(SIGN_O)){
                System.out.println("You are looser!");
                printTable();
                System.out.println(" Do you wanna play again? \n1  - Yes \n2 - No");
                if (scanner.nextInt() == 1) {
                    game();
                }
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                System.out.println(" Do you wanna play again? \n1  - Yes \n2 - No");
                if (scanner.nextInt() == 1) {
                    game();
                }
                break;
            }
        }
    }

    void initTable () {
        for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  table[i][j] = SIGN_EMPTY;
              }          
        }
    }

    void printTable () {
        for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  System.out.print(table[i][j] + " ");
              }          
            System.out.println();
        }
    }

    boolean isTableFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    void turnHuman () {
        int x, y;
        do {
            System.out.println("Enter X and Y (1...3): ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = SIGN_X;
    }

    void turnAI () {
        int x, y;
        do {
            System.out.println("Enter X and Y (1...3): ");
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = SIGN_O;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || y >=3 || x >=3) {
            return true;
        }
        return table[x][y] == SIGN_EMPTY;
    }

    boolean checkWin (char ch) {
        int fortuneCount = 0;
        for (int i = 0; i < 3; i++) {
            // Vertical check
            fortuneCount = 0;
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == ch) {
                    fortuneCount++;
                    if (fortuneCount == 3) {
                        return true;
                    }
                }
            }
            // Horizontal check
            fortuneCount = 0;
            for (int j = 0; j < 3; j++) {
                if (table[j][i] == ch) {
                    fortuneCount++;
                    if (fortuneCount == 3) {
                        return true;
                    }
                }
            } 
        }
        // Diagonal check
        fortuneCount = 0;
        for (int i = 0; i < 3; i++) {
            if (table[i][i] == ch) {
                fortuneCount++;
                if (fortuneCount == 3) {
                    return true;
                }
            }
        }
        fortuneCount = 0;
        for (int i = 0; i < 3; i++) {
            if (table[i][2 - i] == ch) {
                fortuneCount++;
                if (fortuneCount == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}