import java.text.DecimalFormat;
import java.util.Scanner;

public class VucutkitleIndeksi {
    public static void main(String[] args){

        Scanner inp=new Scanner(System.in);
        System.out.println("Kilonuzu giriniz(kg):");
        double kilo=inp.nextDouble();

        System.out.println("Boyunuzu giriniz(m):");
        double boy=inp.nextDouble();
        DecimalFormat df=new DecimalFormat("#.##"); // Virgülden sonra iki basamak olması için kullanacağız

        double indeks=kilo/(boy*boy);

        System.out.println("Vücut kitle indeksi: "+df.format(indeks));

    }


}
