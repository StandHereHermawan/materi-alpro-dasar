package ariefbelajardikampus.materialprodasar.uas.task3.view;

public class Tampilkan {
    public void data(String name, Long gaji, Integer jam, Long bayaran){
        System.out.println("Gaji " + name + " adalah : " + "Rp." + gaji + " dan Telah Lembur " + jam + " Jam.");
        System.out.println("Gaji Total " + name + " dengan bonus lembur Adalah : " + "Rp." + bayaran);
    }
}
