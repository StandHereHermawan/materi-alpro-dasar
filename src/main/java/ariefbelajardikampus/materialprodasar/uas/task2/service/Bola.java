package ariefbelajardikampus.materialprodasar.uas.task2.service;

import ariefbelajardikampus.materialprodasar.uas.task2.util.Rumus;

import java.util.Scanner;

public class Bola {
    private static final Scanner SCANNER = new Scanner(System.in);

    public void tampilkan(){
        Rumus bola = new Rumus();
        System.out.print("Masukkan Jari-jari Bola : ");
        double jariBola = SCANNER.nextDouble();

        double volumebola = bola.volumeBola(jariBola);
        System.out.println("Jari - Jari Bola adalah : " + jariBola);
        System.out.println("Volume Bola sesuai Input adalah " + volumebola);

    }
}
