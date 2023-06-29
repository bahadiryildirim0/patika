package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz :");
        double boy=scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        double kilo=scanner.nextDouble();

        double endeks=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz : " +endeks);

    }

}