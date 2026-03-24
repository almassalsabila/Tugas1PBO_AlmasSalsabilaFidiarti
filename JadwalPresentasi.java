public class JadwalPresentasi {
    private String tanggal;
    private String jam;
    private String ruangan;

    public JadwalPresentasi(String tanggal, String jam, String ruangan) {
        this.tanggal = tanggal;
        this.jam = jam;
        this.ruangan = ruangan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getJam() {
        return jam;
    }

    public String getRuangan() {
        return ruangan;
    }
}
