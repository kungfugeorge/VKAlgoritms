package org.example.lesson4;

import java.util.Scanner;

public class Task1 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int max = sc.nextInt();
            for (int i = 0; i < (size -1); i++){
                int current = sc.nextInt();
                if (current > max) max = current;
            }
            System.out.println(max);
        }
    }
