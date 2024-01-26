package ariefbelajardikampus.materialprodasar.uas.task3.entity;

public class Employee {

    private String nama;

    private Long gaji;

    public Employee(String nama, Long gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Long getGaji() {
        return gaji;
    }

    public void setGaji(Long gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nama='" + nama + '\'' +
                ", gaji=" + gaji +
                '}';
    }
}
