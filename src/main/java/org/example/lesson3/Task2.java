package org.example.lesson3;

import java.util.Scanner;

public class Task2 {

        public static void main(String[] aegs) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            int elem = sc.nextInt();
            int count = 0;
            for (int i = 0; i < size; i++) {
                if (arr[i] == elem) count++;
            }
            int[] arr1 = new int[size-count];
            count = 0;
            for (int i = 0; i < size; i++) {
                if (arr[i] == elem) continue;
                else {
                    arr1[count] = arr[i];
                    count++;
                }
            }

            for (int i = 0; i < count; i++) {
                System.out.print(arr1[i] + " ");
            }
        }
    }