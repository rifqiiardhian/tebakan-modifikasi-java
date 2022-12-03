import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // define variables
        int random, tebak, jumlah;
        random = (int) (Math.random() * 100);

        System.out.println("Tebaklah Angka Antara 1-100");
        Scanner masukan = new Scanner(System.in);

        jumlah = 0;

        //Proses
        do {
            // Increment jumlah
            jumlah++;

            // Input tebakan
            System.out.print("Masukkan Tebakan Anda : ");
            tebak = masukan.nextInt();

            // check if jumlah is less than 5 or not
            if (jumlah < 5) {
                if (tebak > random) {
                    // Output if tebakan is more than random number
                    System.out.println("Tebakan Terlalu Besar");
                } else if (tebak < random) {
                    // Output if tebakan is less than random number
                    System.out.println("Tebakan Terlalu Kecil");
                } else {
                    // Output if tebakan is equal to random number
                    System.out.print("Tebakan Benar! Setelah " + jumlah + " Kali Menebak");
                }
            } else {
                // if jumlah is equal to 5
                // Output final showing random number to user
                System.out.print("Anda telah " + jumlah + " kali menebak salah, jawaban benar adalah " +random);
            }
        } while (tebak != random && jumlah < 5);
    }
}