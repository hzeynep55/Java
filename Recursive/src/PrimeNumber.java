import java.util.Scanner;

public class PrimeNumber {
     static boolean Prime(int n){

        int counter=0; boolean result=false;
        for(int i=1; i<n+1; i++){
            if(n%i==0){
               counter++;

            }


        }
        if(counter<=2){
            result=true;
        }
        return  result;




    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int i=5, num;
        while(i>0){
            System.out.print("Lütfen bir sayı giriniz: ");
            num=s.nextInt();
            if(Prime(num)==true){
                System.out.println(num+" sayısı asaldır.");

            }
            else
                System.out.println(num+" sayısı asal değildir.");

            i--;

        }

    }
}
