package ariefbelajardikampus.materialprodasar.uas.task2;

import java.util.Scanner;

public class Task2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loopingProgram = true;
        while (loopingProgram) {
            System.out.println("Program Menghitung");
            System.out.println("Pilih salah satu Menu");
            System.out.println("1. Menghitung Luas Jajar Genjang");
            System.out.println("2. Menghitung Volume Tabung");
            System.out.println("3. Menghitung Volume Bola");
            System.out.println("4. Keluar Program");
            System.out.print("Masukkan Menu : ");

            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    Rumus jajargenjang = new Rumus();
                    System.out.print("Masukkan Alas Jajar Genjang : ");
                    double alasjajargenjang = scanner.nextDouble();

                    System.out.print("Masukkan Tinggi Jajar Genjang : ");
                    double tinggijajargenjang = scanner.nextDouble();

                    double luasJajarGenjang = jajargenjang.luasJajarGenjang(alasjajargenjang, tinggijajargenjang);
                    System.out.println("Luas Jajar Genjang sesuai Input adalah " + luasJajarGenjang);
                    break;
                case 2:
                    Rumus tabung = new Rumus();
                    System.out.print("Masukkan Jari-jari Tabung : ");
                    double jariTabung = scanner.nextDouble();

                    System.out.print("Masukkan Tinggi Tabung : ");
                    double tinggiTabung = scanner.nextDouble();

                    double volumetabung = tabung.volumeTabung(jariTabung, tinggiTabung);
                    System.out.println("Jari-jari Tabung sesuai Input adalah " + jariTabung);
                    System.out.println("Tinggi Tabung sesuai Input adalah " + tinggiTabung);
                    System.out.println("Volume Tabung sesuai Input adalah " + volumetabung);
                    break;
                case 3:
                    Rumus bola = new Rumus();
                    System.out.print("Masukkan Jari-jari Bola : ");
                    double jariBola = scanner.nextDouble();

                    double volumebola = bola.volumeBola(jariBola);
                    System.out.println("Jari - Jari Bola adalah : " + jariBola);
                    System.out.println("Volume Bola sesuai Input adalah " + volumebola);
                    break;
                case 4:
                    loopingProgram = false;
                    System.out.println("Program Berakhir");
                    break;
                default:
                    System.out.println("Maaf Program Yang anda pilih tidak ada");
            }
        }
    }

    public static class Rumus {
        public double luasJajarGenjang(double alas, double tinggi) {
            double luas = 0;
            luas = alas * tinggi;
            return luas;
        }

        public double volumeTabung(double jari, double tinggi) {
            double volumeTabung = 0;
            volumeTabung = 2 * Math.PI * Math.pow(jari, 2) * tinggi;
            return volumeTabung;
        }

        public double volumeBola(double jari) {
            double volumeBola = 0;
            volumeBola = 4 * Math.PI * Math.pow(jari, 2);
            return volumeBola;
        }
    }
}
