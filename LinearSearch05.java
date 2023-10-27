import java.util.Scanner;
/**
 * LinearSearch05
 */
public class LinearSearch05 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        int hasil = 0;

        System.out.print("Masukkan jumlah elemen array : ");
        int jumlahElemen = input05.nextInt();
        
        int[] arrayInt = new int[jumlahElemen];
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + " : ");
            arrayInt[i] = input05.nextInt();
        }
        boolean key = false;
        System.out.print("Masukkan key yang ingin dicari : ");
        int keY = input05.nextInt();
        for (int i = 0; i <arrayInt.length; i++) {
            if (arrayInt[i] == keY){
                hasil = i;
                key = true;
                break;
            }
        } if (key)
        System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
        else
        System.out.println("Key tidak ditemukan");
        input05.close();
    }
}