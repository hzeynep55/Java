
public class Taksimetre {


    public static void main(String[] args){
       Scanner girdi=new Scanner(System.in);
       double km, toplam, limit=2.20;
       int min=10;

       System.out.print("Gidilecek km mesafeyi yazınız: ");
       km=girdi.nextDouble();
       toplam=min+(limit*km);
       toplam=(toplam<20)?20:toplam;

       System.out.print("Ödenecek tutar: "+toplam);


/*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.*/



    }
}
