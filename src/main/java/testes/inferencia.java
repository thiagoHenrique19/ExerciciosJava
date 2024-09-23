package testes;

public class inferencia {
    public static void main(String[] args) {
        double a = 4.5; //declaração e inicialização
        System.out.println(a);

        a = 12;
        System.out.println(a);

        //a = "...";

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        c = "Outro texto";
        System.out.println(c);

        //c = 4.5;

        double d;// variavel foi declarada
        d = 123.65; //variavel foi inicializada
        System.out.println(d); //usada!

        var e = 123.45;
        System.out.println(e);

        var f = 12; // inteiro
        f = (int) 12.01;
        System.out.println(f);
    }
    }
