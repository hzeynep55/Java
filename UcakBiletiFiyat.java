import java.text.DecimalFormat;
import java.util.Scanner;

public class UcakBiletiFiyat {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int km,yas,yon;
        double mesafe=0.10, tutar, indirim,indirimli_tutar,gd_indirimli, toplam_tutar;

        System.out.print("Yolculuk tipini giriniz (Tek yön-1,Gidiş-Dönüş-2):");
        yon=inp.nextInt();

        System.out.print("Mesafeyi(km) yazınız: ");
        km=inp.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas=inp.nextInt();

        tutar = km * mesafe;
        DecimalFormat df=new DecimalFormat("#.##"); // Virgülden sonra iki basamak olması için kullanacağı


        if (km<0)
            System.out.print("Hatalı veri girdiniz.");
        else{
            if(yas<0)
                System.out.print("Hatalı veri girdiniz.");

            else if(yas<12) {

                indirim = tutar * 0.50;
                indirimli_tutar = tutar - indirim;
                if(yon==1){
                    System.out.print("Ödemeniz gereken tutar: "+df.format(indirimli_tutar));


                }
                else if(yon==2) {
                    gd_indirimli = indirimli_tutar * 0.20;
                    toplam_tutar = (indirimli_tutar - gd_indirimli)*2;
                    System.out.print("Ödemeniz gereken tutar: "+df.format(toplam_tutar));
                }
                else
                    System.out.print("Hatalı veri girdiniz.");


            }
            else if(yas>=12 && yas<25){

                indirim=tutar*0.10;
                indirimli_tutar=tutar-indirim;
                if(yon==1){
                    System.out.print("Ödemeniz gereken tutar: "+df.format(indirimli_tutar));


                }
                else if(yon==2) {
                    gd_indirimli = indirimli_tutar * 0.20;
                    toplam_tutar = (indirimli_tutar - gd_indirimli)*2;
                    System.out.print("Ödemeniz gereken tutar: "+df.format(toplam_tutar));
                }
                else
                    System.out.print("Hatalı veri girdiniz.");

            }
            else if(yas>65){
                indirim=tutar*0.30;
                indirimli_tutar=tutar-indirim;
                if(yon==1){
                    System.out.print("Ödemeniz gereken tutar: "+df.format(indirimli_tutar));


                }
                else if(yon==2) {
                    gd_indirimli = indirimli_tutar * 0.20;
                    toplam_tutar = (indirimli_tutar - gd_indirimli)*2;
                    System.out.print("Ödemeniz gereken tutar: "+df.format(toplam_tutar));
                }
                else
                    System.out.print("Hatalı veri girdiniz.");
            }
            else{

                if(yon==1)
                    System.out.print("Ödemeniz gereken tutar: "+df.format(tutar));
                else if(yon==2){
                    gd_indirimli=tutar*0.20;
                    toplam_tutar=(tutar-gd_indirimli)*20;
                    System.out.print("Ödemeniz gereken tutar: "+df.format(toplam_tutar));

                }
                else
                    System.out.print("Hatalı veri girdiniz.");

            }

        }

        }







    }
