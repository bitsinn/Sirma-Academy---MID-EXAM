import java.util.ArrayDeque;
import java.util.Scanner;

public class JediArchiveSearch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String name = scanner.nextLine();
        String [] archive = input.trim().split("\\s+");
        ArrayDeque<Integer> positions = new ArrayDeque<>();

        for (int i = 0; i < archive.length; i++) {
            if (archive[i].contains(name)){
                positions.add(i);

            }
        }

        if (positions.isEmpty()){
            System.out.println("Record not found");
        }else {
            System.out.print("First Occurrence: ");
            System.out.print(positions.getFirst());
            System.out.println();
            System.out.print("Last Occurrence: ");
            System.out.print(positions.getLast());
        }
    }
}
