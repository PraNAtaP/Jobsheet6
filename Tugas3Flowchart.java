import java.util.Scanner;

public class Tugas3Flowchart {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        
        int ukuran;
        String merk, kategori;
        int harga = 0;

        System.out.println("Masukkan merek sepatu:");
        merk = input19.nextLine();
        
        System.out.println("Masukkan kategori sepatu:");
        kategori = input19.nextLine();
        
        System.out.println("Masukkan ukuran sepatu:");
        ukuran = input19.nextInt();

        
        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                    }
                }
            }
            if (kategori.equalsIgnoreCase("High Top")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                    }
                }
            }
        }
        
        if (merk.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                    }
                }
            }
            if (kategori.equalsIgnoreCase("Man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                    }
                }
            }
        }
        
        if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                    }
                }
            }
            if (kategori.equalsIgnoreCase("Adult")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                    }
                }
            }
        }
        
        if (harga > 0) {
            System.out.println("Harganya adalah: Rp " + harga);
        } else {
            System.out.println("Gak dijual disini sam.");
        }
    }
}