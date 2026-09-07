package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ExpressionCheck {
    public static void main(String[] args){
        String string = "{[()]}";
        System.out.println(isValid(string));
    }
    public static boolean isValid(String s){
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{'||c=='('||c=='['){
                stack.push(c);
            }
            if(c=='}'||c==')'||c==']'){
                if (stack.isEmpty()||map.get(c)!=stack.peek()){
                    return false;
                }
                if (map.get(c)==stack.peek()){
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
