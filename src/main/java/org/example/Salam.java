package org.example;

import java.util.Scanner;

public class Salam {


    public static void main(String[] args) {

        // int - reqem
        // String - soz, cumle
        // boolean - qerar veme tipi
        // char - simvol
        // double - kesr eded ( float )

        // scanner

        int reqem = 6;

        String evinIsiqlarYanir = "";

        String cumle = "Salam zehmet olmasa deyeri qeyd edin : ";


        boolean yasilIsiq = true;
        boolean qirmiziIsiq = false;

        char tSimvolununAdi = 't';


        double piEdedi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println(cumle);

        int a = scanner.nextInt();

        System.out.println(cumle);

        int b = scanner.nextInt();

        int c = a + b;

        System.out.println("Cem : " + c);
    }
}
