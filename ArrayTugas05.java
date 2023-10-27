import java.util.Scanner;
/**
 * ArrayTugas05
 */
public class ArrayTugas05 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen : ");
        int jumlahElemen = input05.nextInt();

        int[] nilaiElemen = new int[jumlahElemen];
            for (int i = 0; i < nilaiElemen.length; i++) {
                System.out.print("Masukkan nilai elemen ke- " + (i+1) + " : ");
                nilaiElemen[i] = input05.nextInt();
            }
            int temp = 0;
            for (int i = 0; i < nilaiElemen.length; i++) {
                for (int j = 1; j < nilaiElemen.length-i; j++) {
                    if (nilaiElemen[j-1] > nilaiElemen[j]) {
                        temp = nilaiElemen[j];
                        nilaiElemen[j] = nilaiElemen[j-1];
                        nilaiElemen[j-1] = temp;
                    }
                }
            }
            int nilaiTertinggi = nilaiElemen[nilaiElemen.length-1];
            int nilaiTerendah = nilaiElemen[0];
            double rata = 0;
            for ( int i : nilaiElemen ) {
                rata += i;
            }
            rata/=nilaiElemen.length;
            System.out.println("Nilai tertinggi : " + nilaiTertinggi);
            System.out.println("Nilai terendah : " + nilaiTerendah);
            System.out.println("Rata-rata nilai elemen : " + rata);
    
        input05.close();

    }
}