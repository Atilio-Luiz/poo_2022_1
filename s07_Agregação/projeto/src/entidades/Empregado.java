package entidades;

public class Empregado {
    private String cpf;
    private String nome;
    private float salario;
    private Departamento departamento;

    public Empregado(String cpf, String nome, 
        float salario, Departamento departamento) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public Empregado(String cpf, String nome, float salario) {
        this(cpf, nome, salario, null);
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return String.format("[nome: %s, cpf: %s, salario: %.2f]",
            getNome(), getCpf(), getSalario());
    }
    
}
