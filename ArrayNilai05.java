import java.util.Scanner;
/**
 * ArrayNilai05
 */
public class ArrayNilai05 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = input05.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke- " + i + " adalah " + nilaiAkhir[i]);
        }
        input05.close();
    }
}