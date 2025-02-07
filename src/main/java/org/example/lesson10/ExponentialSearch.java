package org.example.lesson10;

import java.util.Scanner;

/*
Дан отсортированный по возрастанию массив целых чисел и некоторое целое число. Ваша задача — найти минимальный диапазон индексов (подмассив), в котором может находиться заданное число. Используйте метод экспоненциального поиска.

Формат входных данных
В первой строке задаётся число N — количество элементов в массиве.
Во второй строке вводится массив из N целых чисел, разделённых пробелами.
В третьей строке задаётся целое число target, для которого нужно найти диапазон.
Формат выходных данных
Программа должна вывести два числа через пробел, представляющие диапазон индексов, где может находиться число target. Если число находится в массиве, это должен быть диапазон, содержащий индекс числа. Если число отсутствует, диапазон должен содержать индексы, где оно могло бы быть вставлено.
Пример 1
Входные данные

11
8 11 12 16 18 21 33 36 48 54 63
16
Выходные данные

2 4

Пояснение: число 16 находится в подмассиве от индекса 2 до индекса 4
 */
public class ExponentialSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(expoSearch(arr, target));
    }

    public static String expoSearch(int[] arr, int target) {
        int border = 1, lastElement = arr.length - 1;

        while (border < lastElement && arr[border] < target) {
            if (arr[border] == target) {
                return border + " " + border * 2;
            }
            border *= 2;
            if (border > lastElement) {
                return (border / 2) + " " + lastElement;
            }
        }
        return border / 2 + " " + border;
    }
}