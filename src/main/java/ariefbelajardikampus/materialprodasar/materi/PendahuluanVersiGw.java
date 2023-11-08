package ariefbelajardikampus.materialprodasar.materi;

import java.util.Scanner;

public class PendahuluanVersiGw {

    public static void main(String[] args) {
        /*
        TODO code application logic here

        Perkamusan Java */
        byte ukuran;
        int bulat = 245;
        int nilaiA;
        double desimal = 43.65;
        double nilaiB, Jumlah;
        String equalsBarrier, tampilanTeks;

        equalsBarrier = "=========================";
        tampilanTeks = "Program Penjumlahan Sederhana";

        Scanner in = new Scanner(System.in); // pemanggilan library Scanner

        // casting data type
        ukuran = (byte) desimal;    // casting
        System.out.println(ukuran);
        desimal = (double) bulat;   // casting
        System.out.println(desimal);

        // convert input
        System.out.println("\n" + tampilanTeks);
        System.out.println(equalsBarrier);
        System.out.print("Nilai A : ");
        nilaiA = in.nextInt();      // input dari keyboard Nilai A
        System.out.print("Nilai B : ");
        nilaiB = in.nextDouble();   // input dari keyboard Nilai B
        Jumlah = nilaiA + nilaiB;

        // eksekusi function
        System.out.println("Jumlah A + B = " + Jumlah);
    }
}