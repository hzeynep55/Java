import java.util.Scanner;

public class UsAlma {
    public  static  void main(String[] args){
        int num,us;
        Scanner girdi=new Scanner(System.in);
        try {
            System.out.print("Üssü alınacak sayıyı giriniz: ");
            num = girdi.nextInt();

            System.out.print("Üs alınacak sayıyı giriniz: ");
            us = girdi.nextInt();

            int toplam = 1;
            for (int i = 0; i < us; i++) {
                toplam *= num;
            }
            System.out.print(toplam);
        }catch(Exception e){
            System.out.print("Geçerli değer girmediniz.");
        }
    }
}
