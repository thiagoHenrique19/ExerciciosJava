package ListaExercicio2;

public class NumeroComplexo {
        private double parteReal;
        private double parteImaginaria;

        //construtor
    public NumeroComplexo( double parteReal, double parteImaginaria){
            this.parteReal = parteReal;
            this.parteImaginaria = parteImaginaria;
        }

        //getters e setters
        public double getParteReal () {
            return parteReal;
        }
        public void setParteReal ( double parteReal){
            this.parteReal = parteReal;
        }
        public double getParteImaginaria () {
            return parteImaginaria;
        }
        public void setParteImaginaria ( double parteImaginaria){
            this.parteImaginaria = parteImaginaria;
        }
        //metodo somar
        public NumeroComplexo somar (NumeroComplexo outro){
            double novaParteReal = this.parteReal + outro.parteReal;
            double novaParteImaginaria = this.parteImaginaria + outro.parteImaginaria;
            return new NumeroComplexo(novaParteReal, novaParteImaginaria);
        }
        public NumeroComplexo subtrair (NumeroComplexo outro){
            double novaParteReal = this.parteReal - outro.parteReal;
            double novaParteImaginaria = this.parteImaginaria - outro.parteImaginaria;
            return new NumeroComplexo(novaParteReal, novaParteImaginaria);
        }
        public NumeroComplexo multiplicar (NumeroComplexo outro){
            double novaParteReal = this.parteReal * outro.parteReal;
            double novaParteImaginaria = this.parteImaginaria * outro.parteImaginaria;
            return new NumeroComplexo(novaParteReal, novaParteImaginaria);
        }
        public NumeroComplexo dividir (NumeroComplexo outro){
            double divisor = outro.parteReal * outro.parteReal + outro.parteImaginaria *
                    outro.parteImaginaria;
            double novaParteReal = (this.parteReal * outro.parteReal + this.parteImaginaria *
                    outro.parteImaginaria) / divisor;
            double novaParteImaginaria = (this.parteImaginaria * outro.parteReal - this.parteReal *
                    outro.parteImaginaria) / divisor;
            return new NumeroComplexo(novaParteReal, novaParteImaginaria);
        }
        //metodo de comparacao semantica
        public boolean equals (NumeroComplexo outro){
            return this.parteReal == outro.parteReal && this.parteImaginaria == outro.parteImaginaria;
        }
        //metodo que gera e retorna a representacao string do numero complexo
        public String toString () {
            return String.format("%s%si", parteReal, parteImaginaria >= 0 ? "+" + parteImaginaria :
                    parteImaginaria);
        }
        //metodo que retorna o modulo do numero complexo
        public double modulo () {
            return Math.sqrt(parteReal * parteReal + parteImaginaria * parteImaginaria);
        }
        //metodo para testa a classe
        public static void main(String[] args) {

            NumeroComplexo num1 = new NumeroComplexo(2, 3);
            NumeroComplexo num2 = new NumeroComplexo(1, 4);

            System.out.println("Num1: " + num1);
            System.out.println("Num2: " + num2);

            NumeroComplexo soma = num1.somar(num2);
            System.out.println("Soma: " + soma);

            NumeroComplexo subtracao = num1.subtrair(num2);
            System.out.println("Subrtracao: " + subtracao);

            NumeroComplexo divisao = num1.dividir(num2);
            System.out.println("Divisao: " + divisao);

            System.out.println("Num1 é igual a Num2?" + num1.equals(num2));
            System.out.println("Modulo de Num1: " + num1.modulo());
    }
}