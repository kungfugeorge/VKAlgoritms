package org.example.lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            int t = sc.nextInt();
            if (t != 0) {
                arr[count] = t;
                count++;
            }
        }
        for(int i = count; i < size; i++) {
            arr[i] = 0;
        }
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.gc();
    }
}
