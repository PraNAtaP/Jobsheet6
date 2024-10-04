import java.util.Scanner;

public class Tugas2Flowchart {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        double totalHargaSebelumDiskon, totalDiskon, totalHargaSetelahDiskon;
        double hargaPerBuku, diskon;
        String jenisBuku;
        int jumlahBuku;

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = input19.nextLine().toLowerCase();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = input19.nextInt();
        System.out.print("Masukkan harga per buku: ");
        hargaPerBuku = input19.nextDouble();

        diskon = 0.0;

        if (jenisBuku.equals("kamus")) {
            diskon = 10.0;
            if (jumlahBuku > 2) {
                diskon += 2.0;
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 7.0;
            if (jumlahBuku > 3) {
                diskon += 2.0;
            } else {
                diskon += 1.0;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 5.0;
            }
        }

       
        totalHargaSebelumDiskon = jumlahBuku * hargaPerBuku;
        totalDiskon = totalHargaSebelumDiskon * (diskon / 100);
        totalHargaSetelahDiskon = totalHargaSebelumDiskon - totalDiskon;

     
        System.out.println("Total harga sebelum diskon: Rp " + totalHargaSebelumDiskon);
        System.out.println("Total diskon: Rp " + totalDiskon);
        System.out.println("Total harga yang harus dibayar: Rp " + totalHargaSetelahDiskon);

    }
}
