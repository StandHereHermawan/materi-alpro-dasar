package ariefbelajardikampus.materialprodasar.materi.tugas.pertemuan9;

import java.util.Scanner;

import static java.lang.System.out;

public class ProgramMenghitungBangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int optionMenu;
        double panjang, lebar,
                luas, keliling,
                panjangDiagonal;

        while (true) {
            out.println("Menu program Menghitung Persegi Panjang");
            out.println("=======================");
            out.println("1. Menghitung Luas");
            out.println("2. Menghitung Keliling");
            out.println("3. Menghitung Panjang Diagonal");
            out.println("4. Keluar Program");
            out.print("Masukkan Input (1/2/3/4) : ");

            optionMenu = input.nextInt();

            out.println("Menu yang dipilih adalah " + optionMenu + "\n");

            if (optionMenu == 1) {
                out.print("Masukkan Panjang Persegi Panjang : ");
                panjang = input.nextDouble();
                out.print("\n");
                out.print("Masukkan Lebar Persegi Panjang : ");
                lebar = input.nextDouble();
                out.print("\n");

                luas = panjang * lebar;
                out.print("Luas Persegi Panjang Adalah : " + luas);
                out.println("\n");
            } else if (optionMenu == 2) {
                out.print("Masukkan Panjang Persegi Panjang : ");
                panjang = input.nextDouble();
                out.print("\n");
                out.print("Masukkan Lebar Persegi Panjang : ");
                lebar = input.nextDouble();
                out.println("\n");

                keliling = (panjang + lebar) * 2;
                out.print("Keliling Persegi Panjang adalah :" + keliling);
                out.println("\n");

            } else if (optionMenu == 3) {
                out.print("Masukkan Panjang Persegi Panjang : ");
                panjang = input.nextDouble();
                out.print("\n");
                out.print("Masukkan Lebar Persegi Panjang : ");
                lebar = input.nextDouble();
                out.println("\n");

                panjangDiagonal = Math.sqrt((((int) panjang) ^ 2) * ((int) lebar ^ 2));
                out.println("Panjang Diagonal Persegi Panjang adalah : " + panjangDiagonal);
                out.println("\n");
            } else if (optionMenu ==4) {
                out.println("Terimakasih.");
                break;
            } else {
                out.println("Mohon Maaf, Pilihan Menu tidak ada");
            }
        }
    }
}
