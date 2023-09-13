/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumerate_recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MINH TUAN
 */
public class Enumerate_Combinator {

    public static int combinator(int n, int k) {
        // Base cases
            if (k == 0 || k == n) {
                return 1;
            }

        // Recursive cases
        int withoutLastElement = combinator(n - 1, k);
        int withLastElement = combinator(n - 1, k - 1);

        return withoutLastElement + withLastElement;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhap n: ");
            int n = scanner.nextInt();

            System.out.print("Nhap k: ");
            int k = scanner.nextInt();

            if (n < k) {
                System.out.println("Loi: n khong the nho hon k.");
            } else {
                int result = combinator(n, k);
                System.out.println("C(" + n + ", " + k + ") = " + result);
            }
        }

    }
}
