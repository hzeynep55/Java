
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double elmak=3.67,armutk=2.14,muzk=0.95,domatesk=1.11,patlicank=5.00;

        System.out.print("Armutun kilosu: ");
        int armut=input.nextInt();

        System.out.print("Elmanın kilosu: ");
        int elma=input.nextInt();

        System.out.print("Muzun kilosu: ");
        int muz=input.nextInt();

        System.out.print("Domatesin kilosu: ");
        int domates=input.nextInt();

        System.out.print("Patlıcanın kilosu: ");
        int patlican=input.nextInt();


        double atutar=armutk*armut;
        double etutar=elmak*elma;
        double mtutar=muzk*muz;
        double dtutar=domatesk*domates;
        double ptutar=patlicank*patlican;
        double toplamtutar=atutar+etutar+mtutar+dtutar+ptutar;

        System.out.println("Toplam ödenecek tutar:" +toplamtutar);






    }
}
