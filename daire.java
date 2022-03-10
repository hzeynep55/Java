import java.util.Scanner;

public class daire {
    public static void main(String[] args){
       int ycap;
       double pi=3.14;
       int merkezAci;
       Scanner input=new Scanner(System.in);
       System.out.println("Dairenin yarıçapını giriniz: ");
       ycap=input.nextInt();
       System.out.println("Merkez açıyı giriniz: ");
       merkezAci=input.nextInt();
       double cevre=2*pi*ycap;
       double alan=2*pi*Math.pow(ycap,2);
       double alan_2=(pi*(ycap*ycap)*merkezAci)/360;

        System.out.println("Dairenin çevresi: "+cevre);
        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Daire diliminin alanı: "+alan_2);




    }
}

