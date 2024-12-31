package org.example;

import java.util.Scanner;

/**
 * Copyright (c) 2024 iNet Solutions Corp.
 *
 * @Project : SELENIUM
 * @File : Fibonaci
 * @Author : Le Thanh Tu (tult@inetcloud.vn)
 * @Since : 14:07 17/12/2024
 */
public class Fibonaci {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số Fibonacci cần tính tổng: ");
        int n = scanner.nextInt();

        int sum = fibonacciSum(n);
        System.out.println("Tổng của " + n + " số Fibonacci đầu tiên là: " + sum);
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static int fibonacciSum(int n) {
        if (n <= 0) {
            return 0;
        }
        return fibonacci(n - 1) + fibonacciSum(n - 1);
    }
}
