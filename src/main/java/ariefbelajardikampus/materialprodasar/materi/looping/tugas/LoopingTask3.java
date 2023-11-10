package ariefbelajardikampus.materialprodasar.materi.looping.tugas;

public class LoopingTask3 {
    public static void main(String[] args) {
        for (int kolom = 0; kolom < 3; kolom++) {
            if (kolom == 2) {
                System.out.print("*   ");
            } else {
                System.out.print("-   ");
            }
        }
        System.out.println();

        for (int kolom = 0; kolom < 4; kolom++) {
            if (kolom == 0) {
                System.out.print("-   ");
            } else {
                System.out.print("*   ");
            }
        }
        System.out.println();

        for (int kolom = 0; kolom < 5; kolom++) {
                System.out.print("*   ");
            }
        System.out.println();

        for (int kolom = 0; kolom < 4; kolom++) {
            if (kolom == 0){
                System.out.print("-   ");
            }else {
                System.out.print("*   ");
            }
        }
        System.out.println();

        for (int kolom = 0; kolom < 3; kolom++) {
            if (kolom == 2){
                System.out.print("*   ");
            } else {
                System.out.print("-   ");
            }
        }
    }
}
