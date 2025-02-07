package org.example.lesson8;

import java.util.Scanner;
/*
Дан отсортированный по возрастанию массив целых чисел и заданное число. Если заданное число уже находится в массиве, верните его индекс. Если числа в массиве нет, верните индекс, где оно должно находиться, чтобы сохранить порядок сортировки.

Формат входных данных
В первой строке задаётся число N — количество элементов в массиве.
Во второй строке вводится массив из N целых чисел, разделённых пробелами.
В третьей строке задаётся число target, для которого нужно найти индекс.
Формат выходных данных
Программа должна вывести одно число — индекс числа target, если оно уже есть в массиве, или индекс, где оно должно находиться для сохранения порядка сортировки.
Пример 1
Входные данные

5
        5 7 9 11 13
        6

Выходные данные

1

Пояснение: если бы в массиве было число 6, то оно находилось бы под индексом 1 то есть правее 5 и левее 7

 */

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println(find(arr, target));
    }

    static int find(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        int middle = 0;
        while (left <= right) {
            middle = (left + right) / 2;
            if (target == arr[middle]) return middle;
            if (target < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }
}