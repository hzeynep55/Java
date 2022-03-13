import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args){
        int say;
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        say=inp.nextInt();

        System.out.println("4'ün kuvvetleri\n");
        for(int i=1; i<=say; i*=4){
            System.out.println(i);

            }
        
        System.out.println("5'in kuvvetleri\n");
        int j=1;
        do {

            System.out.println(j);
            j*=5;
        }
        while (j<say+1);






    }
}
