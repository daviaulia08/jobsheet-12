import java.util.Scanner;

public class percobaan2absen08 {
    static int hitungPangkat(int x, int y) {
        int hasil = 1;
        if (y == 0) {
            return 1; 
        } else {
            return x * hitungPangkat(x, y - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        System.out.println("Hasil: " + hitungPangkat(bilangan, pangkat));
    }
}
