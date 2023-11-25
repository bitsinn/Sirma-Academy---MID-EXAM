import java.util.Scanner;

public class CountingWombRats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rats = Integer.parseInt(scanner.nextLine());
        int increasedBy = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= hours; i++) {
            if (i == 1){
                sum = rats;
            }

            if (i > 1) {
                rats += increasedBy;
                sum += rats;
            }
        }

        System.out.println(sum);
    }
}