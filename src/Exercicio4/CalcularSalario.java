package Exercicio4;

public final class CalcularSalario {
    public static double CalcularSalarioTotal(double salarioBase, double comissao) {
        return salarioBase + comissao;
    }

    public static double CalcularComissao(double salarioBase, double taxa) {
        return (salarioBase * taxa) / 100;
    }
}
