public class PresentasiOnline extends Presentasi {
    private String linkMeeting;
    private String platform; // Contoh: Zoom, Google Meet

    public PresentasiOnline(int idPresentasi, String topik, Kelompok kelompok, JadwalPresentasi jadwal, String linkMeeting, String platform) {
        // Memanggil constructor kelas induk (Presentasi)
        super(idPresentasi, topik, kelompok, jadwal);
        this.linkMeeting = linkMeeting;
        this.platform = platform;
    }

    // Override method tampilPresentasi untuk menambahkan informasi online
    @Override
    public void tampilPresentasi() {
        super.tampilPresentasi(); // Memanggil method dari kelas induk
        System.out.println("Platform: " + platform);
        System.out.println("Link Meeting: " + linkMeeting);
    }
}
