import java.util.Scanner;
/**
 * ArrayRataNilai05
 */
public class ArrayRataNilai05 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        int[] nilaiMahasiswa = new int[10];
        int counter = 0;
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i+1) + " : ");
            nilaiMahasiswa[i] = input05.nextInt();
        }
            for (int i = 0; i < nilaiMahasiswa.length; i++) {
                total += nilaiMahasiswa[i];
                if (nilaiMahasiswa[i] > 70) {
                    counter++;
                }
            }       
            rata2 = total/nilaiMahasiswa.length;
            System.out.println("Rata-rata nilai mahasiswa adalah " +rata2);
            System.out.print("Banyaknya mahasiswa yang lulus adalah " + counter + " orang ");
            input05.close();
    }
}