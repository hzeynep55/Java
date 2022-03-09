package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner();
        int a,b,c;
        System.out.println("Üçgenin 1.kenar uzunuluğu:");
        a=input.nextInt();

        System.out.println("Üçgenin 2.kenar uzunuluğu:");
        b=input.nextInt();

        System.out.println("Üçgenin 3.kenar uzunuluğu:");
        c=input.nextInt();

        int t=a+b+c;
        int Ucgen_cevre=2*t;
        int Ucgen_Alan=t * (t-a)* (t -b) * (t-c)

        System.out.println("Üçgenin çevresi:"+Ucgen_cevre);
        System.out.println("Üçgeni Alanı: "+Ucgen_Alan);




    }








}
