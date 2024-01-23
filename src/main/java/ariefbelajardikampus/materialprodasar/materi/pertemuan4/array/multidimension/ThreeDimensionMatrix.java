package ariefbelajardikampus.materialprodasar.materi.pertemuan4.array.multidimension;

public class ThreeDimensionMatrix {
    public static void main(String[] args) {
        int threeDMatrix[][][] = new int[3][4][5];
        int i, j, k;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    threeDMatrix[i][j][k] = i * j * k;
                }
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    System.out.print(threeDMatrix[i][j][k] + " " + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
