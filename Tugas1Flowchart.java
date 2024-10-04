import java.util.Scanner;

public class Tugas1Flowchart {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        int bil1, bil2, bil3;

        System.out.println("Masukan bilangan pertama : ");
        bil1 = input19.nextInt();
        System.out.println("Masukan bilangan kedua : ");
        bil2 = input19.nextInt();
        System.out.println("Masukkan bilangan ketiga : ");
        bil3 = input19.nextInt();

        if (bil1 >= bil2 && bil1 >= bil3) {
            System.out.println("Bilangan terbesar adalah: " + bil1);
        } else if (bil2 >= bil1 && bil2 >= bil3) {
            System.out.println("Bilangan terbesar adalah: " + bil2);
        } else {
            System.out.println("Bilangan terbesar adalah: " + bil3);
        }
    
    }
}