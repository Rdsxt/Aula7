public class Torneio {
    private String nome;
    private int idade;

    public Torneio(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String verificaCategoria(){
        String categoria;

        if(idade <= 7){
            categoria = "Infantil";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Juvenil";
        } else if (idade >= 11 && idade <= 15) {
            categoria = "Adolescente";
        } else if (idade >= 16 && idade <= 30) {
            categoria = "Adulto";
        } else {
            categoria = "Sênior";
        }

        return categoria;
    }

    public void imprimeDados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Categoria: " + this.verificaCategoria());
    }
}