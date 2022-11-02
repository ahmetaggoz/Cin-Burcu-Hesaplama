package Giris;
import java.util.Scanner;
public class CinBurcuHesaplama {
    public static void main(String[] args) {
        int dogumYili,durum;
        String burc = "";
        Scanner pipi = new Scanner(System.in);

        System.out.print("Doğum yılınızı girin : ");
        dogumYili = pipi.nextInt();

        durum = dogumYili % 12;

        switch (durum){
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
            default:
                System.out.println("Geçersiz veri !!");
        }

        System.out.println("Burcunuz " + burc);

    }
}
