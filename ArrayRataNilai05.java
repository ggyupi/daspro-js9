import java.util.Scanner;
/**
 * ArrayRataNilai05
 */
public class ArrayRataNilai05 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        int[] nilaiMahasiswa = new int[10];
        int jumlahMahasiswa;
        double rataLulus = 85;
        double rataTidakLulus = 62.5;
        
        System.out.print("Masukkan jumlah Mahasiswa : ");
        jumlahMahasiswa = input05.nextInt(); 
        for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
                nilaiMahasiswa[i] = input05.nextInt();
            }          
            System.out.println("Rata-rata nilai lulus = " + rataLulus);
            System.out.print("Rata-rata nilai tidak lulus = " + rataTidakLulus);
            input05.close();
    }
}