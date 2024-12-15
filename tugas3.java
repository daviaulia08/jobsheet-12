import java.util.Scanner;

public class tugas3 {
    // Fungsi rekursif 
    static int fibonacci(int n) {
        if (n == 0) return 0; 
        if (n == 1) return 1; 
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bulan ke-n: ");
        int n = sc.nextInt();

        System.out.println("Jumlah pasangan marmut per bulan:");
        for (int i = 1; i <= n; i++) {
            System.out.println("Bulan " + i + ": " + fibonacci(i));
        }
    }
}
