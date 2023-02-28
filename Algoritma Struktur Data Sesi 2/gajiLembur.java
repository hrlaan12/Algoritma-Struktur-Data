import java.util.Scanner;

public class gajiLembur {
    public static void main(String[] args) {
        try (var input = new Scanner(System.in)) {
            //Input Jam kerja
            System.out.print("Masukan Gaji Selama 1 Bulan : Rp.");
            int Gaji = input.nextInt();
            System.out.print("Masukan jumlah jam lembur : ");
            int jamLembur = input.nextInt();
            System.out.print("Masukan Gaji Lembur : Rp.");
            int upahLembur = input.nextInt();

            //Oprasi Penjumlahan untuk menghitung total keseluruhan gaji
            int gajiLembur = jamLembur * upahLembur;
            int totalGaji = Gaji + gajiLembur;

            //output
            System.out.println("Gaji lembur: " + gajiLembur);
            System.out.println("Total gaji: " + totalGaji);
        }
        
    }
}
