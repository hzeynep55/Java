
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int matematik, fizik,kimya,turkce,tarih,muzik, ort;

        System.out.println("Matematik ders notu:");
        matematik=input.nextInt();

        System.out.println("Fizik ders notu:");
        fizik=input.nextInt();

        System.out.println("Kimya ders notu:");
        kimya=input.nextInt();

        System.out.println("Türkçe ders notu:");
        turkce=input.nextInt();

        System.out.println("Tarih ders notu:");
        tarih=input.nextInt();

        System.out.println("Müzik ders notu:");
        muzik=input.nextInt();
        
        ort=(matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println((ort>=60)?"Sınıfı Geçti":"Sınıfta Kaldı");





    }
}
