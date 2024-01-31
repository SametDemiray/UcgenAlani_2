package org.example;

import java.util.Scanner;

// Klavyeden iki kenarı ve derece cinsinden aradaki açısı girilen üçgenin alanını hesaplayan program.
// Alan = a.b.Sin(a)/2
// Birinci kenarı giriniz (cm)    = 5
// İkinci kenarı giriniz (cm)     = 10
// Aradaki açıyı giriniz (derece) = 25
// Üçgenin Alanı (cm²)            = 10,57 cm²

public class Main {
    public static void main(String[] args) {
       double a,b,aci,alan;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz (cm) : ");
        a=scanner.nextDouble();
        System.out.println("İkinci kenarı giriniz (cm) : ");
        b=scanner.nextDouble();
        System.out.println("Aradaki açıyı giriniz (derece) : ");
        aci=scanner.nextDouble();

        alan = a*b*Math.sin(Math.toRadians(aci))/2;
        System.out.printf("Üçgenin Alanı (cm²) : %.2f",alan);

    }
}