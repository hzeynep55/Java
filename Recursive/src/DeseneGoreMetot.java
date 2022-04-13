import java.util.Scanner;

public class DeseneGoreMetot {
    static void Sayi(int num){
        if (num <= 0) {
            System.out.print(num + " ");
            return;
        }

       Sayi(num-5);
       System.out.print(num+" ");




    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi=s.nextInt();
        System.out.print(sayi+" ");
        Sayi(sayi);




    }
}
