package ariefbelajardikampus.materialprodasar.tugas.pertemuan9;

import static java.lang.System.out;

public class NilaiRataRata {
    public static void main(String[] args) {
        int[] nilai = {8, 9, 13, 14, 16, 33, 44, 55, 66};

        int sum = 0;
        for (int totalNilaiArray : nilai) {
            sum = sum + totalNilaiArray;
        }

        double rataRata = (double) sum / nilai.length;
        out.println("Nilai Rata-Rata adalah : " + rataRata);
    }
}
