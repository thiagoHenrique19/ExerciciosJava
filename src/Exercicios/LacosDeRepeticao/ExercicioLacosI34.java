package Exercicios.LacosDeRepeticao;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ExercicioLacosI34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;
        int somaSalario = 0;
        int salario = 0;
        int maior = 0;
        int menor = 200;
        int idadeMenorSalario = 9999;
        int qntdMulheres = 0;
        int qntdHabitantes = 0;
        double sexo = 0;
        double sexoMenorSalario = 0;
        int menorSalario = 0;

        while(idade >= 0){
            System.out.println("Digite a sua idade: ");
            idade= scanner.nextInt();
            if(idade < 0){
                break;
            }
        }
        System.out.println("Digite o seu sexo se é 'M ou F");
        sexo= scanner.nextInt();
        System.out.println("Digite o seu salario");
        salario= scanner.nextInt();
        if(sexo =='F'){
            qntdMulheres = qntdMulheres + 1;
        }if(salario > 0){
            somaSalario= somaSalario + salario;
            qntdHabitantes=qntdHabitantes + 1;
        }if(idade > maior){
            maior = idade;
        }if(idade < menor){
            menor = idade;
        }if(salario < menorSalario){
            idadeMenorSalario = idade;
            idade = menorSalario;
            sexoMenorSalario = sexo;
        }

        System.out.println("A media salarial desse grupo é: " + somaSalario / qntdHabitantes);
        System.out.println("A menor idade é:" + menor );
        System.out.println("A maior idade é:" + maior);
        System.out.println("A quantidade de mulheres é de: " + qntdMulheres);
        System.out.println("A idade da pessoa mais velha é" + maior + "O seu sexo é:" + sexo);







    }
}
