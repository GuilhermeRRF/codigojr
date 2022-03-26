package Exercicio4;

public class Salario {
    private double salarioBase;
    private double comissao;
    private double salarioTotal;
    private double taxa;

    public Salario() {
    }

    public Salario(double salarioBase, double taxa) {
        this.salarioBase = salarioBase;
        this.taxa = taxa;
        this.comissao = CalcularSalario.CalcularComissao(salarioBase, taxa);
        this.salarioTotal = CalcularSalario.CalcularSalarioTotal(salarioBase, this.comissao);
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getComissao() {
        return this.comissao;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public double getSalarioTotal() {
        return this.salarioTotal;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxa() {
        return this.taxa;
    }
}
