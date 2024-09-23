package EstruturaDados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empregado[] empregados = new Empregado[5];

        //ler os dados dos empregados
        for (int i = 0; i < empregados.length; i++) {
            System.out.println("Digite o nome do empregado " + (i + 1) + ": ");
            String nome = sc.nextLine();

            System.out.println("Digite o CPF do empregado " + (i + 1) + ": ");
            String cpf = sc.nextLine();

            System.out.println("Digite o salario do empregado " + (i + 1) + ": ");
            double salario = sc.nextDouble();
            sc.nextLine();//consumir a nova linha

            empregados[i] = new Empregado(nome,cpf,salario);
        }
        //ordenando os empregados pelo usuario Bubble sort
        for (int i = 0; i < empregados.length -1; i++) {
            for (int j = 0; j < empregados.length -1 - i; j++) {
                if (empregados[j].getSalario() > empregados[j + 1].getSalario()){
                    Empregado temp = empregados[j];
                    empregados[j] = empregados[j + 1];
                    empregados[j + 1] = temp;
                }
            }
        }
        System.out.println("Empregados ordenados pelo salario: ");
        for(Empregado empregado : empregados){
            System.out.println(empregado);
        }
        //pedindo para remover um CPF
        System.out.println("Digite o CPF do empregado a ser removido: ");
        String cpfRemove = sc.nextLine();

        Empregado[] novosEmpregados = new Empregado[empregados.length - 1];
        int index = 0;
        boolean encontrado = false;

        for (int i = 0; i < empregados.length; i++) {
            if (!empregados[i].getCpf().equals(cpfRemove)){
                if (index < novosEmpregados.length){
                    novosEmpregados[index++] = empregados[i];
                }
            }else {
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("CPF não encontrado.");
            //copiar todos os empregados para o novo array se
            //n encontrou o CPF para remover
            novosEmpregados = new Empregado[empregados.length];
            System.arraycopy(empregados,0,novosEmpregados,0,empregados.length);
        }
        System.out.println("main.java.Array resultante apos remocao: ");
        for (Empregado empregado : novosEmpregados){
            System.out.println(empregado);
        }
        sc.close();
    }
}
