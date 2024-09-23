package EstruturaDados;

import java.util.Stack;

public class InfixToPostfix {
    //metodo para converter expressao infixa para posfixa
    public static String infixToPostfix(String infix){
        StringBuilder postFix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (String token: infix.split("")){
            char c = token.charAt(0);

        //se o token é um operando, adiciona a saida
        if (Character.isDigit(c)) {
            postFix.append(token).append("");
        }
        //se o token é um operador, processa a pilha
        else if (isOperator(c)) {
         while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())){
             postFix.append(stack.pop()).append("");
         }
         stack.push(c);
           }
        }
    //esvazia a pilha na saida
    while (!stack.isEmpty()){
        postFix.append(stack.pop()).append("");
    }
    return postFix.toString().trim();
    }
    //metodo para verificar se um caractere é um operador
    private static boolean isOperator(char c){
        return !(c != '+' && c != '-' && c != '*' &&  c != '/');
    }
    //metodo para verificar a precedencia dos operadores
    private static int precedence(char c){
        switch (c){
            case '+':
            case '-':
               return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;

        }
    }
}
