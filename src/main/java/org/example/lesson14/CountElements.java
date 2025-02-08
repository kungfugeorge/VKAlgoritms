package org.example.lesson14;

import java.util.HashMap;
import java.util.Scanner;

/*
Дан массив целых чисел. Ваша задача — определить, существует ли элемент, который встречается больше половины раз в массиве. Если такой элемент существует, вернуть его. Если такого элемента нет, вернуть  -1 .

Формат входных данных
В первой строке задаётся число N — размер массива (количество элементов).
Во второй строке вводится массив из N целых чисел, разделённых пробелами.
Формат выходных данных
Программа должна вывести:
• элемент массива, который встречается больше половины раз
• -1 , если такого элемента нет.
Пример 1
Входные данные

7
7 7 8 8 8 8 9
Выходные данные

8
 */

public class CountElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        HashMap<Integer, Integer> arr = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int key = sc.nextInt();
            if (arr.containsKey(key)) {
                int value = arr.get(key);
                value++;
                arr.put(key, value);
            } else {
                arr.put(key, 1);
            }
        }
        boolean flag = true;
        for (Integer key : arr.keySet()) {
            int value = arr.get(key);
            if (value > size / 2) {
                System.out.println(key);
                flag = false;
                break;
            }
        }
        if (flag) System.out.println(-1);
    }
}