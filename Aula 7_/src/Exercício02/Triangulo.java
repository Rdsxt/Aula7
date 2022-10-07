public class Triangulo {
    private double base, altura;

    public Triangulo(){

    }

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    
    }

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double calculaArea(){
        return this.base * this.altura / 2;
    }

    public void imprimeDados(){
        System.out.println("Base: " + this.getBase());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Area: " + this.calculaArea());
    }
}