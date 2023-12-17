package ariefbelajardikampus.materialprodasar.materi.tugas.pertemuan11;

public class TugasProcedur {
    /**
     * @param //args the command line arguments
     */

    //procedur makan
    void makan(String makanan){
        System.out.println("Hi!");
        System.out.println("Saya sedang makan " + makanan);
    }

    // fungsi static
    static void minum(String minuman){
        System.out.println("Saya sedang minum " + minuman);
    }

    // fungsi main
    public static void main(String[] args) {
        // pemanggilan fungsi static
        minum("Kopi");

        /*
        makan("pisang goreng");
        // method diatas jika di buka maka akan terjadi error
        */

        TugasProcedur procedur = new TugasProcedur();
        procedur.makan("Pisang Goreng");

        // mambuat instansiasi objek saya dari class FungsiStatic
        TugasProcedur saya = new TugasProcedur();

        // pemanggilan fungsi non-static
        saya.makan("Nasi Goreng");

        saya.minum("Jus Jeruk");
        // pemanggilan dapat menggunakan teknik ini

        /*
        * Fungsi Procedural :
        * 1. fungsi tanpa return value dengan static keyword
        * 2. fungsi tanpa return value tanpa static keyword
        *
        * Tugas
        * 1. kenapa point 1 di jalankan terjadi error?
        * Jawab :   dikarenakan method bukan method static. karena main method java itu static, agar function
        *           bisa dijalankan setelah diimport tanpa deklarasi, butuh keyword static.
        *
        *
        * 2. pemanggilan prosedur ada 2 teknik, sebutkan dan jelaskan!
        * Jawab :
        * 1. Method menggunakan kata kunci static dan dideklarasikan langsung nama methodnya tanpa menyebutkan class-nya.
        * 2. Method tanpa menggunakan kata kunci static agar bisa dieksekusi methodnya
        *       butuh di deklarasikan dahulu classnya dan dimasukkan kedalam variable
        *
        */
    }
}
