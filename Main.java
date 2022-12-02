import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, tarih, muzik, kimya;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        mat =inp.nextInt();

        System.out.print("Fizik notunuz:");
        fizik =inp.nextInt();

        System.out.print("Tarih notunuz:");
        tarih =inp.nextInt();

        System.out.print("Muzik notunuz:");
        muzik =inp.nextInt();

        System.out.print("Kimya notunuz:");
        kimya =inp.nextInt();

        int toplam=mat+kimya+muzik+fizik+tarih;
        double ortalama =toplam/5.0;
        System.out.print("Ortalamanız:" + ortalama);


        boolean result= ortalama>=60;
        String str = result ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.";
        System.out.print(str);
    }
}