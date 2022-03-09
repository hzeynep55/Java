package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        
        System.out.print("Kullanıcı adını giriniz: ");
        String k_ad=input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        String sifre=input.nextLine();

        if(!sifre.equals("123456")){
            System.out.print("Girdiğiniz şifre yanlış, şifreyi sıfırlamak ister misin?(E/H): ");
            String evet_hayir=input.nextLine();
            if(evet_hayir.equals("E")|| evet_hayir.equals("e")){
                System.out.println("Lütfen yeni şifre oluşturunuz.");
                System.out.print("Yeni şifre: ");
                String yeniSifre=input.nextLine();
                if(yeniSifre.equals("123456"))
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    
                    

                else
                    System.out.print("Şifre oluşturuldu ");

            }
            else
                System.out.print("Sistemden çıktınız.");


        }
        else if(!k_ad.equals("akifb"))
            System.out.print("Girdiğiniz kullanıcı adı hatalı");
        else
            System.out.print("Giriş başarılı");

        











    }
}   
