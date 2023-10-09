import java.util.Scanner;
public class ForKelipatan11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah, counter = 0;
        int total = 0;

        System.out.print("Masukan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        for (int i = 1 ; i <=50 ; i++) {
            if ( i % kelipatan == 0) {
                total += i;
                counter++;
            }
        }
        System.out.printf("Banyaknya bilangan kelipatan %d dari 1 sampai 50 adalah %d \n", kelipatan,counter);
        System.out.printf("Jumlah semua bilangan kelipatan %d dari 1 sampai 50 adalah %d \n", kelipatan,total);

    }

}