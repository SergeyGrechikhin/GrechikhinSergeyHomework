package javapro.homework7;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Checker {
    public static boolean isValid(String input){
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> brackets = new HashMap<Character, Character>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');

        for (char ch : input.toCharArray()) {
            if (brackets.containsValue(ch)) {
                stack.push(ch);
            } else if (brackets.containsKey(ch)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char foundchar = stack.pop();
                if (foundchar != brackets.get(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
