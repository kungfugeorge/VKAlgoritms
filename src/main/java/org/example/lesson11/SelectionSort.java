package org.example.lesson11;

/*
Дан неотсортированный массив целых чисел. Ваша задача — отсортировать массив по возрастанию, используя любой алгоритм сортировки.

Формат входных данных
В первой строке задаётся число N — количество элементов в массиве.
Во второй строке вводится массив из N целых чисел, разделённых пробелами.
Формат выходных данных
Программа должна вывести массив, отсортированный по возрастанию. Элементы массива разделяются пробелами.
Пример 1
Входные данные

4
3 2 1 8
Выходные данные

1 2 3 8
 */

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int min;
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
