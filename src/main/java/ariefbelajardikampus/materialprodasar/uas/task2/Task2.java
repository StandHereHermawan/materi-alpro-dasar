package ariefbelajardikampus.materialprodasar.uas.task2;

import ariefbelajardikampus.materialprodasar.uas.task2.service.MainProgram;
import ariefbelajardikampus.materialprodasar.uas.task2.view.HeaderProgram;

public class Task2 {
    public static void main(String[] args) {
        boolean loopingProgram = true;
        while (loopingProgram) {
            HeaderProgram program = new HeaderProgram();
            Integer menu = program.tampilkan();

            MainProgram mainProgram = new MainProgram();
            loopingProgram = mainProgram.tampilkan(menu);
        }
    }
}
