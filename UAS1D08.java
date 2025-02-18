import java.util.Scanner;

// Nama     : Davi Aulia Maghfirah
// NIM      : 244107020093
// No.Absen : 08

public class UAS1D08 {

    static String[][] data08 = new String[5][4];  

    public static void main(String[] args) {
        Scanner scanner08 = new Scanner(System.in);
        int pilihan08;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan08 = scanner08.nextInt();

            switch (pilihan08) {
                case 1:
                    inputDataSkor(scanner08);
                    break;
                case 2:
                    tampilkanTabelSkor();
                    break;
                case 3:
                    tentukanJuara();
                    break;
                case 4:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan08 != 4);
    }

    public static void inputDataSkor(Scanner scanner08) {
        for (int i = 0; i < 4; i++) {
            System.out.println();
            System.out.print("Masukkan nama tim ke-" + (i + 1) + ": ");
            scanner08.nextLine();
            String nama08 = scanner08.nextLine();

            while (true) {
                System.out.print("Masukkan skor " + nama08 + " untuk Level 1: ");
                int skorPertama08 = scanner08.nextInt();

                if (skorPertama08 < 0) {
                    System.out.println("Jumlah skor tidak valid. Harus bilangan positif atau nol.");
                    continue;
                }

                System.out.print("Masukkan skor " + nama08 + " untuk Level 2: ");
                int skorKedua08 = scanner08.nextInt();

                if (skorKedua08 < 0) {
                    System.out.println("Jumlah skor tidak valid. Harus bilangan positif atau nol.");
                    continue;
                }

                if (skorPertama08 < 35) {
                    skorPertama08 = 0;
                }

                if (skorKedua08 < 35) {
                    skorKedua08 = 0;
                }

                int totalSkor08 = skorPertama08 + skorKedua08;

                data08[i][0] = nama08;
                data08[i][1] = String.valueOf(skorPertama08);
                data08[i][2] = String.valueOf(skorKedua08);
                data08[i][3] = String.valueOf(totalSkor08);

                break; 
            }
        }
    }

    public static void tampilkanTabelSkor() {
        System.out.println("Tabel Skor Turnamen");
        System.out.println("Nama tim | Level 1 | Level 2 | Total Skor");

        for (int i = 0; i < 4; i++) {
            System.out.println(data08[i][0] + " | " + data08[i][1] + " | " + data08[i][2] + " | " + data08[i][3]);
        }
    }

    public static void tentukanJuara() {
        int tertinggi08 = 0;
        String namaTertinggi08 = "test";

        for (int i = 0; i < 4; i++) {
            int totalSkorTim08 = Integer.parseInt(data08[i][3]);
            if (totalSkorTim08 > tertinggi08) {
                tertinggi08 = totalSkorTim08;
                namaTertinggi08 = data08[i][0];
            }
        }

        System.out.println();
        System.out.println("Selamat kepada tim " + namaTertinggi08 + " yang telah memenangkan kompetisi!");
    }
}
