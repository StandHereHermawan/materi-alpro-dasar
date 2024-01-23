package ariefbelajardikampus.materialprodasar.uts;

import java.util.Scanner;

import static java.lang.System.out;

public class Task2 {
    public static void main(String[] args) {

//      Util Scanner Object For Keyboard Input
        Scanner scanner = new Scanner(System.in);

//      Datatype Dictionary
        String  leftAlignFormat,
                bodyTableDummy,
                borderTableFormat1,
                borderTableFormat2,
                borderTableFormat3,
                borderTableFormat4,
                programUTS,
                nameInput,
                leftAlignFormat1,
                leftAlignFormat2,
                leftAlignFormat3,
                leftAlignFormat4,
                leftAlignFormat5,
                tinggi,
                sedang,
                rendah;

        int     gajiRahma,
                gajiDinar,
                gajiMichael,
                gajiTaufan;

        gajiRahma = 3_000_000;
        gajiDinar = 4_500_000;
        gajiTaufan = 1_800_000;
        gajiMichael = 2_500_000;

//      Column and Row Formatting
        leftAlignFormat2
                = "|  %-2d | %-9s | %-7d | %-13s | %n";
        leftAlignFormat3
                = "| %-2s | %-9s | %-7s | %-13s | %n";
        leftAlignFormat4
                = "| %-2s | %-9s | %-7s | %n";
        leftAlignFormat5
                = "|  %-2d | %-9s | %-7d | %n";
        borderTableFormat3
                = "+ - - + - - - - - + - - - - + - - - - - - - +%n";
        borderTableFormat4
                = "+ - - + - - - - - + - - - - +%n";

//      Reusable String Variable
        programUTS = "Program UTS";
        tinggi = "Tinggi";
        sedang = "Sedang";
        rendah = "Rendah";
        String orang1 = "Rahma M";
        String orang2 = "Dinar";
        String orang3 = "Taufan Y";
        String orang4 = "Michael R";


//      Program Awal
        while (true) {
            out.println(programUTS);
            out.println("Menu");
            out.println("1. Tampilkan Semua Data Tanpa Jenis Gaji");
            out.println("2. Pilih Dan Tampilkan Jenis Gaji Satu Data");
            out.println("3. Pilih Dan Tampilkan Jenis Gaji semua Data");
            out.println("4. Keluar Dari Program");
            out.println();
            out.print("Input Angka Sesuai Menu : ");

            int inputMainMenu = scanner.nextInt();
            if (inputMainMenu == 1) {

                out.printf(borderTableFormat4);
                out.printf(leftAlignFormat4, "No.", "  " + "Nama", " " + "Gaji");
                out.printf(borderTableFormat4);
                out.printf(leftAlignFormat5, 1, orang1, gajiRahma);
                out.printf(leftAlignFormat5, 2, orang2, gajiDinar);
                out.printf(leftAlignFormat5, 3, orang3, gajiTaufan);
                out.printf(leftAlignFormat5, 4, orang4, gajiMichael);
                out.printf(borderTableFormat4);
                out.println();

            } else if (inputMainMenu == 3) {

                out.println();
                out.printf(borderTableFormat3);
                out.printf(leftAlignFormat3, "No.", "  " + "Nama", " " + "Gaji", " " + "Jenis Gaji");
                out.printf(borderTableFormat3);
                out.printf(leftAlignFormat2, 1, orang1, gajiRahma, sedang);
                out.printf(leftAlignFormat2, 2, orang2, gajiDinar, tinggi);
                out.printf(leftAlignFormat2, 3, orang3, gajiTaufan, rendah);
                out.printf(leftAlignFormat2, 4, orang4, gajiMichael, sedang);
                out.printf(borderTableFormat3);
                out.println();

            } else if (inputMainMenu == 2) {

                out.printf(borderTableFormat4);
                out.printf(leftAlignFormat4, "No.", "  " + "Nama", " " + "Gaji");
                out.printf(borderTableFormat4);
                out.printf(leftAlignFormat5, 1, orang1, gajiRahma);
                out.printf(leftAlignFormat5, 2, orang2, gajiDinar);
                out.printf(leftAlignFormat5, 3, orang3, gajiTaufan);
                out.printf(leftAlignFormat5, 4, orang4, gajiMichael);
                out.printf(borderTableFormat4);
                out.println();
                out.print("Masukkan Nomor Yang Hendak Dilihat Jenis Gaji-nya : ");

                int inputMenu = scanner.nextInt();

                if (inputMenu == 1) {

                    out.println();
                    out.printf(borderTableFormat3);
                    out.printf(leftAlignFormat3, "No.", "  " + "Nama", " " + "Gaji", " " + "Jenis Gaji");
                    out.printf(borderTableFormat3);
                    out.printf(leftAlignFormat2, 1, orang1, gajiRahma, sedang);
                    out.printf(borderTableFormat3);
                    out.println();

                } else if (inputMenu == 2) {

                    out.println();
                    out.printf(borderTableFormat3);
                    out.printf(leftAlignFormat3, "No.", "  " + "Nama", " " + "Gaji", " " + "Jenis Gaji");
                    out.printf(borderTableFormat3);
                    out.printf(leftAlignFormat2, 2, orang2, gajiDinar, tinggi);
                    out.printf(borderTableFormat3);
                    out.println();

                } else if (inputMenu == 3) {

                    out.printf(borderTableFormat3);
                    out.printf(leftAlignFormat3, "No.", "  " + "Nama", " " + "Gaji", " " + "Jenis Gaji");
                    out.printf(borderTableFormat3);
                    out.printf(leftAlignFormat2, 3, orang3, gajiTaufan, rendah);
                    out.printf(borderTableFormat3);
                    out.println();

                } else if (inputMenu == 4) {

                    out.printf(borderTableFormat3);
                    out.printf(leftAlignFormat3, "No.", "  " + "Nama", " " + "Gaji", " " + "Jenis Gaji");
                    out.printf(borderTableFormat3);
                    out.printf(leftAlignFormat2, 4, orang4, gajiMichael, sedang);
                    out.printf(borderTableFormat3);
                    out.println();

                } else {
                    out.println("Pilihan Tidak Ada Dalam menu.");
                }

            } else if (inputMainMenu == 4) {
                out.println("Program Berakhir");
                break;
            } else {
                out.println("Pilihan Tidak Ada Dalam menu.");
            }

            if (inputMainMenu == 4) {
                out.println("Program Berakhir");
                break;
            }

            out.println("Program Berulang\n");
        }

//      out.printf(borderTableFormat2);
//      out.printf(leftAlignFormat, "Nama", "Gaji");
//      out.printf(borderTableFormat2);

//      for (int i = 0; i < 3; i++) {
//          System.out.printf(leftAlignFormat1, "some sample " + i, i * i);
//      }

//      out.printf(borderTableFormat2);

//      Dummy Table
        borderTableFormat1
                = "+ - - - - - - - - - - - - - - - + - - - - +%n";
        bodyTableDummy
                = "|                               |         |%n";
        leftAlignFormat
                = "| %-15s | %-7s | %n";
        leftAlignFormat1
                = "| %-15s | %-7d | %n";
        borderTableFormat2
                = "+ - - - - - - - - + - - - - +%n";

//      nameInput = "Masukkan Nama : ";

//      out.println(programUTS);
//      out.println("Menu");
//      out.println("1. Tampilkan Semua Data Tanpa Jenis Gaji");
//      out.println("2. Pilih Dan Tampilkan Jenis Gaji Satu Data");
//      out.println("3. Pilih Dan Tampilkan Jenis Gaji semua Data");
//      out.println();

//      out.print("Input Angka Sesuai Menu : ");
//      int inputMainMenu = scanner.nextInt();
//      out.println();
//
//      out.println("pilihan yang dipilih : " + inputMainMenu);

//      System.out.printf(borderTableFormat1);
//      System.out.printf(bodyTableDummy);
//      System.out.printf(borderTableFormat1);
//      System.out.println();
    }
}
