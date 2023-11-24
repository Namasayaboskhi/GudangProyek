public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.tipe_mesin = "Crossplane";
        System.out.println("Jenis mesin : " + motor1.tipe_mesin);
        motor1.tipe_motor = "Sport";
        System.out.println("Tipe motor : " + motor1.tipe_motor);
        motor1.brand_motor = "Yamaha";
        System.out.println("Brand motor : " + motor1.brand_motor);

        Mobil mobil1 = new Mobil();
        mobil1.jumlah_roda = "empat";
        System.out.println("Jumlah roda :" + mobil1.jumlah_roda);
        mobil1.jumlah_pintu = "dua";
        System.out.println("Jumlah pintu : " + mobil1.jumlah_pintu);
        mobil1.tahun_pembuatan = "2023";
        System.out.println("Tahun pembuatan : " + mobil1.tahun_pembuatan);

        pesawat pesawat1 = new pesawat();
        pesawat1.tipe_pesawat = "747";
        System.out.println("Tipe pesawat : " + pesawat1.tipe_pesawat);
        pesawat1.jadwal_penerbangan = "18.00 wita";
        System.out.println("Jadwal penerbagnan : " + pesawat1.jadwal_penerbangan);
    }
}
