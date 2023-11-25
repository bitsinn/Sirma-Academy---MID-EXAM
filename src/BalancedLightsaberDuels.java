import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedLightsaberDuels {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Character> openParentheses = new ArrayDeque<>();
        ArrayDeque<Character> closedParentheses = new ArrayDeque<>();
        char[] chats = input.toCharArray();

        if (chats.length % 2 != 0){
            System.out.println("Not Legendary");
        }
        for (char element : chats) {
            if (element == '{' || element == '(' || element == '[' || element == '!'){
                if (element == '!'){
                    closedParentheses.push(element);
                }
                openParentheses.push(element);
            } else if (openParentheses.isEmpty()) {
                System.out.println("Not Legendary");
                return;
            }
            else if(element == '}' || element == ')' || element == ']') {
                closedParentheses.push(element);
            }else if (closedParentheses.isEmpty()) {
                System.out.println("Not Legendary");
                return;
            }
        }
        if (openParentheses.size() == closedParentheses.size()){
            for (int i = 0; i < openParentheses.size(); i++) {
                if (openParentheses.pop() != closedParentheses.pop()){
                    System.out.println("Legendary");
                    break;
                }

            }
        }else {
            System.out.println("Not Legendary");

        }
    }
}
