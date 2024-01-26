package ariefbelajardikampus.materialprodasar.uas.task2.service;

import ariefbelajardikampus.materialprodasar.uas.task2.util.Rumus;

import java.util.Scanner;

public class JajarGenjang {
    private static final Scanner scanner = new Scanner(System.in);

    public void tampilkan(){
        Rumus jajargenjang = new Rumus();
        System.out.print("Masukkan Alas Jajar Genjang : ");
        double alasjajargenjang = scanner.nextDouble();

        System.out.print("Masukkan Tinggi Jajar Genjang : ");
        double tinggijajargenjang = scanner.nextDouble();

        double luasJajarGenjang = jajargenjang.luasJajarGenjang(alasjajargenjang, tinggijajargenjang);
        System.out.println("Luas Jajar Genjang sesuai Input adalah " + luasJajarGenjang);
    }
}
