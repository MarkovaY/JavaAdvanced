package Exercise.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> firstPart = new ArrayDeque<>();

        boolean isBalanced = true;
        for (int i = 0; i < input.length(); i++) {
            char currentParenthesis = input.charAt(i);

            if (currentParenthesis == '[' || currentParenthesis == '{' || currentParenthesis == '(') {
                firstPart.push(currentParenthesis);
            } else {
                if (firstPart.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char lastOpeningParenthesis = firstPart.pop();
                if (currentParenthesis == ']' && lastOpeningParenthesis != '[') {
                    isBalanced = false;
                } else if (currentParenthesis == '}' && lastOpeningParenthesis != '{') {
                    isBalanced = false;
                } else if (currentParenthesis == ')' && lastOpeningParenthesis != '(') {
                    isBalanced = false;
                }
            }
        }
        if (isBalanced && firstPart.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}