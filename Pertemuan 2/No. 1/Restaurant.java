package Pertemuan_2;

public class Restaurant {
    private final String[] nama_makanan;
    private final double[] harga_makanan;
    private final int[] stok;
    public static byte id = 0;
    
    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }
    
    public String getNama_Makanan(int id) {
        return this.nama_makanan[id];
    }
    
    public double getHarga_Makanan(int id) {
        return this.harga_makanan[id];
    }
    
    public int getStok(int id) {
        return this.stok[id];
    }

    public void setStok(int id, int stokBaru) {
        if (stokBaru >= 0) {
            this.stok[id] = stokBaru;
        } else {
            System.out.println("Error: Stok tidak mungkin bernilai negatif!");
        }
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }
    
    public void tampilMenuMakanan() {
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(
                    getNama_Makanan(i) + "[" + getStok(i) + "]" + "\tRp. " + getHarga_Makanan(i)
                );
            }
        }
    }
    
    public void pesanMenu(String namaPesanan, int jumlahPesanan) {
        for (int i = 0; i < id; i++) {
            if(namaPesanan.equalsIgnoreCase(getNama_Makanan(i))) {
                if(getStok(i) >= jumlahPesanan) {
                    int sisa = getStok(i) - jumlahPesanan;
                    setStok(i, sisa);
                    System.out.println("Pemesanan Berhasil!");
                } else {
                    System.out.println("Stok tidak mencukupi!");
                }
            
                return;
            }
        }
        System.out.println("Menu tidak ditemukan!");
    }

    public boolean isOutOfStock(int id) {
        return stok[id] == 0;
    }

    public static void nextId() {
        id++;
    }
}    