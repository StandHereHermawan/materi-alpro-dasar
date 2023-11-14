package ariefbelajardikampus.materialprodasar.materi.uts;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {        /*
        Util Scanner Object For Keyboard Input      */
        Scanner scanner = new Scanner(System.in);   /*

        Datatype Dictionary                                  */
        String leftAlignFormat, bodyTableDummy, borderTableFormat1,
                borderTableFormat2, programUTS, leftAlignFormat1,
                nameInput;                                                      /*

        Dummy Table                                                             */
        borderTableFormat1 = "+ - - - - - - - - - - - - - - - + - - - - +%n";
        bodyTableDummy = "|                               |         |%n";       /*

        Used Table and Row Formatting                                           */
        borderTableFormat2 = "+ - - - - - - - - + - - - - +%n";
        leftAlignFormat = "| %-15s | %-7s | %n";
        leftAlignFormat1 = "| %-15s | %-7d | %n"; /*

        Reusable String Variable */
        programUTS = "Program UTS";
        nameInput = "Masukkan Nama : ";

        System.out.printf(borderTableFormat1);
        System.out.printf(bodyTableDummy);
        System.out.printf(borderTableFormat1);
        System.out.println();

        System.out.println(programUTS);
        System.out.print(nameInput);                    /*

        Input from Keyboard with String Datatyoe        */
        String inputString = scanner.nextLine();
        System.out.println("Nama adalah : " + inputString);
        System.out.println();

        System.out.printf(borderTableFormat2);
        System.out.printf(leftAlignFormat, "Nama", "Gaji");
        System.out.printf(borderTableFormat2);

        for (int i = 0; i < 3; i++) {
            System.out.printf(leftAlignFormat1, "some sample " + i, i * i);
        }
        System.out.printf(borderTableFormat2);
    }
}
