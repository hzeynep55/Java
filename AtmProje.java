import java.util.Scanner;

public class AtmProje {
    public  static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        String user, password;
        int secim, bakiye = 3000;

        
            System.out.print("Kullanıcı adınızı giriniz: ");
            user = giris.nextLine();

            System.out.print("Kullanıcı adınızı giriniz: ");
            password = giris.nextLine();

            while (true) {
                if (user.equals("akifb_") && password.equals("123456")) {
                    System.out.println("Bankacılık Sistemine Hoşgeldiniz");
                    System.out.println("Yapmak istediğiniz işlemi seçiniz:\n1-Para Çekme\n2-Para Yatırma\n3-Bakiye Sorgulama\n4-Çıkış");
                    secim = giris.nextInt();

                    switch (secim) {
                        case 1:
                            System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                            int cmiktar = giris.nextInt();
                            if (cmiktar >= 10) {
                                bakiye = bakiye - cmiktar;
                                System.out.print(cmiktar + " TL bakiyenizden çekilmiştir.");

                            } else
                                System.out.print("10₺ nin altında para çekimi yapılamaz.");
                            continue;

                        case 2:
                            System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                            int ymiktar = giris.nextInt();
                            bakiye = bakiye + ymiktar;
                            System.out.print(ymiktar + " TL bakiyenize başarılı bir şekilde aktarılmıştır..");
                            continue;
                        case 3:
                            System.out.print(bakiye);

                        case 4:
                            System.out.print("Sistemden başarılı bir şekilde çıkıldı.");
                            break;
                        default:
                            System.out.print("Lütfen geçerli numarayı giriniz");
                            continue;

                    }


                } else
                    System.out.print("Kullanı adınız ya da parolanız hatalı!");
                break;


            }



    }
}
