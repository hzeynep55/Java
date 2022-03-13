import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Sayı giriniz: ");
        num=input.nextInt();

        double toplam=0;
        for(double i=1; i<=num; i++){
            toplam+=(1/i);

        }
        System.out.print(toplam);
    }
}
