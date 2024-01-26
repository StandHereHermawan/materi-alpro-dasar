package ariefbelajardikampus.materialprodasar.uas.task3.builder;

import ariefbelajardikampus.materialprodasar.uas.task3.entity.Employee;

public class EmployeeBuilder {

    private String nama;

    private Long gaji;

    public EmployeeBuilder setNama(String nama) {
        this.nama = nama;
        return this;
    }

    public EmployeeBuilder setGaji(Long gaji) {
        this.gaji = gaji;
        return this;
    }

    public Employee build() {
        return new Employee(nama, gaji);
    }
}
