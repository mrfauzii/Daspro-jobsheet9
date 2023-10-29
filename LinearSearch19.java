import java.util.Scanner;
public class LinearSearch19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = sc.nextInt();
        int[] arrayInt = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen array ke-" + i + " : ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = -1; // Inisialisasi hasil dengan -1 jika key tidak ditemukan

        for (int i = 0; i < jumlahElemen; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Key ada di posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan dalam array.");
        }
    }
}
