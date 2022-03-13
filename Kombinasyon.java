import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args){
        Scanner giris=new Scanner(System.in);
        System.out.print("Eleman sayısını yazınız: ");
        int n=giris.nextInt();

        System.out.print("Alt küme eleman sayısını yazınız: ");
        int r=giris.nextInt();

        int nr=n-r;
        int total=1;
        int total2=1;
        int total3=1;

        if(r<=n){
            for(int i=1; i<=n; i++){
                total*=i;
            }

            for(int j=1; j<=r; j++){
                total2*=j;
            }

            for(int k=1; k<=nr; k++){
                total3*=k;
            }


            int Komb=total/(total2*total3);
            System.out.print(Komb);


        }
        else
            System.out.print("Alt küme eleman sayısı, eleman sayısından büyük olamaz.");


    }
}
