import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args){

        Scanner giris=new Scanner(System.in);


        System.out.print("Bir sayı giriniz: ");
        int num1=giris.nextInt();

        System.out.print("Bir sayı daha giriniz: ");
        int num2=giris.nextInt();

        int n=num1;
        int ebob=1;


            while (n > 1) {
                if (num1 % n == 0 && num2 % n == 0) {
                    ebob = n;
                    break;
                }
                n--;


            }
            int ekok=(num1*num2)/ebob;
            System.out.println("İki sayının Ebob'u: "+ebob);
            System.out.print("İki sayının Ekok'u: "+ ekok);




        }



    }
