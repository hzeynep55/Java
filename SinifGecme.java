import java.util.Scanner;

public class SinifGecme {
    public static  void main(String[] args){
       Scanner inp=new Scanner(System.in);
       int mat,fiz,turk,muz,kim, toplam=0;
       double ort;

        System.out.print("Matemetik notunu giriniz:");
        mat=inp.nextInt();
        if(!(mat<0 && mat>100)){
            toplam+=mat;
        }

        System.out.print("Fizik notunu giriniz:");
        fiz=inp.nextInt();
        if(!(fiz<0 && fiz>100)){
            toplam+=fiz;
        }

        System.out.print("Türkçe notunu giriniz:");
        turk=inp.nextInt();
        if(!(turk<0 && turk>100)){
            toplam+=turk;
        }

        System.out.print("Müzik notunu giriniz:");
        muz=inp.nextInt();
        if(!(muz<0 && muz>100)){
            toplam+=muz;
        }

        System.out.print("Kimya notunu giriniz:");
        kim=inp.nextInt();
        if(!(kim<0 && kim>100)){
            toplam+=kim;
        }


        ort=toplam/5;

        if(ort>=55){
            System.out.print("Sınıfı "+ort+" ortalama ile geçtiniz.");
        }
        else{
            System.out.print("Sınıfı geçemediniz.");
        }






    }
}
