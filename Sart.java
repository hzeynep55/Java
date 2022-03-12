import java.util.Scanner;

public class Sart {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int sayi, toplam=0, ort;
        System.out.print("Lütfen bir sayı giriniz: ");
        sayi=inp.nextInt();
        if(sayi>0) {
            for (int i = 0; i <= sayi; i++){
                if(i%3==0 && i%4==0){
                    toplam+=i;
                }

            }
            ort=toplam/(sayi+1);
            System.out.print("Sayıların ortalaması "+ort);
        }
        else
            System.out.print("Geçerli bir sayı girmediniz.");


    }
}
