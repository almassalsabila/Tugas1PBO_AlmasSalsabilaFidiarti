public class Presentasi {
    private int idPresentasi;
    private String topik;
    private Kelompok kelompok;
    private JadwalPresentasi jadwal;
    private String status; // Status data: Terjadwal, Selesai, atau Batal

    public Presentasi(int idPresentasi, String topik, Kelompok kelompok, JadwalPresentasi jadwal) {
        this.idPresentasi = idPresentasi;
        this.topik = topik;
        this.kelompok = kelompok;
        this.jadwal = jadwal;
        this.status = "Terjadwal"; // Status awal
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public int getIdPresentasi() {
        return idPresentasi;
    }

    public Kelompok getKelompok() {
        return kelompok;
    }

    public void tampilPresentasi() {
        System.out.println("ID Presentasi: " + idPresentasi);
        System.out.println("Topik: " + topik);
        System.out.println("Kelompok: " + kelompok.getNamaKelompok() + " (ID: " + kelompok.getIdKelompok() + ")");
        System.out.println("Ketua: " + kelompok.getKetuaKelompok());
        System.out.println("Jumlah Anggota: " + kelompok.getJumlahAnggota());
        System.out.println("Jadwal: " + jadwal.getTanggal() + " " + jadwal.getJam());
        System.out.println("Ruangan: " + jadwal.getRuangan());
        System.out.println("Status: " + status);
    }
}
