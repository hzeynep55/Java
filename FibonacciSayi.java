import java.util.Scanner;

public class FibonacciSayi {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi=s.nextInt();
        int sonuc,num1=0,num2=1;
        for(int i=0; i<sayi; i++){
            sonuc=num1+num2;

            System.out.println(num1+"+"+num2+"="+sonuc);

            num1=num2;
            num2=sonuc;



        }





    }

}
