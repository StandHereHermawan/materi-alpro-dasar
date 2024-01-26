package ariefbelajardikampus.materialprodasar.uas.task3;

import ariefbelajardikampus.materialprodasar.uas.task3.builder.EmployeeBuilder;
import ariefbelajardikampus.materialprodasar.uas.task3.builder.JamLemburBuilder;
import ariefbelajardikampus.materialprodasar.uas.task3.entity.Employee;
import ariefbelajardikampus.materialprodasar.uas.task3.entity.JamLembur;
import ariefbelajardikampus.materialprodasar.uas.task3.service.Lembur;
import ariefbelajardikampus.materialprodasar.uas.task3.view.HeaderProgram;
import ariefbelajardikampus.materialprodasar.uas.task3.view.Tampilkan;

public class Task3 {
    public static void main(String[] args) {
        HeaderProgram.output();
        Lembur lembur = new Lembur();

        JamLembur lemburanRahma = new JamLemburBuilder()
                .setJam(3)
                .build();
        Employee orang1 = new EmployeeBuilder()
                .setNama("Rahma M")
                .setGaji(3_000_000L)
                .build();
        JamLembur lemburanDinar = new JamLemburBuilder()
                .setJam(1)
                .build();
        Employee orang2 = new EmployeeBuilder()
                .setNama("Dinar")
                .setGaji(4_500_000L)
                .build();
        JamLembur lemburanTaufan = new JamLemburBuilder()
                .setJam(5)
                .build();
        Employee orang3 = new EmployeeBuilder()
                .setNama("Taufan Y")
                .setGaji(1_800_000L)
                .build();
        JamLembur lemburanMichael = new JamLemburBuilder()
                .setJam(0)
                .build();
        Employee orang4 = new EmployeeBuilder()
                .setNama("Michael R")
                .setGaji(2_500_000L)
                .build();

        String rahma = orang1.getNama();
        Long gajiRahma = orang1.getGaji();
        Integer rahmaJam = lemburanRahma.getJam();
        
        String dinar = orang2.getNama();
        Long gajiDinar = orang2.getGaji();
        Integer dinarJam = lemburanDinar.getJam();

        String taufan = orang3.getNama();
        Long gajiTaufan = orang3.getGaji();
        Integer taufanJam = lemburanTaufan.getJam();

        String michael = orang4.getNama();
        Long gajiMichael = orang4.getGaji();
        Integer michaelJam = lemburanMichael.getJam();

        Long bayaranRahma = lembur.hitungBonus(gajiRahma, rahmaJam);
        Long bayaranDinar = lembur.hitungBonus(gajiDinar, dinarJam);
        Long bayaranTaufan = lembur.hitungBonus(gajiTaufan, taufanJam);
        Long bayaranMichael = lembur.hitungBonus(gajiMichael, michaelJam);

        System.out.println("===========================================================");
        Tampilkan dataRahma = new Tampilkan();
        dataRahma.data(rahma, gajiRahma, rahmaJam, bayaranRahma);

        Tampilkan dataDinar = new Tampilkan();
        dataDinar.data(dinar, gajiDinar, dinarJam, bayaranDinar);

        Tampilkan dataTaufan = new Tampilkan();
        dataTaufan.data(taufan, gajiTaufan, taufanJam, bayaranTaufan);

        Tampilkan dataMichael = new Tampilkan();
        dataMichael.data(michael, gajiMichael, michaelJam, bayaranMichael);
        System.out.println("===========================================================");
        System.out.print("\n");

        System.out.println("========================================");
        System.out.print("Masukkan Nominal Gaji : ");
        long inputGaji = HeaderProgram.scanner.nextLong();
        System.out.print("Masukkan Nominal Jam Lembur : ");
        int inputJamLembur = HeaderProgram.scanner.nextInt();
        System.out.println("========================================");
        System.out.print("\n");

        Long gajiTotal = lembur.hitungBonus(inputGaji, inputJamLembur);

        System.out.println("========================================");
        System.out.println("Gaji Anda adalah : " + "Rp." + inputGaji);
        System.out.println("Jam lembur Anda adalah : " + inputJamLembur);
        System.out.println("Gaji Anda beserta bonus lembur adalah : " + "Rp." + gajiTotal);
        System.out.println("=======================================");
    }
}
