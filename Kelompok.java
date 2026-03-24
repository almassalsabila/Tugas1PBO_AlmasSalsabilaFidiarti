public class Kelompok {
    private int idKelompok;
    private String namaKelompok;
    private String ketuaKelompok;
    private int jumlahAnggota;

    public Kelompok(int idKelompok, String namaKelompok, String ketuaKelompok, int jumlahAnggota) {
        this.idKelompok = idKelompok;
        this.namaKelompok = namaKelompok;
        this.ketuaKelompok = ketuaKelompok;
        this.jumlahAnggota = jumlahAnggota;
    }

    // Contoh transaksi sederhana: Biaya pendaftaran per anggota
    public double hitungBiayaPendaftaran() {
        double biayaPerAnggota = 15000; // Contoh biaya per orang
        return jumlahAnggota * biayaPerAnggota;
    }

    public int getIdKelompok() {
        return idKelompok;
    }

    public String getNamaKelompok() {
        return namaKelompok;
    }

    public String getKetuaKelompok() {
        return ketuaKelompok;
    }

    public int getJumlahAnggota() {
        return jumlahAnggota;
    }
}
