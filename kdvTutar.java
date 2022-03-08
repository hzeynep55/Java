
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double fiyat;
        System.out.print("Ürünün fiyatını giriniz: ");
        fiyat=input.nextDouble();
        double kdv_tutar,kdv=0.18, kdv2=0.8;
        

            if (fiyat >= 0 && fiyat <= 1000) {
                kdv_tutar = ((fiyat * kdv) + fiyat);
                System.out.println("kdvli fiyat: " + kdv_tutar);
            } else if (fiyat > 1000) {
                kdv_tutar = ((fiyat * kdv2) + fiyat);
                System.out.println("kdvli fiyat: " + kdv_tutar);
            } else {
                System.out.println("Geçersiz tutar girişi yaptınız.");
            }









    }
}
