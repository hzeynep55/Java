import java.util.Scanner;

public class Polindrom {
    static boolean isPolindrom(int num){
        int temp=num, reversNumber=0, lastNumber=0;
        while(temp!=0){
            System.out.println("============");
            System.out.println("Sayı: "+temp);
            lastNumber=temp%10;
            System.out.println("Son Basamak:"+lastNumber);
            reversNumber=(reversNumber*10)+lastNumber;
            System.out.println("Yeni Sayı: "+reversNumber);
            temp/=10;




        }
        if(num==reversNumber){
            return true;
        }
        else{
            return false;
        }





    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int n=s.nextInt();
        if(isPolindrom(n)){
            isPolindrom(n);
            System.out.println(n+" polidrom bir sayıdır.");
        }
        else{
            isPolindrom(n);
            System.out.println(n+" polidrom bir sayı değildir.");

        }




    }
}
