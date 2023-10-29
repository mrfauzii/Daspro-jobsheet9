import java.util.Scanner;

public class ArrayRataNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int lulusCount = 0;
        int tidakLulusCount = 0;

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                lulusCount++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                tidakLulusCount++;
            }
        }

        double rataLulus = lulusCount > 0 ? totalLulus / lulusCount : 0;
        double rataTidakLulus = tidakLulusCount > 0 ? totalTidakLulus / tidakLulusCount : 0;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}
