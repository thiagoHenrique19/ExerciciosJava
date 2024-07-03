package EstruturaDados;

import java.util.Stack;

public class InfixToPostfix {
    //metodo para converter expressao infixa para posfixa
    public static String infixToPostfix(String infix){
        StringBuilder postFix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (String token: infix.split("")){
            char c = token.charAt(0);
        }
    }
}
