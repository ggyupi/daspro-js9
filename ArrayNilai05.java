import java.util.Scanner;
/**
 * ArrayNilai05
 */
public class ArrayNilai05 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = input05.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus!");
            } else
                System.out.println("Mahasiswa ke-" + i + " tidak lulus!");
        }
        input05.close();
    }
}