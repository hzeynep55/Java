import java.util.Scanner;

public class HavaDurumu {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int sicaklik;
        System.out.print("Hava sıcaklığını yazınız: ");
        sicaklik=inp.nextInt();
        String  etkinlik=(sicaklik<5)?"Kayak yapmanı öneriyoruz :)":(sicaklik>=5 && sicaklik<15)
                ?"Sinemaya gitmek için harika bir hava :)":(sicaklik>=15&&sicaklik<=25)
                ?"Bir pikniğe gitmenin vakti gelmedi mi sence?":"Yüzme en iyi spor aktivesidir!";

        System.out.print(etkinlik);


    }
}
