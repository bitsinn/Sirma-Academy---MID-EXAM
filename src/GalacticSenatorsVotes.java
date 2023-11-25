import java.util.Scanner;

public class GalacticSenatorsVotes {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] array = input.trim().split("\\s+");
        int yesCount = 0;
        int noCount = 0;
        int abstainCount = 0;


        for (String s : array) {
            switch (s) {
                case "Abstain" -> abstainCount++;
                case "Yes" -> yesCount++;
                case "No" -> noCount++;
            }
        }

        if (yesCount == 0 && noCount == 0 && abstainCount > 0){
            System.out.println("Abstain");
        } else if (yesCount > noCount) {
            System.out.println("Yes");
        } else if (noCount == yesCount && noCount != 0) {
            System.out.println("Tie");
        } else {
            System.out.println("No");
        }
    }
}
