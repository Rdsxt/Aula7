import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, altura;
        Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2 = new Triangulo(5, 10);

        System.out.println("Calculo Area do Triangulo");
        System.out.print("Entre com a base: ");
        base = input.nextDouble();
        triangulo1.setBase(base);

        System.out.print("Entre com a altura: ");
        altura = input.nextDouble();
        triangulo1.setAltura(altura);

        System.out.println("Resultados: ");
        System.out.println("Trianglo 1: ");
        triangulo1.imprimeDados();

        System.out.println("Triangulo 2: ");
        triangulo2.imprimeDados();

    }
}