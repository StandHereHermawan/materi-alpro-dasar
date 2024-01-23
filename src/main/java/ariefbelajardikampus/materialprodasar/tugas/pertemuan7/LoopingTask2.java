package ariefbelajardikampus.materialprodasar.tugas.pertemuan7;

public class LoopingTask2 {
    public static void main(String[] args) {
        for (int kolom = 0; kolom < 3; kolom++) {
            if (kolom == 2){
                System.out.print("*  ");
            } else if (kolom <= 2) {
                System.out.print("   ");
            }
        }
        System.out.println();

        for (int kolom = 0; kolom < 3; kolom++) {
            if (kolom >= 1){
                System.out.print("*  ");
            } else if (kolom < 2) {
                System.out.print("   ");
            }
        }
        System.out.println();

        for (int kolom = 0; kolom < 3; kolom++) {
            System.out.print("*  ");
        }
    }
}
