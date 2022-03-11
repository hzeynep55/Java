import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

            System.out.print("Kaçıncı ayda doğdunuz?: ");
            int month = input.nextInt();

            System.out.print("Ayın hangi gününde doğdunuz?: ");
            int day = input.nextInt();

            if (month == 1 && day >= 1 && day <= 31) {
                if (day < 22)
                    System.out.print("Oğlak burcusunuz.");
                else
                    System.out.print("Kova burcusunuz.");

            } else if (month == 2 && day >= 1 && day <= 29) {
                if (day < 20)
                    System.out.print("Kova Burcusunuz.");
                else
                    System.out.print("Balık Burcusunuz.");
            } else if (month == 3 && day >= 1 && day <= 31) {
                if (day < 21)
                    System.out.print("Balık burcusunuz.");
                else
                    System.out.print("Koç burcusunuz.");
            } else if (month == 4 && day >= 1 && day <= 30) {
                if (day < 21)
                    System.out.print("Koç burcusunuz.");
                else
                    System.out.print("Boğa burcusunuz.");
            } else if (month == 5 && day >= 1 && day <= 31) {
                if (day < 22)
                    System.out.print("boğa Burcusunuz.");
                else
                    System.out.print("İkizler burcusunuz.");
            } else if (month == 6 && day >= 1 && day <= 30) {
                if (day < 23)
                    System.out.print("İkizler burcusunuz.");
                else
                    System.out.print("Yengeç burcusunuz.");
            } else if (month == 7 && day >= 1 && day <= 31) {
                if (day < 23)
                    System.out.print("Yengeç burcusunuz.");
                else
                    System.out.print("Aslan burcusunuz.");
            } else if (month == 8 && day >= 1 && day <= 31) {
                if (day < 23)
                    System.out.print("Aslan burcusunuz.");
                else
                    System.out.print("Başak burcusunuz.");
            } else if (month == 9 && day >= 1 && day <= 30) {
                if (day < 23)
                    System.out.print("Başak burcusunuz.");
                else
                    System.out.print("Terazi burcusunuz.");
            } else if (month == 10 && day >= 1 && day <= 31) {
                if (day < 23)
                    System.out.print("Terazi burcusunuz.");
                else
                    System.out.print("Akrep burcusunuz.");
            } else if (month == 11 && day >= 1 && day <= 30) {
                if (day < 22)
                    System.out.print("Akrep burcusunuz.");
                else
                    System.out.print("Yay burcusunuz.");
            } else if (month == 12 && day >= 1 && day <= 31) {
                if (day < 22)
                    System.out.print("Yay burcusunuz.");
                else
                    System.out.print("Oğlak burcusunuz.");
            }
        }




    }
