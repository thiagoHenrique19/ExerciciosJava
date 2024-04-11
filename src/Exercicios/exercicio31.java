package br.com.hello;

import java.util.Scanner;

public class exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Definir variavel horasMensal
        double horasMensal = 220;
//        Definir variavel horasTrabalhas a qual o usuario deve informar
        double horasTrabalhadas;
//        Definir varaivel salárioNormal da pessoa
        double salarioNormal = 1412;
//        Definir variavel salarioComHorasExtras
        double salarioComHorasExtras;
//        Deve ser feitos os seguintes calculos:
        System.out.println("Quantas horas voce trabalhou esse mes? ");
        horasTrabalhadas = scanner.nextDouble();
//        valor por horas = salarioNormal / horarioMensal
        double ganhaPorHora  = salarioNormal / horasMensal;
//        valor por horas extras =  valor por hora + (valor por hora * 50%)
        double valorPorExtra = ganhaPorHora + (ganhaPorHora * 0.5);
//        valor de horas a mais trabalhadas = horasTrabalhadas(Qual foi informada no scanner) - horararioquetrabalajpormes
        double valorPorHoraAMais = horasTrabalhadas - horasMensal;
//        valor total de horas extras = valor por hora extra * horas a mais
        double valorTotalDeHoraExtra = valorPorHoraAMais * valorPorExtra;
//        salario = salarioNorma + valor total de horas extras
        salarioComHorasExtras = salarioNormal + valorTotalDeHoraExtra;
//        Deve mostrar os resultados
        System.out.println("O pagamento total vai ser de: " + salarioComHorasExtras );
    }
}
