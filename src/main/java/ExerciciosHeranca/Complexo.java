package ExerciciosHeranca;

public class Complexo {
    // manipular números complexos e reais,e testa essas
    // funcionalidades criando instâncias dessas classes e exibindo resultados.
    private float real;
    private float imag;

    //construtor
    public Complexo(float real,float imag){
        this.real = real;
        this.imag = imag;
    }
    //metodo para obter o modulo
    public double Modulo(){
        return Math.sqrt(real * real + imag * imag);
    }
    //metodo para obter o angulo em graus
    public double Angulo(){
        return Math.toDegrees(Math.atan2(imag,real));
    }
    //getters
    public float getReal(){
        return real;
    }
    public float getImag(){
        return imag;
    }
    //seters
    public void setReal(float real){
        this.real = real;
    }
    public void setImag(float imag){
        this.imag = imag;
    }
}
