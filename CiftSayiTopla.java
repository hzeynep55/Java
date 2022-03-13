import java.util.Scanner;

public class CiftSayiTopla {
    public static  void main(String[] args){
        Scanner inp=new Scanner(System.in);

        int num,toplam=0;
        boolean kosul=true;
        while (kosul){
            System.out.print("Bir sayı griniz: ");
            num=inp.nextInt();
            if(num%2==0)
                if(num%4==0)
                   toplam+=num;
                else
                    kosul=true;
            else{
                kosul=false;

            }


        }
        System.out.print("Girdiğiniz sayılardan 4'ün katı olan sayıların toplamı: "+toplam);
      
      /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 
      4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/
    }
}
