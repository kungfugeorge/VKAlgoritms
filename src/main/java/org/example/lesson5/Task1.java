package org.example.lesson5;

//import java.util.Scanner;

public class Task1 {

    public static String minDiff(int size, int[] arr) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }
        int minAbs = Math.abs(arr[0] - arr[1]);
        int pointer = arr[0];
        for (int i = 1; i < (size - 1); i++) {
            if (Math.abs(arr[i] - arr[i + 1]) < minAbs) {
                minAbs = Math.abs(arr[i] - arr[i + 1]);
                pointer = arr[i];
            }
        }
        return pointer + " " + (pointer + minAbs);
//        System.out.println(pointer + " " + (pointer + minAbs));
//        return pointer + minAbs;
    }
}
