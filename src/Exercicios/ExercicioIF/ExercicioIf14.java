package ExercicioIF;

import java.util.Scanner;

public class ExercicioIf14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //Ler o salario bruto
        //solicitar o valor do salario bruto;
        //ler o salario

        //calcular o valor do imposto de renda;
        //verificar se é pago o imposto(caso seja abaixo de 2.100 não paga
        // caso o salario seja de 2100,01 a 3.200 é pago a porcentagem de 7.5%
        //se o salario for maior que 3.200.01 a 4.300 é pago a porcentagem de 22.5%
        //caso o salario seja maior que 4.300 a porcentagem é de 27%
        //calcular o valor da porcentagem  com o do salario bruto
        //resultando no salario liquido e o valor que é descontado
        //apresentar o valor do desconto do imposto e o valor liquido do salario;


        //ler o salário bruto
        //  solicitar ao usuário o salário bruto
        System.out.println("Qual é seu salario bruto? ");
        //  ler o valor digitado pelo usuário
        double salarioBruto = Double.parseDouble(scanner.nextLine());
        //calcular o valor do imposto de renda
        //  descobrir qual é o percentual do imposto a ser aplicado
        //      definir uma variável para armazenar o percentual de desconto
        double percentualDesconto = 0;
        //      se o salário for menor ou igual 2100 então o percentual de desconto é 0
        //      se o |salário for maior ou igual a 2100,01| |e| |menor ou igual a 3200| então o percentual de desconto é 7.5
        if(salarioBruto >= 2100.01 && salarioBruto <= 3200){
            percentualDesconto = 7.5;
        }
        //      se o salário for maior ou igual a 3200,01 e menor ou igual a 4300 então o percentual de desconto é 22.5
        if(salarioBruto >= 3200.01 && salarioBruto <= 4300){
            percentualDesconto = 22.5;
        }

        //      se o salário for maior que 4300 então o percentual de desconto é 27%
        if(salarioBruto > 4300){
            percentualDesconto = 27;
        }
        //  calcular o valor do imposto de acordo com o percentual que eu descobri
        //      imposto é igual ao salário bruto vezes o percentual de desconto dividido por 100
        double imposto= salarioBruto * percentualDesconto / 100;
        //  calcular o valor do salário líquido
        //      salario liquido é igual ao salário bruto menos o valor do imposto
        double salarioLiquido = salarioBruto - imposto;
        //apresentar o valor do impost de renda
        System.out.println("O valor do imposto de renda é de: "+ imposto);
        //apresentar o valor do salário líquido
        System.out.println("O valor do salari liquido é de: " + salarioLiquido);
    }
}
