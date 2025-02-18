import java.util.Scanner;

public class P15_Team10 {

    // Anggota Kelompok 10 :
    // - Davi Aulia (08)
    // - Rafi Abyantara (23)
    // - Rifqi Aries (26)
    
    static String[][] = new data[4][4];

        do {
            System.out.println("\n=== Sistem Pemantauan Data Mahasiswa ===");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mahasiswa Berdasarkan NIM");
            System.out.println("3. Analisis Mahasiswa dengan SKS < 20");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahDataMahasiswa(scanner);
                    break;
                case 2:
                    tampilkanDataMahasiswa(scanner);
                    break;
                case 3:
                    analisisSKS();
                    break;
                case 4:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

    }

    public static void tambahDataMahasiswa(Scanner scanner) {
        System.out.println ("--- Tambah Data Mahasiswa ---");
        System.out.print("Masukkan Nama Mahasiswa: ");
        scanner.nextLine();
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nim Mahasiswa: ");
        String nama = scanner.nextLine();

        int totalSKS = 0;
        while (true) {
            System.out.print("Masukkan Kode Mata Kuliah: ");
            String kodeMatkul = scanner.nextLine();
            System.out.print("Masukkan Nama Mata Kuliah: ");
            String namaMatkul = scanner.nextLine();
            System.out.print("Masukkan Jumlah SKS (1-3): ");
            int sks = scanner.nextInt();
            scanner.nextLine();

            if (sks < 1 || sks > 3) {
                System.out.println("Jumlah SKS tidak valid. Harus antara 1 dan 3.");
                continue;
            }

            if (totalSKS + sks > 24) {
                System.out.println("Total SKS tidak boleh lebih dari 24.");
                break;
            }

            dataMahasiswa[jumlahData][0] = nama;
            dataMahasiswa[jumlahData][1] = nim;
            dataMahasiswa[jumlahData][2] = kodeMatkul;
            dataMahasiswa[jumlahData][3] = namaMatkul;
            dataMahasiswa[jumlahData][4] = String.valueOf(sks);
            jumlahData++;

            totalSKS += sks;
            System.out.print("Tambah mata kuliah lagi? (y/n): ");
            String lagi = scanner.nextLine();
            if (!lagi.equalsIgnoreCase("y")) break;
        }
        System.out.println("Total SKS yang diambil : " + totalSKS);
    }

    public static void tampilkanDataMahasiswa(Scanner scanner) {
        System.out.println ("--- Tampilan Data Mahasiswa ---");
        System.out.print("Masukkan NIM Mahasiswa: ");
        scanner.nextLine();
        String nim = scanner.nextLine();

        boolean ditemukan = false;
        int totalSKS = 0;

        System.out.println("\nDaftar Data Mahasiswa:");
        for (int i = 0; i < jumlahData; i++) {
            if (dataMahasiswa[i][0].equals(nim)) {
                ditemukan = true;
                if (totalSKS == 0) {
                    System.out.println("Nama: " + dataMahasiswa[i][1]);
                    System.out.println("NIM: " + dataMahasiswa[i][0]);
                    System.out.println("Mata Kuliah:");
                }
                System.out.println("- " + dataMahasiswa[i][2] + " | " + dataMahasiswa[i][3] + " | SKS: " + dataMahasiswa[i][4]);
                totalSKS += Integer.parseInt(dataMahasiswa[i][4]);
            }
        }

        if (ditemukan) {
            System.out.println("Total SKS: " + totalSKS);
        } else {
            System.out.println("Data Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }
    }
    public static void analisisSKS() {
        System.out.println ("--- Analisis Data Mahasiswa ---");
        int jumlah = 0;
        boolean[] mahasiswaDihitung = new boolean[jumlahData]; 
        for (int i = 0; i < jumlahData; i++) {
            String nim = dataMahasiswa[i][0];
    
            if (mahasiswaDihitung[i]) {
                continue; 
            }
    
            int totalSKS = 0;
    
           
            for (int j = 0; j < jumlahData; j++) {
                if (dataMahasiswa[j][0].equals(nim)) {
                    totalSKS += Integer.parseInt(dataMahasiswa[j][4]);
                    mahasiswaDihitung[j] = true; 
                }
            }
    
           
            if (totalSKS < 20) {
                jumlah++;
            }
        }
        
        System.out.println("Jumlah mahasiswa dengan total SKS kurang dari 20: " + jumlah);
    }
