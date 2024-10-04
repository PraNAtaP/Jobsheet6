import java.util.Scanner;

public class Pemilihan2Percobaan319 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0.0;

        System.out.println("Masukan Kategori : ");
        kategori = input19.nextLine();
        System.out.println("Masukkan Besar Penghasilan : ");
        penghasilan = input19.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih : " + gajiBersih);
        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else 
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan bersih : " + gajiBersih);

        } else
            System.out.println("Kategori Salah");
    }
}
