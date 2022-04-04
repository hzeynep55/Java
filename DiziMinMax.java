import java.util.Scanner;


public class DiziMinMax {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int[] arr={2,3,56,98,47,36,12};
        System.out.print("Bir sayı giriniz: ");
        int num=inp.nextInt();
        int sum=0,sum1=0;

        for (int sayi:arr) {
            if(sayi<num){
                sum+=1;

            }
            else if(sayi>num){
                sum1+=1;
            }
            else{
                System.out.println("Girilen sayı ile eşit sayı");
            }

        }

        System.out.println(sum);
        System.out.println(sum1);

        int[] maks=new int[sum1];
        int[] min=new int[sum];
        int m=0,n=0;

        for (int s:arr) {
            if(s<num){
                min[m]=s;
                m+=1;

            }
            else if(s>num){
                maks[n]=s;
                n+=1;
            }

        }
        System.out.print("{ ");
        int deger=arr.length-1;
        for (int a:arr) {
            if(a==arr[deger])
                System.out.print(a);
            else
              System.out.print(a+",");

        }
        System.out.println(" }");

        System.out.println("Girilen sayı:" +num);

        int mimax=min[0];
        for (int mi:min) {
            if(mi>mimax)
                mimax=mi;
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: "+mimax);

        int maxmin=maks[0];
        for (int ma:maks) {
            if(ma<maxmin)
                maxmin=ma;
        }
        System.out.println("Girilen sayıdan büyük en yakın sayı: "+maxmin);

    }

}
