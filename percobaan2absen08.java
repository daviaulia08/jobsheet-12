import java.util.Scanner;

public class percobaan2absen08 {
    static int hitungPangkat(int bilangan, int pangkat) {
        int hasil = 1;
        System.out.print("Deret perhitungan: ");
        for (int i = 1; i <= pangkat; i++) {
            hasil *= bilangan; 
            System.out.print(bilangan); 
            if (i < pangkat) {
                System.out.print("x"); 
            }
        }
        return hasil; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        int hasil = hitungPangkat(bilangan, pangkat); 
        System.out.println(" = " + hasil);
    }
}
