package ariefbelajardikampus.materialprodasar.uas.task1;

import java.util.Scanner;

public class Task1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] string = new String[5];
        int index = 0;

        System.out.print("Masukkan Input Data Pertama : ");
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

        do {
            System.out.println("Data ke: " + index + " : " + string[index]);
            index = index + 1;
        }
        while (index != 5);
    }
}
