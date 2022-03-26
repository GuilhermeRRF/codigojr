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
        this.comissao = CalcularComissao(salarioBase, taxa);
        this.salarioTotal = CalcularSalarioTotal(this.comissao);
    }

    private double CalcularSalarioTotal(double comissao) {
        return this.salarioBase + comissao;
    }

    private double CalcularComissao(double salarioBase, double taxa) {
        return (salarioBase * taxa) / 100;
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
