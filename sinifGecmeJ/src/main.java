
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int matematik, turkce, fizik, kimya, muzik;
        int a;
        a = 55;
        Scanner inp = new Scanner(System.in);


        System.out.println("Matematik notunuz: ");
        matematik = inp.nextInt();
        int matnot = (matematik <= 100 && matematik >= 0) ? matematik : 0;
        System.out.println("Türkçe notunuz: ");
        turkce = inp.nextInt();
        int turkcenot = (turkce <= 100 && turkce >= 0) ? turkce : 0;
        System.out.println("Fizik notunuz: ");
        fizik = inp.nextInt();
        int fiziknot = (fizik <= 100 && fizik >= 0) ? fizik : 0;
        System.out.println("Kimya notunuz: ");
        kimya = inp.nextInt();
        int kimyanot = (kimya <= 100 && kimya >= 0) ? kimya : 0;
        System.out.println("Müzik notunuz: ");
        muzik = inp.nextInt();
        int muziknot = (muzik <= 100 && muzik >= 0) ? muzik : 0;
        double ort = (matnot + turkcenot + fiziknot + kimyanot + muziknot);
        System.out.println(ort / 5);
        if (a > ort) {
            System.out.println("Sınıfta Kaldınız");
        } else {
            System.out.println("Sınıfı geçtiniz");

        }

    }
}
