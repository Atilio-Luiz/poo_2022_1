public class Pessoa implements Comparable<Pessoa> {
    private int idade;
    private String nome;

    public Pessoa() {}

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Pessoa obj) {
        int result = this.nome.compareTo(obj.nome);
        if(result == 0) {
            return Integer.compare(this.idade, obj.idade);
        }
        else {
            return result;
        }
    }

    
}