import java.util.Scanner;
/**
 * ArrayRataNilai05
 */
public class ArrayRataNilai05 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        int[] nilaiMahasiswa = new int[10];
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i+1) + " : ");
            nilaiMahasiswa[i] = input05.nextInt();
        }

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
        }

        rata2 = total/nilaiMahasiswa.length;
        System.out.println("Rata-rata nilai mahasiswa adalah " +rata2);
        input05.close();

    }
}