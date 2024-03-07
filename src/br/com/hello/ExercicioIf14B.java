package br.com.hello;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ExercicioIf14B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //solicitar ao usuario o salario bruto
        System.out.println("Qual é seu salario bruto? ");
        //ler o salario bruto
        //ler o valor digitado pelo usuario
        double salarioBruto = Double.parseDouble(scanner.nextLine());
        //calcular o valor do imposto de renda
        //descobrir qual é o percentual do imposto a ser aplicado
        //definir uma variavel para armazenar o  percentual de desconto
        double percentualDesconto = 0;
        //se o salario for menor ou igual a 2.100 então tem o percentual de desconto zero
        //se o salario for maior ou igual a 2.100.01 |e|menor ou igual a 3200 | então o percentual de desconto é de 7.5
        if(salarioBruto >= 2100.01 && salarioBruto <= 3200){
            percentualDesconto = 7.5;
        }
        //se o salario for maior ou igual a 3.200.01 e menor ou igual a 4300então o percentual de desconto é de 22.5
        if(salarioBruto >= 3200.01 && salarioBruto <= 4300){
            percentualDesconto = 22.5;
        }
        //se o salario for maior que 4300 então o percentual de desconto é de 27%
        if(salarioBruto > 4300){
            percentualDesconto = 27;
        }
        //calcular o valor do imposto de acordo com o percentual que eu descobri
        //imposto é igual ao salario bruto as vezes o percentual de desconto dividido por 100
        double imposto= salarioBruto * percentualDesconto / 100;
        //calcular o valor do salario liquido
        //salario liquido é igual ao salario bruto menos o valor do imposto
        double salarioLiquido = salarioBruto - imposto;
        //apresentar o valor do imposto de renda
        System.out.println("O valor do imposto de renda é de: "+ imposto);
        //apresentar o valor do salario liquido
        System.out.println("o valor do salario liquidoo é de: " + salarioLiquido);









    }
}
