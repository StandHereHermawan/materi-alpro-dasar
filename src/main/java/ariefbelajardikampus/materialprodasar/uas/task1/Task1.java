package ariefbelajardikampus.materialprodasar.uas.task1;

import java.util.Scanner;

public class Task1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] string = new String[6];
        int indexQuery = 1;
        int indexInput = 1;

        while (indexInput != 6){
            System.out.print("Masukkan Input Data ke "+indexInput+" : ");
            String inputData = scanner.next();
            string[indexInput] = inputData;
            indexInput = indexInput + 1;
        }

        System.out.print("\n");

        do {
            System.out.println("Data ke: " + indexQuery + " : " + string[indexQuery]);
            indexQuery = indexQuery + 1;
        }
        while (indexQuery != 6);
    }
        /*
        String data1 = scanner.next();
        string[0] = data1.toString();

        System.out.print("Masukkan Input Data Kedua : ");
        String data2 = scanner.next();
        string[1] = data2.toString();

        System.out.print("Masukkan Input Data Ketiga : ");
        String data3 = scanner.next();
        string[2] = data3.toString();

        System.out.print("Masukkan Input Data Keempat : ");
        String data4 = scanner.next();
        string[3] = data4.toString();

        System.out.print("Masukkan Input Data Kelima : ");
        String data5 = scanner.next();
        string[4] = data5.toString();
        */
}
