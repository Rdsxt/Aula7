public class Main {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario(30, 2600, "Analista Jr");

        float aumento30Porcento = funcionario02.calculaAumento((float)30);
        float aumento2Anos = funcionario02.calculaAumento((2));

        System.out.println("Funcionario02");
        System.out.println("Aumento 30%: " + aumento30Porcento);
        System.out.println("Aumento 2 anos: " + aumento2Anos);
    }
}
