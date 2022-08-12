package deneme;

import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        double matNot, fizNot, kimNot, turkNot, tarihNot, muzikNot;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        matNot= input.nextDouble();
        System.out.println(matNot);

        System.out.print("Fizik notunuzu giriniz:");
        fizNot= input.nextDouble();
        System.out.println(fizNot);

        System.out.print("Kimya notunuzu giriniz:");
        kimNot= input.nextDouble();
        System.out.println(kimNot);

        System.out.print("Turkce notunuzu giriniz:");
        turkNot= input.nextDouble();
        System.out.println(turkNot);

        System.out.print("Tarih notunuzu giriniz:");
        tarihNot= input.nextDouble();
        System.out.println(tarihNot);

        System.out.print("Muzik notunuzu giriniz:");
        muzikNot= input.nextDouble();
        System.out.println(muzikNot);

        double ortalama;
        ortalama=(matNot+fizNot+kimNot+turkNot+tarihNot+muzikNot)/ 6;
        System.out.println("Ortalamanız:" + ortalama + "\n");

        boolean sonuc = (ortalama > 60);
        String  str = sonuc ? "Sınıfı geçti" : "Sınıfta kaldı";

        System.out.println(str);




    }
}
