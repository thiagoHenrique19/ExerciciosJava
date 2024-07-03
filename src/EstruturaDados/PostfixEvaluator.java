package EstruturaDados;

import java.util.Stack;

public class PostfixEvaluator {
    //metodo para avaliar a expressao posfixa
    public static int evaluatePostfix(String postfix){
        Stack<Integer> stack = new Stack<>();

        for (String token:postfix.split("")){
            if (Character.isDigit(token.charAt(0))){
                stack.push(Integer.parseInt(token));
            }else{
                int b = stack.pop();
                int a = stack.pop();

                switch (token.charAt(0)){
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                            break;
                    case '*':
                        stack.push(a * b);
                            break;
                    case '/':
                        stack.push(a / b);
                            break;
                    }
                }
            }
        return stack.pop();
        }
    }

