package ariefbelajardikampus.materialprodasar.materi.tugas.pertemuan9;

import java.util.Scanner;

import static java.lang.System.out;

public class ProgramKonversiWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        out.println("Program Konversi Detik ke Sisa Waktu");
        out.println("Hari");
        out.println("Jam");
        out.println("Menit");
        out.println("Detik");
        out.print("Masukkan angka : ");

        int inputSecond = input.nextInt();

        int leftSecond = 0;
        int leftDays = 0;
        int leftMinutes = 0;
        int second = 0;
        int leftHour = 0;

        leftSecond =
                inputSecond / 3600;
        leftDays =
                leftSecond / 24;
        leftHour =
                leftSecond % 24;
        leftMinutes =
                (inputSecond % 3600) / 60;
        second =
                (inputSecond % 3600) % 60;

        out.println("Format Waktu dari " + inputSecond + " detik");
        out.print("Adalah ");
        out.println(leftDays + " Hari, " + leftHour + " Jam, " + leftMinutes + " menit, " + second + " detik.");
    }
}
