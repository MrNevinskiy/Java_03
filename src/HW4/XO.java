package HW4;

import org.w3c.dom.ls.LSOutput;

import javax.swing.text.TabableView;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class XO {

    private final static char EMPTY = '_';
    private final static char DOT_X = 'X';
    private final static char DOT_O = 'O';
    private static int fieldSize = 3;
    public static Scanner USER_TAB = new Scanner(System.in);



    private void printTab(char[][] tab) {
        int counter = 1;
        System.out.print("   ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (char[] chars : tab) {
            System.out.print(counter + " ");
            counter++;
            for (char sym : chars) {
                System.out.print("|" + sym);
            }
            System.out.println("|");
        }
    }

    private void fillTab(char[][] tab) {
        for (char[] chars : tab) {
            Arrays.fill(chars, EMPTY);
        }
    }

    public void startGame(int fieldSize) {
        System.out.println("Укажите размер таблицы. Число от 3-5.");
        fieldSize = USER_TAB.nextInt();
        char[][] tab = new char[fieldSize][fieldSize];
        int rise = fieldSize;
        fillTab(tab);
        System.out.println("Игра крестики нолики. Вы играете за Х");
        printTab(tab);
        System.out.println("Для того, чтобы совершить" +
                "" +
                " ход введите номер строки" +
                "и номер столбца таблицы");
        boolean inGame = true;
        Scanner in = new Scanner(System.in);
        while (inGame) {
            System.out.println("Ваш ход:");
            int x, y;
            try {
                x = in.nextInt();
                y = in.nextInt();
                x--;
                y--;
                if (isValid(x, y, tab)) {
                    tab[x][y] = DOT_X;
                    printTab(tab);
                    if (isVictory(tab, DOT_X)) {
                        System.out.println("Вы победили");
                        break;
                    }
                    System.out.print("Компьютер совершает ход");
                    for (int i = 0; i < 5; i++) {
                        Thread.sleep(300);
                        System.out.print(".");
                    }
                    System.out.println();
                    movePC(tab);
                    if (isVictory(tab, DOT_O)) {
                        System.out.println("Вы проиграли");
                        break;
                    }
                    if (isDraw(tab)){
                        System.out.println("Ничья");
                        break;
                    }
                } else {
                    System.out.println("Данный ход невозможен! Введите новые значения");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Вы ввели не цифры! Введите цифры");
                in.next();
                continue;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //..... game .....
    }

    private boolean isDraw(char[][] tab) {
        for (int i = 0; i < tab.length ; i++) {
            for (int j = 0; j < tab.length ; j++) {
                if (tab[i][j] == EMPTY){
                    return false;
                }
            }
        }return true;
    }

    private boolean isVictory(char[][] tab, char dot) {
        boolean isCheckedDiagB, isCheckedDiagS;
        isCheckedDiagB = isCheckedDiagS = true;

        for (int diag = 0; diag < fieldSize; diag++) {

            boolean isRow, isCol;
            isRow = isCol = true;

            for (int i = 0; i < fieldSize; i++) {
                isRow = (tab[diag][i] == dot) && isRow;
                isCol = (tab[i][diag] == dot) && isCol;
                if (i == diag) {
                    isCheckedDiagB = (tab[diag][diag] == dot) && isCheckedDiagB;
                    isCheckedDiagS = (tab[diag][fieldSize - 1 - diag] == dot) && isCheckedDiagS;
                }
            }

            if (isRow || isCol) return true;
        }

        if (isCheckedDiagB || isCheckedDiagS) return true;

        return false;
    }

    private void movePC(char[][] tab) {
        int max = tab.length;
        int random1 = (int)(Math.random() * max);
        int random2 = (int)(Math.random() * max);
        for (int i = random1; i < max; i++) {
            for (int j = random2; j < max; j++) {
                if (tab[i][j] == EMPTY) {
                    tab[i][j] = DOT_O;
                    printTab(tab);
                    return;
                }
            }
        }
    }

    private boolean isValid(int x, int y, char[][] tab) {
        int len = tab.length;
        if (x >= 0 && x < len && y >= 0 && y < len) {
            if (tab[x][y] == EMPTY) {
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
       new XO().startGame(fieldSize);
    }
}