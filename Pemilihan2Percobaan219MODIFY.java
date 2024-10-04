import java.util.Scanner;

public class Pemilihan2Percobaan219MODIFY {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        int pilihanMenu, harga;
        double total_bayar, diskon;
        String member, pembayaran;

        System.out.println("-------------------------------------------");
        System.out.println("============= MENU KANTIN JTI =============");
        System.out.println("-------------------------------------------");
        System.out.println("1. Sego Campur");
        System.out.println("2. Jus Mangga");
        System.out.println("3. Paket Bundling (Sego Campur + Jus Mangga)");
        System.out.println("--------------------------------------------");
        System.out.print("Masukkan angka menu yang ingin dipilih: ");
        pilihanMenu = input19.nextInt();
        input19.nextLine();
        System.out.print("Apakah punya member?(y/n): ");
        member = input19.nextLine();
        System.out.print("Jenis pembayaran (cash/QRIS): ");
        pembayaran = input19.nextLine();
        System.out.println("--------------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga Sego Campur : " + harga);
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga Jus Mangga : " + harga);
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundle : " + harga);
            } else {
                System.out.println("Pilih menu yang benar!");
                return;
            }

            total_bayar = harga - (harga * diskon);
            if (pembayaran.equalsIgnoreCase("QRIS")) {
                total_bayar -= 1000;
                System.out.println("Potongan QRIS: Rp.1000");
            }
            System.out.println("Total Bayar setelah Diskon : " + total_bayar);
        } else if (member.equalsIgnoreCase("n")) {
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga Sego Bungkus : " + harga);
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga Jus Mangga : " + harga);
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundle : " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar!");
                return;
            }

            total_bayar = harga;
            if (pembayaran.equalsIgnoreCase("QRIS")) {
                total_bayar -= 1000;
                System.out.println("Potongan QRIS: Rp.1000");
            }
            System.out.println("Total bayar : " + total_bayar);
        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("-------------------------------------------");
    }
}
