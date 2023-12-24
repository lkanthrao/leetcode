import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

        System.out.println(new ValidParenthesis().isValid("[]"));

    }

    public boolean isValid(String s) {
        if (s.length() < 2) return false;

        Stack<Character> stack = new Stack<>();
        for (int index = 0; index < s.length(); index++) {
            char charAtIndex = s.charAt(index);
            if (charAtIndex == '(')
                stack.push(')');
            else if (charAtIndex == '{')
                stack.push('}');
            else if (charAtIndex == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != charAtIndex)
                return false;
        }
        return stack.isEmpty();
    }


}
