package ariefbelajardikampus.materialprodasar.uas.task2.util;

public class Rumus {
    public double luasJajarGenjang(double alas, double tinggi) {
        double luas;
        luas = alas * tinggi;
        return luas;
    }

    public double volumeTabung(double jari, double tinggi) {
        double volumeTabung;
        volumeTabung = 2 * Math.PI * Math.pow(jari, 2) * tinggi;
        return volumeTabung;
    }

    public double volumeBola(double jari) {
        double volumeBola;
        volumeBola = 4 * Math.PI * Math.pow(jari, 2);
        return volumeBola;
    }
}
