import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sayilar {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        try {
            int sayi1, sayi2, sayi3;
            System.out.print("Lütfen bir sayı giriniz: ");
            sayi1 = inp.nextInt();

            System.out.print("Lütfen bir sayı giriniz: ");
            sayi2 = inp.nextInt();

            System.out.print("Lütfen bir sayı giriniz: ");
            sayi3 = inp.nextInt();
            int[] dizi = {sayi1, sayi2, sayi3};
            Arrays.sort(dizi);
            String result = Arrays.stream(dizi).mapToObj(String::valueOf).collect(Collectors.joining(" < "));
            System.out.print(result);
        }
        catch (Exception E){
            System.out.print("Geçerli bir sayı girmediniz.");
        }




    }
}
//Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
