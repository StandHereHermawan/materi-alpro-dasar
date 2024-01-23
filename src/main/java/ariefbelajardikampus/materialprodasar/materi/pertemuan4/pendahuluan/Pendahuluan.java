package ariefbelajardikampus.materialprodasar.materi.pertemuan4.pendahuluan;

import java.util.Scanner;

public class Pendahuluan {
    public static void main(String[] args) {
        // TODO code application logic here
        byte a;
        int i = 245;
        double m = 43.65;
        int A;
        double B, Jumlah;
        Scanner in = new Scanner(System.in); //pemanggilan library Scanner
        // casting
        a = (byte) m;
        System.out.println(a);
        m = (double) i;
        System.out.println(m);
        // convert input
        System.out.print("Nilai A : ");
        A = in.nextInt();
        System.out.print("Nilai B : ");
        B = in.nextDouble();
        Jumlah = A + B;
        //eksekusi function
        System.out.println("Jumlah A + B = " + Jumlah);
    }
}
