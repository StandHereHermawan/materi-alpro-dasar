package ariefbelajardikampus.materialprodasar.uas.task3.service;

public class Lembur {
    public Long hitungBonus(Long gaji, Integer jam) {
        Long bonusGaji = gaji + (jam * (gaji * 1 / 100));
        return bonusGaji;
    }
}
