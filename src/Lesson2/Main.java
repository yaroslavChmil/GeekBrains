package Lesson2;

import java.util.Arrays;

public class Main {

    public static void taskOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void taskTwo(int[] arr) {
        int a = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a += 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void taskThree(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void taskFour(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        int min = arr[0];
        int max = arr[arr.length - 1];
        System.out.println("Min = " + min + "; " + "Max = " + max);
    }

    public static void taskFive(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
    }

    public static boolean taskSix(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) return false;
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            left += arr[i];
            sum -= arr[i];
            if (sum == left) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        taskOne(array1);

        int[] array2 = new int[8];
//        taskTwo(array2);

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        taskThree(array3);

        int[] array4 = {2, 10, 6, 4, 11, 75, 11, 44, 55, 8, 12, 17};
//        taskFour(array4);

        int[][] array5 = new int[10][10];
        taskFive(array5);
        for (int i = 0; i < array5.length; i++) {
            System.out.println(Arrays.toString(array5[i]));
        }
        System.out.println(taskSix(1,1,1,2,1));
        System.out.println(taskSix(2,1,1,2,1));
        System.out.println(taskSix(10,1,2,3,4));
    }
}
