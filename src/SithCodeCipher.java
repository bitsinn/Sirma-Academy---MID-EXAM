import java.util.Scanner;

public class SithCodeCipher {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String [] message = input.trim().split("\\s+");

        for (String s : message) {
            for (int j = 0; j < s.length(); j++) {
                char letter = s.charAt(j);
                letter = (char) (letter + n);

                System.out.print(letter);
            }
            System.out.print(" ");
        }
    }
}
