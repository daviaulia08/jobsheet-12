import java.util.Scanner;

public class tugas2 {
    // Fungsi rekursif 
    static int jumlahRekursif(int n) {
        if (n == 1) {
            System.out.print("1"); 
            return 1;
        } else {
            System.out.print(n + " + "); 
            return n + jumlahRekursif(n - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.print("Perhitungan: ");
        int hasil = jumlahRekursif(n);
        System.out.println(" = " + hasil); 
        System.out.println(" = " + hasil);
    }
}
