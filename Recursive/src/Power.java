import java.util.Scanner;

public class Power {
    static int Pow(int n,int p){
        if(p==0){
            return 1;
        }
        int sonuc=1;
        while(p>0){
            sonuc*=n;
            p--;
        }

        return sonuc;

    }
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Taban değerini giriniz: ");
            int num=sc.nextInt();
            System.out.print("Üs değerini giriniz: ");
            int pow=sc.nextInt();
            System.out.println("Sonuç: "+Pow(num,pow));
            if(num==0){
               break;
            }

        }


    }
}
