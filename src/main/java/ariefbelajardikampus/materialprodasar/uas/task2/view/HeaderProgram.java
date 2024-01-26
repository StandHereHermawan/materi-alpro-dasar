package ariefbelajardikampus.materialprodasar.uas.task2.view;

import java.util.Scanner;

public class HeaderProgram {

    private static final Scanner scanner = new Scanner(System.in);

    public Integer tampilkan(){
        System.out.println("Program Menghitung");
        System.out.println("Pilih salah satu Menu");
        System.out.println("1. Menghitung Luas Jajar Genjang");
        System.out.println("2. Menghitung Volume Tabung");
        System.out.println("3. Menghitung Volume Bola");
        System.out.println("4. Keluar Program");
        System.out.print("Masukkan Menu : ");

        return scanner.nextInt();
    }
}
