package testes;

import java.util.Date;

public class tipoString {
    public static void main(String[] args) {
        System.out.println("Ola pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println("!!!".concat(s));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Thiago";
        var sobrenome = "Oliveira";
        var idade = 16;
        var salario = 850.00;

        System.out.println(" Nome: " + nome + " \nSobrenome: "
                + sobrenome + " \nIdade: " + idade +
                " \nSalario " + salario + "\n\n");

        System.out.printf("O senhor  %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade ,salario);

        System.out.println("\nO senhor " + nome + sobrenome + " tem " + idade + " e ganha " + salario);


    }
}
