public class TekrarEdenSayi {
    static boolean isFind(int[] arr, int value){// tekrar eden sayıları birden fazla yazdırmaması içim kullanıldı.
        for (int k:arr) {
            if(k==value)
                return  true;

        }
        return false;

    }
    public static void main(String[] args){

        int[] liste={3,6,52,8,4,8,2,4,4,4,36,36,22,22,22,9,4,5,2};
        int[] dublicate=new int[liste.length];
        int index=0;

        for(int i=0; i<liste.length; i++){// Tekrar eden sayıyı bulmak için dizinin içinde iki kere dönecek.
            for(int j=0; j<liste.length; j++){
                if(liste[i]%2==0) {
                    if ((i != j) && (liste[i] == liste[j])) {
                        if (!isFind(dublicate, liste[i])) {
                            dublicate[index++] = liste[i];

                        }
                        break;


                    }
                }

            }

        }

        for (int l:dublicate) {
            if(l!=0)
                System.out.print(l+",");

        }


    }
}
