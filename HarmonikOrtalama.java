import java.util.Scanner;

public class HarmonikOrtalama {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int[] dizi=new int[5];
        int[] dizia={1,5,69,3};

        int i=0;
        while(i<5) {
            System.out.print("Lütfen bir sayı giriniz: ");
            dizi[i] = inp.nextInt();
            i++;

        }

        System.out.print("["); //dizi adındaki dizinin elamanları ekrana yazdırıldı.
        for(int j=0; j<dizi.length; j++){
            if(j==dizi.length-1){ // Son indexten sonra virgül olmaması için yazıldı.
                System.out.print(dizi[j]);
            }
            else
                System.out.print(dizi[j]+" ,");
        }
        System.out.println(" ]");


        double sum=0; // dizideki elemanların harmoniği
        for (double sayi:dizi) {
            sum+=(1/sayi);

        }

        double avg=(dizi.length-1)/sum; // dizideki sayıların harmoniklerinin ortalaması
        System.out.print("Dizi elemanlarının harmonik ortalaması: ");
        System.out.format("%.2f\n",avg);


        double sum1=0;
        for (double n:dizia) { //dizia için elemanların harmoniği
            sum1+=(1/n);

        }

        System.out.println("----------------------------");
        System.out.print("["); //dizia adındaki dizinin elamanları ekrana yazdırıldı.
        for(int j=0; j<dizia.length; j++){
            if(j==dizia.length-1){ // Son indexten sonra virgül olmaması için yazıldı.
                System.out.print(dizia[j]);
            }
            else
                System.out.print(dizia[j]+" ,");
        }
        System.out.println(" ]");




        double avg1=(dizi.length-1)/sum1; // diziadaki sayıların harmoniklerinin ortalaması
        System.out.print("Dizia elemanlarının harmonik ortalaması: ");
        System.out.format("%.2f",avg1);




    }
}
