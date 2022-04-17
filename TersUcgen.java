import java.util.Scanner;

public class TersUcgen {
    static boolean Ucgen(int n){
        if(n==0){
            return false;
        }
        for(int i=n-1; i>=0; i--){
            for(int k=n-i; k>0; k--){
                System.out.print(" ");
            }
            for(int j=2*i+1; j>0; j--){
                System.out.print("*");
            }
            System.out.println();

        }
        return true;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        while(true){
        System.out.print("Sayı giriniz: ");
        int n=s.nextInt();
        if(!Ucgen(n)){
            break;
        }




        }

    }
}
