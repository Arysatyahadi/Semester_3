package Pertemuan_3;


import java.util.ArrayList;
import java.util.Scanner;

public class UTAMA {

        private String username = "Utama";
        private String password = "121212";
        private ArrayList<String> dataTiket = new ArrayList<String>();

        public UTAMA() {
            System.out.println("Proses login...");
        }

        public boolean login(String username, String password) {
            if (this.username.equals(username) && this.password.equals(password)) {
                System.out.println("Login berhasil");
                return true;
            } else {
                return false;
            }
        }

        public void inputDataTransaksi() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukkan data transaksi:");
            System.out.print("Nama hotel: ");
            String namaHotel = scanner.nextLine();
            System.out.print("Jumlah kamar: ");
            int jumlahKamar = scanner.nextInt();
            System.out.print("Harga kamar: ");
            int hargaKamar = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nama pesawat: ");
            String namaPesawat = scanner.nextLine();
            System.out.print("Jumlah penumpang: ");
            int jumlahPenumpang = scanner.nextInt();
            System.out.print("Harga tiket: ");
            int hargaTiket = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Tujuan: ");
            String tujuan = scanner.nextLine();

            String data = "Hotel: " + namaHotel + ", Jumlah kamar: " + jumlahKamar + ", Harga kamar: " + hargaKamar + " | " +
                    "Pesawat: " + namaPesawat + ", Jumlah penumpang: " + jumlahPenumpang + ", Harga tiket: " + hargaTiket + ", Tujuan: " + tujuan;
            dataTiket.add(data);
            System.out.println("Data transaksi berhasil ditambahkan");
        }

        public void lihatDataTiket() {
            System.out.println("Data Tiket:");
            for (String data : dataTiket) {
                System.out.println(data);
            }
        }
    }


