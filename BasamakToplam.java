import java.util.Scanner;

public class BasamakToplam {
    static int Basamakt(int nu){
        int basamakSayisi=0, basamakToplam=0;
        int n=nu;
        while(n!=0){

            basamakSayisi=n%10;
            basamakToplam+=basamakSayisi;
            n=n/10;

        }
        return basamakToplam;


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Sayı girin: ");
        int num=sc.nextInt();

        System.out.println(num+" sayısı basamakları toplamı: "+Basamakt(num));

    }
}
