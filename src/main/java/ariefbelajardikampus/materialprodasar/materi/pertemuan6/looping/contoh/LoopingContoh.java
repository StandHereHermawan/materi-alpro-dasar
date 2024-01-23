package ariefbelajardikampus.materialprodasar.materi.pertemuan6.looping.contoh;

public class LoopingContoh {
    public static void main(String[] args) {
        int x = 10; /*
        while (x < 11) {
            System.out.println("urutan ke-" + x);
            if (x == 0){
            break;
            }
            x--;
        }

        Gabungan while-loop */
        int m = 0;
        while (m < 10){
            for (int i = 0; i < m; i++) {
                System.out.print("* ");
            }
            System.out.println();
            m++;
        }
    }
}
