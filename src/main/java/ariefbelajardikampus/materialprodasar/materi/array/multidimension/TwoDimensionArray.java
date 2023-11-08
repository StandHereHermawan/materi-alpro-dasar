package ariefbelajardikampus.materialprodasar.materi.array.multidimension;

public class TwoDimensionArray {
    /*
    Demonstrate a two-dimensional array */
    public static void main(String[] args) {

        int pairArrays[][] = new int[4][5];
        int k = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                pairArrays[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(pairArrays[i][j] + " ");
            }
            System.out.println();
        }
    }
}
