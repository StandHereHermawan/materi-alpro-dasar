package ariefbelajardikampus.materialprodasar.materi.uts;

public class Task1 {

    public static void main(String[] args) {

        for (int baris = 0; baris < 5; baris++) {
            for (int kolom = 0; kolom < 5; kolom++) {

                if (baris == 0) {
                    if (kolom == 2) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }

                if (baris == 1) {
                    if (kolom == 1) {
                        System.out.print(" * ");
                    } else if (kolom == 2) {
                        System.out.print(" * ");
                    } else if (kolom == 3) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }

                if (baris == 2) {
                    System.out.print(" * ");
                }

                if (baris == 3) {
                    if (kolom == 1) {
                        System.out.print(" * ");
                    } else if (kolom == 2) {
                        System.out.print(" * ");
                    } else if (kolom == 3) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }

                if (baris == 4) {
                    if (kolom == 2) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }

                if (kolom == 4) {
                    System.out.println();
                }
            }
        }
    }
}
