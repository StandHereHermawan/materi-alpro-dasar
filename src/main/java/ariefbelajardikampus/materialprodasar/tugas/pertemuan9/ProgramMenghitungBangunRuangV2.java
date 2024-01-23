package ariefbelajardikampus.materialprodasar.tugas.pertemuan9;

import java.util.Scanner;

import static java.lang.System.out;

public class ProgramMenghitungBangunRuangV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int optionMenu, panjang, lebar;
        double luas, keliling,
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

            if (optionMenu == 4) {
                out.println("Terimakasih.");
                break;
            }

            out.print("Masukkan Panjang Persegi Panjang : ");
            panjang = input.nextInt();
            out.print("Masukkan Lebar Persegi Panjang : ");
            lebar = input.nextInt();
            out.print("\n");

            switch (optionMenu) {
                case 1:
                    luas = panjang * lebar;
                    out.print("Luas Persegi Panjang Adalah : " + luas);
                    out.println("\n");
                    break;
                case 2:
                    keliling = (panjang + lebar) * 2;
                    out.print("Keliling Persegi Panjang adalah :" + keliling);
                    out.println("\n");
                    break;
                case 3:
                    double pangkatPanjang = Math.pow(panjang,2);
                    double pangkatLebar = Math.pow(lebar,2);
                    panjangDiagonal = Math.sqrt(pangkatPanjang * pangkatLebar);
                    out.print("Panjang Diagonal Persegi Panjang adalah : " + panjangDiagonal);
                    out.println("\n");
                    break;
                default:
                    out.println("Mohon Maaf, Pilihan Menu tidak ada");
            }
        }
    }
}
