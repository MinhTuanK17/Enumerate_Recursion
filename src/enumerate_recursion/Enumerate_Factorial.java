/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumerate_recursion;

import java.util.Scanner;

/**
 *
 * @author MINH TUAN
 */
public class Enumerate_Factorial {

    public static long factorialUsingRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialUsingRecursion(n - 1);
    }

    public static void main(String[] args) {
        int num;
        System.out.print("n = ");
        try (Scanner scanner = new Scanner(System.in)) {
            num = scanner.nextInt();
        }

        long fact = Enumerate_Factorial.factorialUsingRecursion(num);
        System.out.println(num + "! = " + fact);
    }
}
