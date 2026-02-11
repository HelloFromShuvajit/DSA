import java.util.Stack;

public class ParentParenthesis {
    public String removeOuterParentheses(String s) {
        Stack<Character> bracket = new Stack<>();
        StringBuilder sB = new StringBuilder();
        for(char c : s.toCharArray())  {          
            if(c == '('){
                if (!bracket.isEmpty()) {
                    sB.append(c);
                }
                bracket.push(c);
            }
            else  {
                bracket.pop();
                if (!bracket.isEmpty()) {
                    sB.append(c);
                }
            }
        }
        return sB.toString();
    }

    public static void main(String[] args) {
        ParentParenthesis removeParent = new ParentParenthesis();
        String input = "(()())(())";
        String output = removeParent.removeOuterParentheses(input);
        System.out.println(output);  
    }
}