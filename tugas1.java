import java.util.Scanner;

public class tugas1 {
    // Fungsi rekursif
    static void deretRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretRekursif(n - 1);
        }
    }

    // Fungsi iteratif
    static void deretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.println("Deret Descending (Rekursif):");
        deretRekursif(n);
        System.out.println("\nDeret Descending (Iteratif):");
        deretIteratif(n);
    }
}
