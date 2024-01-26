package ariefbelajardikampus.materialprodasar.uas.task2.service;

public class MainProgram {

    public boolean tampilkan(Integer menu) {
        switch (menu) {
            case 1:
                JajarGenjang jajarGenjang = new JajarGenjang();
                jajarGenjang.tampilkan();
                break;
            case 2:
                Tabung tabung = new Tabung();
                tabung.tampilkan();
                break;
            case 3:
                Bola bola = new Bola();
                bola.tampilkan();
                break;
            case 4:
                System.out.println("Program Berakhir");
                return false;
            default:
                System.out.println("Maaf Program Yang anda pilih tidak ada");
        }
        return true;
    }
}
