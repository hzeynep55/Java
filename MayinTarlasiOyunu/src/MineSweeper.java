import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    char mayin[][];
    String bostarla[][];
    public void Giris(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Satır giriniz: ");
        int satir=inp.nextInt();
        System.out.println("Sutun giriniz: ");
        int sutun=inp.nextInt();

        OyunTarla(satir,sutun);
        MayinKoyma(satir,sutun);
        TarlaGoster(satir,sutun);
        Oynama(satir,sutun);





    }
    public void OyunTarla(int satir,int sutun){
        mayin=new char[satir][sutun];
        bostarla=new String[satir][sutun];
        for(int i=0; i<satir;i++){
            for(int j=0; j<sutun; j++){
                mayin[i][j]='-';
                bostarla[i][j]="-";
            }
            System.out.println();
        }

    }
    public void MayinKoyma(int satir,int sutun){
        int mayinsayisi=(satir*sutun)/4;
        for(int i=0; i<mayinsayisi; i++){
            Random rnd=new Random();
            int rndsatir=rnd.nextInt(satir);
            int rndsutun=rnd.nextInt(sutun);
            if(mayin[rndsatir][rndsutun]=='*'){
                mayinsayisi++;
            }
            else{
                mayin[rndsatir][rndsutun]='*';
            }
        }
    }
    public void TarlaGoster(int satir, int sutun){
        System.out.println("Mayınların Konumu");
        for(int i=0; i<satir; i++){
            for(int j=0; j<sutun; j++){
                System.out.print(mayin[i][j]);
            }
            System.out.println();
        }
        System.out.println("========================");


    }
    public void Oynama(int satir,int sutun){
        Scanner inp=new Scanner(System.in);
        int toplam=satir*sutun;
        int bosalan=toplam-(toplam/4);

        System.out.println("Mayın Tarlası Oyununa Hoş Geldiniz !");
        while (!(bosalan<0)){
            for(int i=0; i<satir; i++){
                for(int j=0; j<sutun; i++){
                    System.out.print(bostarla[i][j]+" ");

                }
                System.out.println();
            }
            System.out.println("Satır giriniz: ");
            int row= inp.nextInt();
            System.out.println("Sutun giriniz: ");
            int column= inp.nextInt();
            System.out.println("==================== ");
            int msum=0;
            if(!(row>satir || row<0) && (column>sutun || row<0)){
                if(!(mayin[row][column]=='*')){
                    if(row-1>=0){  //Yukarı
                        if(mayin[row-1][column]=='*'){
                            msum++;
                        }
                    }
                    if(row+1<satir){ //Aşağı
                        if(mayin[row+1][column]=='*'){
                            msum++;

                        }
                    }
                    if(column-1>=0){ //Sol
                        if(mayin[row][column-1]=='*'){
                            msum++;

                        }

                    }
                    if(column+1<sutun){ //Sağ
                        if(mayin[row][column+1]=='*'){
                            msum++;

                        }

                    }
                    if(row-1>=0 && column+1<sutun){ //Yukarı Çapraz Sağ
                        if(mayin[row-1][column+1]=='*'){
                            msum++;

                        }

                    }
                    if(row-1>=0 && column-1>=0){ //Yukarı Çapraz Sol
                        if(mayin[row-1][column-1]=='*'){
                            msum++;

                        }

                    }
                    if(row+1<satir && column+1<sutun){ //Aşağı Çapraz Sağ
                        if(mayin[row+1][column+1]=='*'){
                            msum++;

                        }

                    }
                    if(row+1<satir && column-1>=0){ //Aşağı Çapraz Sol
                        if(mayin[row+1][column+1]=='*'){
                            msum++;

                        }

                    }

                    bostarla[row][column]=String.valueOf(msum);



                }
                else{
                    System.out.println("Game Over!!");
                    break;
                }
                bosalan--;

                System.out.println("========================");
            }
            else{
                System.out.println("Yanlış satır ya da sutun değeri girdiniz.");
            }



        }


    }


}
