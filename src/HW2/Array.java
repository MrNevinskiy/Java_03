package HW2;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        array1();
        array2();
        array3();
        array4();
        array5();
    }

    public static void array1() {
        System.out.println("Задание номер 1: ");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] >= 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
            System.out.println(arr1[i]);
        }
    }

    public static void array2() {
        int a = 0;
        System.out.println("Задание номер 2: ");
        System.out.println(a);
        int[] arr2 = new int[8];
        for (int i = 1; i < arr2.length; i++) {
            arr2[i] = a += 3;
            System.out.println(arr2[i]);
        }
    }

    public static void array3() {
        System.out.println("Задание номер 3: ");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] = arr3[i] * 2;
            System.out.println(arr3[i]);
        }
    }

    public static void array4() {
        System.out.println("Задание номер 4: ");
        int[][] arr4 = new int[4][4];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr4[i][j] = 1;
                System.out.print(arr4[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void array5(){
            System.out.println("Задание номер 5: ");
            int [] arr5 = {7,2,3,4,6,10,22};
            Arrays.sort(arr5);
            System.out.println(arr5[0]);
            System.out.println(arr5[arr5.length - 1]);
        }
    }



