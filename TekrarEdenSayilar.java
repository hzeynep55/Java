
public class TekrarEdenSayilar {
    static boolean isS(int[] arr,int value){
        for(int t:arr){
            if(t==value){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args){
        int[] dizi={10,20,20,10,10,20,5,20};


        int[] ydizi=new int[dizi.length];
        int sayac=0,newindex=0;



        System.out.println("Tekrar eden sayılar: ");
        for(int i=0; i<dizi.length; i++){

            for(int j=0; j<dizi.length; j++) {

                    if (dizi[i] == dizi[j]) {

                        sayac++;


                    }





            }

            if(!isS(ydizi,dizi[i])){
                ydizi[newindex++]=dizi[i];
                System.out.println(dizi[i]+" sayısı "+sayac+" kere tekrar edildi.");


            }
            sayac=0;




        }

    }
}



