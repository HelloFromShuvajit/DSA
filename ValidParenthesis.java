import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesis {
    public static void main(String[] args){
        String s= "((**)";
        char [] arr = s.toCharArray();
        Deque<Integer> leftBracketStack = new ArrayDeque<>();
        Deque<Integer> starElementStack = new ArrayDeque<>();
        for(int i=0; i<s.length();i++){
            char c = arr[i];
            if(c == '('){
                leftBracketStack.push(i);
            }
            else 
                if (c =='*') {
                    starElementStack.push(i);
                }
                else
                    if (c ==')') {
                        if(!leftBracketStack.isEmpty()){
                            leftBracketStack.pop();
                        } else
                            if (!starElementStack.isEmpty()) {
                                starElementStack.pop();
                            }
                            else
                            {
                                System.out.println("False");
                                return;
                            }
                        
                    }
        }

        while (!leftBracketStack.isEmpty() && !starElementStack.isEmpty()) {
            int left = leftBracketStack.pop();
            int star = starElementStack.pop();
            if (left>star) {
                System.out.println("False");
                return;
            }
            
        }
        System.out.println(leftBracketStack.isEmpty());
    }
}
