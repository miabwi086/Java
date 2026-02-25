package Pertemuan_2;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant(); 
        
        menu.tambahMenuMakanan("Pizza", 250000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Spaghetti", 80000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Chicken Steak", 45000, 30);
        
        System.out.println("========== Daftar Menu ==========");
        menu.tampilMenuMakanan();

        System.out.println("\n---------- Simulasi Pemesanan ----------");
        menu.pesanMenu("Spaghetti", 3);
        
        System.out.println("\n========== Menu Setelah Pesanan ==========");
        menu.tampilMenuMakanan();
    }
}