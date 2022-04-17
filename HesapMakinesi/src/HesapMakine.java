import java.util.Scanner;
public class HesapMakine {
    static void plus(){
        Scanner sc=new Scanner(System.in);
        int i=0, result=0;

        while(true) {

            System.out.print("sayı: ");
            int num = sc.nextInt();
            i++;
            if (i==100|| num==0){
                break;

            }
            result+=i;



        }
        System.out.print("Sonuç:"+result);

    }
    static void  minus(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int counter=sc.nextInt();
        int num, result=0;
        for(int i=1; i<=counter; i++){
            System.out.print(i+". sayı: ");
            num=sc.nextInt();
            if(i==1){
                result+=num;
                continue;
            }
            else {
                result-=num;
            }

        }
        System.out.print("Sonuç: "+result);
    }
    static void times(){
        Scanner sc=new Scanner(System.in);
        int i=1, result=1;
        while(true) {
            System.out.print(i++ +".Sayi: ");
            int num = sc.nextInt();

            if(num==1){
                break;
            }
            if(num==0){
                result=0;
                break;

            }
            result*=num;

        }
        System.out.print("Sonuç: "+result);
    }
    static void divided(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int counter=sc.nextInt();
        double num, result=0.0;

        for(int i=1; i<=counter;i++){
            System.out.print(i+".Sayı: ");
            num=sc.nextInt();
            if(i!=1 && num==0){
                System.out.print("Böleni sıfır giremezsiniz.");
                continue;
            }
            if(i==1){
                result=num;
                continue;
            }
            result/=num;

        }
        System.out.println("Sonuç:"+result);
    }
    static  void power(){
        Scanner s=new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int base=s.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exponent=s.nextInt();
        int result=1;
        for(int i=1; i<=exponent; i++ ){
            result*=base;
        }
        System.out.print("Sonuç: "+result);

    }
    static void factorial(){
        Scanner s=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n=s.nextInt();
        int result=1;
        for(int i=1; i<=n; i++){
            result*=i;

        }
        System.out.print("Sonuç: "+result);


    }
    static void mode(){
        Scanner s=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int divisor=s.nextInt();
        System.out.print("Kaça bölmek istiyorsunuz: ");
        int dividend=s.nextInt();
        if(divisor==0 || dividend==0){
            System.out.println("Bölünen ya da bölen 0 olamaz.");
        }
        int result=divisor%dividend;
        System.out.print("Kalan: "+result);

    }
    static void rectangle(){
        Scanner s=new Scanner(System.in);
        System.out.print("Uzun kenarı giriniz: ");
        int length=s.nextInt();
        System.out.print("Kısa kenarı giriniz: ");
        int width=s.nextInt();
        int perimeter=0;
        int area=0;
        perimeter=(2*length)+(2*width);
        System.out.println("Dikdörtgenin çevresi: "+perimeter);
        area=length*width;
        System.out.println("Dikdörtgenin alanı: "+area);

    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int select;
        String menu="1.Toplama İşlemi\n"
                + "2.Çıkarma İşlemi\n"
                + "3.Çarpma\n"
                + "4.Bölme\n"
                + "5.Üslü Sayı Hesaplama\n"
                +" 6.Faktoriyel Alma\n"
                + "7.Mod Alma\n"
                +" 8.Dikdörtgen Alan ve Çevre Hesabı\n"
                +" 0.Çıkış\n";
        do{

            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            System.out.print(menu);
            select=s.nextInt();
            switch (select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.print("Yanlış değer girdiniz. Tekrar deneyiniz");
            }


        }while (select!=0);

    }





}
