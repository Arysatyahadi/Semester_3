package Pertemuan_3;

public class Member {

    private String namaPembeli, alamat, namaBarang, noTelp;
    private int usia, jumlah, total, poin, harga;

    // Constructor untuk member
    public Member(String nama, String alamat, int usia, String telp, int poin) {
        this.namaPembeli = nama;
        this.alamat = alamat;
        this.usia = usia;
        this.noTelp = telp;
        this.poin = poin;
    }

    // Constructor untuk non member (transaksi)
    public Member(String namaBarang, int jml, int harga) {
        this.namaBarang = namaBarang;
        this.jumlah = jml;
        this.harga = harga;
    }

    // Getter untuk nama pembeli
    public String getNamaPembeli() {
        return this.namaPembeli;
    }

    // Getter untuk alamat
    public String getAlamat() {
        return this.alamat;
    }

    // Getter untuk nomor telepon
    public String getNoTelp() {
        return this.noTelp;
    }

    // Getter untuk nama barang
    public String getNamaBarang() {
        return this.namaBarang;
    }

    // Getter untuk jumlah barang
    public int getJumlah() {
        return this.jumlah;
    }

    // Getter untuk harga barang per item
    public int getHarga() {
        return this.harga;
    }

    // Menghitung total harga
    public int getTotal() {
        return getHarga() * getJumlah();
    }

    // Mendapatkan poin member berdasarkan total belanja
    public int getMemberPoin() {
        poin = 0;
        if (getTotal() >= 50000) {
            poin = 10;
        } else if (getTotal() >= 100000) {
            poin = 20;
        }
        return poin;
    }
}
