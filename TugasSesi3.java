import java.util.Scanner;

public class TugasSesi3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Data Yang Mau di selesaikan
        double penghasilan, ptkp, pkp, pph;
        int status, familyMembers;

        //Input Data

        System.out.print("Masukkan penghasilan anda dalam satu tahun: ");
        penghasilan = input.nextDouble();
        System.out.print("Masukkan status wajib pajak (1: single, 2: married): ");
        status = input.nextInt();
        System.out.print("Masukkan jumlah anggota keluarga yang menjadi tanggungan: ");
        familyMembers = input.nextInt();

        //itung ptkp
        ptkp = calculatePtkp(status, familyMembers);

        //hitung pkp
        pkp = penghasilan - ptkp;

        //hitung pkp
        pph = calculatePph(pkp);

        System.out.println("Penghasilan netto dalam satu tahun: " + String.format("%.2f", penghasilan));
        System.out.println("PTKP: " + String.format("%.2f", ptkp));
        System.out.println("PKP: " + String.format("%.2f", pkp));
        System.out.println("PPh: " + String.format("%.2f", pph));
    }


    private static double calculatePtkp(int status, int familyMembers) {
        double ptkp = 54000000; 

        if (status == 2) { 
            ptkp += 4500000;
        }

        ptkp += familyMembers * 4500000;

        return ptkp;
    }

    private static double calculatePph(double pkp) {
        double pph = 0;

        if (pkp <= 50000000) { 
            pph = 0.05 * pkp;
        } else if (pkp <= 250000000) { 
            pph = 0.15 * pkp;
        } else if (pkp <= 500000000) { 
            pph = 0.25 * pkp;
        } else { 
            pph = 0.5 * pkp;
        }

        return pph;
    }
}
