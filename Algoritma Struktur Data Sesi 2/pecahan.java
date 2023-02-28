import java.util.Scanner;

public class pecahan {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            //Nominal Uang Yang ada di indonesia
            int nominalUang, sisaUang;
            int[] uang = {50000, 20000, 10000, 5000, 2000, 1000, 500};

            //Berapa uang yang kalian punya 
            System.out.print("Masukkan nominal uang : Rp.");
            nominalUang = input.nextInt();
            sisaUang = nominalUang;

            //Oprasi buat menghitung Berapa lembar Uang
            for(int i=0; i<uang.length; i++) {
                int lembar = sisaUang / uang[i];
                if(lembar > 0) {
                    System.out.println(lembar + " lembar " + uang[i] + " ribuan");
                    sisaUang = sisaUang % uang[i];
                }
            }
        }

    }
}
