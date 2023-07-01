package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0, val = 1; i < 4; i++, val++) {
            System.out.println("Enter value " + val);
            arr[i] = Integer.parseInt(scanner.next());
        }
        int sum1 = arr[0] + arr[1];
        int sum2 = arr[2] + arr[3];
        boolean result = sum1 < sum2;
        if(result){
            System.out.println("The result: sum1 < sum2 " + "true");
            sum1 = sum1 + 1;
            sum2 = sum2 - 2;
            if(sum1 > sum2){
                System.out.println("The result: sum1 > sum2 " + "true");
            }
            if(sum1 % 2 == 0 || sum2 % 2 == 0){
                System.out.println("The result: one or both values %2==0 " + "true");
            }
        }
    }
}
