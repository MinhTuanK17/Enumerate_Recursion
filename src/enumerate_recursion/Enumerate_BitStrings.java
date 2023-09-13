/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumerate_recursion;

import java.util.Scanner;

/**
 *
 * @author MINH TUAN
 */
public class Enumerate_BitStrings {

    public static void enumerateBitStrings(int length, String str) {
        if (str.length() == length) {
            System.out.println(str);
            return;
        }
        enumerateBitStrings(length, str + "0");
        enumerateBitStrings(length, str + "1");
    }

    public static void main(String[] args) {
        Enumerate_BitStrings obj = new Enumerate_BitStrings();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập do dai chuoi bit: ");

        int length = scanner.nextInt();
        if (length < 0) {
            System.out.println("Đo dai phai la so nguyen duong.");
        } else {
            enumerateBitStrings(length, "");
        }

    }

}
