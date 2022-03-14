import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);




            while (true) {

                System.out.print("Bir sayı giriniz: ");
                int n = input.nextInt();

                int toplam = 0;
                for (int i = 1; i < n; i++) {
                    if (n % i == 0)
                        toplam += i;
                }
                if (toplam == n) {
                    System.out.println(n + " mükemmel sayıdır.");
                    System.out.println("Devam mı(Evet=1,Hayır=2)");
                    int m= input.nextInt();
                    if(m==2)
                        break;
                    else if(m==1)
                        continue;
                    else
                        System.out.print("Yanlış değer girdiniz.");

                }

                else
                    System.out.println(n + " mükemmel sayı değildir.");
                    System.out.println("Devam mı(Evet=1,Hayır=2)");
                    int m= input.nextInt();
                    if(m==2)
                      break;
                    else if(m==1)
                        continue;
                    else
                        System.out.print("Yanlış değer girdiniz.");



            }




    }


}
