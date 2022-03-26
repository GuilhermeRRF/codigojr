package Exercicio4;

public class Funcionario {
    private String Nome;
    private Salario salario;

    public Funcionario() {
    }

    public Salario getSalario() {
        return salario;
    }

    public void setSalario(Salario salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getNome() {
        return this.Nome;
    }

    public Funcionario (String nome, Salario salario) {
        this.Nome = nome;
        this.salario = salario;
    }
}