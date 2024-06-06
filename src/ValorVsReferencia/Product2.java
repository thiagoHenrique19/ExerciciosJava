package ValorVsReferencia;

public class Product2 {

    private String name;
    private double price;
    private int quantiny;

    public Product2(){
    }
    public Product2(String name, double price, int quantiny){
    this.name = name;
    this.price = price;
    this.quantiny = quantiny;
    }
    public Product2(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuantiny(){
        return quantiny;
    }




}
