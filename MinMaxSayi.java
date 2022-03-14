import java.util.Scanner;

public class MinMaxSayi {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç tane sayı girmek istiyorsunuz?->  ");
        int n=input.nextInt();

        int num,maks=0,min=0;
        for(int i=1; i<=n; i++){
            System.out.print(i+"."+"Sayıyı giriniz: ");
            num=input.nextInt();
            if (i == 1) {
                min=num;
                maks=num;

            }
            if(num>maks){
                maks=num;

            }
            if(num<min){
                min=num;
            }

            }
            System.out.println("En büyük sayı: "+maks);
            System.out.print("En küçük sayı: "+min);
        }


    }
