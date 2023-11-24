public class Mobil extends Kendaraan {
    String jumlah_roda;
    String jumlah_pintu;
    String tahun_pembuatan;

    @Override
    public void roda() {
        System.out.println("Jumlah roda ada empat");
    }
}
