package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        

        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz\n(1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme)\n ");
        int secim=input.nextInt();

        System.out.print("İşlem için bir sayı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("İşlem için bir sayı daha giiriniz: ");
        int sayi2 = input.nextInt();

        switch (secim) {
            case 1:
                int toplam = sayi1 + sayi2;
                System.out.print("İşlem sonucu:" + toplam);
                break;
            case 2:
                int cikar = sayi1 - sayi2;
                System.out.print("İşlem sonucu:" + cikar);
                break;
            case 3:
                int carp = sayi1 * sayi2;
                System.out.print("İşlem sonucu:" + carp);
                break;
            case 4:
                int bol = sayi1 / sayi2;
                System.out.print("İşlem sonucu:" + bol);
                break;
            default:
                System.out.print("Lütfen geçerli sayıyı giriniz.");
        }












    }
}
