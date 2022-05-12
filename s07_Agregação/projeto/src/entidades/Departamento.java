package entidades;

import java.util.ArrayList;

public class Departamento {
    private int codigo;
    private Empregado gerente;
    private ArrayList<Empregado> empregados = new ArrayList<>(); 

    public Departamento(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public Empregado getGerente() {
        return gerente;
    }

    public void setGerente(Empregado gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Empregado> getEmpregados() {
        return empregados;
    }

    public void addEmpregado(Empregado e) {
        empregados.add(e);
    }

    @Override
    public String toString() {
        return String.format("[codigo: %d, gerente: %s]", codigo, gerente);
    }
    
}
