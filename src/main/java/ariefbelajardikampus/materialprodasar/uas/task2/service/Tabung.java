package ariefbelajardikampus.materialprodasar.uas.task2.service;

import ariefbelajardikampus.materialprodasar.uas.task2.util.Rumus;

import java.util.Scanner;

public class Tabung {
    private static final Scanner scanner = new Scanner(System.in);

    public void tampilkan(){
        Rumus tabung = new Rumus();
        System.out.print("Masukkan Jari-jari Tabung : ");
        double jariTabung = scanner.nextDouble();

        System.out.print("Masukkan Tinggi Tabung : ");
        double tinggiTabung = scanner.nextDouble();

        double volumetabung = tabung.volumeTabung(jariTabung, tinggiTabung);
        System.out.println("Jari-jari Tabung sesuai Input adalah " + jariTabung);
        System.out.println("Tinggi Tabung sesuai Input adalah " + tinggiTabung);
        System.out.println("Volume Tabung sesuai Input adalah " + volumetabung);

    }
}
