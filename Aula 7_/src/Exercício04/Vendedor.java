package Exercício04;

public class Vendedor {
    private float vendas;
    private float salario;
    private String nome;
    private int falta;

    public Vendedor(float vendas, float salario, String nome, int falta) {
        this.vendas = vendas;
        this.salario = salario;
        this.nome = nome;
        this.falta = falta;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public void imprimirDados(){
        System.out.println("Vendas: " + this.getVendas());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Falta: " + this.getFalta() + "\n");

        System.out.println("*************************************************" + "\n");

        System.out.println("Comissão: " + this.calcularComissao());
        System.out.println("Desconto faltas: " + this.descontoFalta());
        this.calcularSalario();
    }

    public float calcularComissao(){
        float bonus = 0;
        float comissao;

        if (this.vendas >= 1000 && this.vendas < 2000){
            bonus = (float) 0.10;
        } else if (this.vendas >= 2000) {
            bonus = (float) 0.15;
        }else {
            bonus = 0;
        }

        return this.vendas * bonus;
    }

    public float descontoFalta(){
        return (this.salario / 30) * this.falta;
    }

    public void calcularSalario(){
        float comissao = this.calcularComissao();
        float descontoFalta = this.descontoFalta();
        this.salario = (this.salario + comissao - descontoFalta);

        System.out.println("Salário final: " + this.salario);
    }
}