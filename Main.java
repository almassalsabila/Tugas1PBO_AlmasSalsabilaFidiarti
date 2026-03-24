import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Presentasi> daftarPresentasi = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n=== SISTEM JADWAL PRESENTASI KELOMPOK ===");
            System.out.println("1. Tambah Data Presentasi");
            System.out.println("2. Tampilkan Semua Data Presentasi");
            System.out.println("3. Ubah Status Presentasi");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    int jenis;

                do {
                    System.out.println("\nPilih Jenis Presentasi:");
                    System.out.println("1. Presentasi Offline (Tatap Muka)");
                    System.out.println("2. Presentasi Online (Daring)");
                    System.out.print("Pilihan: ");

                    jenis = input.nextInt();
                    input.nextLine();

                    if (jenis != 1 && jenis != 2) {
                    System.out.println("Pilihan tidak valid! Silakan pilih 1 atau 2.");
                }

                    } while (jenis != 1 && jenis != 2);

                    int idKel;

                    System.out.print("ID Kelompok: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Input harus berupa angka!");
                        System.out.print("ID Kelompok: ");
                        input.next(); 
                    }
                    idKel = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama Kelompok: ");
                    String namaKel = input.nextLine();

                    System.out.print("Ketua Kelompok: ");
                    String ketua = input.nextLine();

                    int jumlah;

                    System.out.print("Jumlah Anggota: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Input harus berupa angka!");
                        System.out.print("Jumlah Anggota: ");
                        input.next();
                    }
                    jumlah = input.nextInt();
                    input.nextLine();
                    Kelompok kelompok = new Kelompok(idKel, namaKel, ketua, jumlah);

                    System.out.print("ID Presentasi: ");
                    int idPres = input.nextInt();
                    input.nextLine();
                    System.out.print("Topik Presentasi: ");
                    String topik = input.nextLine();
                    System.out.print("Tanggal Presentasi: ");
                    String tanggal = input.nextLine();
                    System.out.print("Jam Presentasi: ");
                    String jam = input.nextLine();
                    System.out.print("Ruangan: ");
                    String ruangan = input.nextLine();

                    JadwalPresentasi jadwal = new JadwalPresentasi(tanggal, jam, ruangan);

                    if (jenis == 2) {
                        // Fitur Inheritance: Membuat objek dari kelas turunan
                        System.out.print("Platform : ");
                        String platform = input.nextLine();
                        System.out.print("Link Meeting: ");
                        String link = input.nextLine();
                        
                        Presentasi pOnline = new PresentasiOnline(idPres, topik, kelompok, jadwal, link, platform);
                        daftarPresentasi.add(pOnline);
                    } else {
                        // Membuat objek dari kelas induk
                        Presentasi pOffline = new Presentasi(idPres, topik, kelompok, jadwal);
                        daftarPresentasi.add(pOffline);
                    }

                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    if (daftarPresentasi.isEmpty()) {
                        System.out.println("Belum ada data presentasi.");
                    } else {
                        for (Presentasi pr : daftarPresentasi) {
                            System.out.println("----------------------------");
                            // Polymorphism: Memanggil method tampilPresentasi yang sudah di-override
                            pr.tampilPresentasi();
                        }
                    }
                    break;

                case 3:
                    if (daftarPresentasi.isEmpty()) {
                        System.out.println("Belum ada data presentasi.");
                    } else {
                        System.out.print("Masukkan ID Presentasi yang akan diubah statusnya: ");
                        int cariId = input.nextInt();
                        input.nextLine();
                        
                        boolean ditemukan = false;
                        for (Presentasi pr : daftarPresentasi) {
                            if (pr.getIdPresentasi() == cariId) {
                                System.out.println("Status saat ini: " + pr.getStatus());
                                System.out.println("Pilih Status Baru: 1. Terjadwal, 2. Selesai, 3. Batal");
                                int pilStatus = input.nextInt();
                                input.nextLine();
                                
                                if (pilStatus == 1) pr.setStatus("Terjadwal");
                                else if (pilStatus == 2) pr.setStatus("Selesai");
                                else if (pilStatus == 3) pr.setStatus("Batal");
                                else System.out.println("Pilihan tidak valid.");
                                
                                System.out.println("Status berhasil diubah!");
                                ditemukan = true;
                                break;
                            }
                        }
                        if (!ditemukan) System.out.println("ID Presentasi tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 5);

        input.close();
    }
}
