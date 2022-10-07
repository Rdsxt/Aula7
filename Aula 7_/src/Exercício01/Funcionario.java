public class Funcionario {
    private int cracha;
    private float salario;
    private String cargo;

    public Funcionario(){

    }

    public Funcionario(int cracha, float salario, String cargo){
        this.cracha = cracha;
        this.salario = salario;
        this.cargo = cargo;
    }

    public float calculaAumento(float porcentagem){
        float valor1Porcento = this.salario / 100;
        float valorAumento = valor1Porcento * porcentagem;
    

        return this.salario + valorAumento;
    }

    public float calculaAumento(int tempo){
        int aumento = 150;
        float somaTotal = aumento * tempo;

        return this.salario + somaTotal;
    }

}