import java.util.Scanner;
import java.util.Arrays;

public class ElemanSiralama {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Dizini boyutunu giriniz: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int j=1;


        for(int i=0; i<size; i++){
            System.out.print("Dizinin elaman sayısını giriniz: ");
            int element=sc.nextInt();
            arr[i]=element;
        }

        System.out.println("Dizinin boyutu: "+size);
        for (int l:arr) {
            System.out.println(j+".Elemanı: "+l);
            j++;

        }
        Arrays.sort(arr);
        System.out.print("Sıralama: ");
        for (int s:arr) {
            System.out.print(s+" ");

        }





    }
}
