package EstruturaDados;

public class Main3 {
    public static void main(String[] args) {
      String infix = "3 + 5 * 2 - 8 /4";

      //converte infixa para posfixa
        String postfix = InfixToPostfix.infixToPostfix(infix);
        System.out.println("Expressao Posfixa: " + postfix);

        //avalia a expressao posfixa
        int result = PostfixEvaluator.evaluatePostfix(postfix);
        System.out.println("Resultado: " + result);
    }
}
