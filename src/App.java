import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

import Exercicio4.Funcionario;
import Exercicio4.Salario;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o Nome do Funcionário: ");
            String nome = input.next();

            System.out.print("Digite o valor do Salário Base: ");
            double salBase = input.nextDouble();

            System.out.print("Digite o valor da Taxa de comissão: ");
            double taxa = input.nextDouble();

            Salario salario = new Salario(salBase, taxa);
            Funcionario funcionario = new Funcionario(nome, salario);

            ExibirRelatorio(funcionario);
        }
    }

    public static void ExibirRelatorio(Funcionario funcionario) {
        System.out.println();
        System.out.println("********RELATÓRIO DE SALÁRIO E COMISSÃO****");
        System.out.println();
        System.out.println("Nome do Funcionário: " + funcionario.getNome());
        System.out.println("Salário Base:        " + customFormat("R$###,###.##", funcionario.getSalario().getSalarioBase()));
        System.out.println("Taxa de Comissão:    " + customFormat("###.##%", funcionario.getSalario().getTaxa()));
        System.out.println("Valor de Comissão:   " + customFormat("R$###,###.##", funcionario.getSalario().getComissao()));
        System.out.println("Salário Total:       " + customFormat("R$###,###.##", funcionario.getSalario().getSalarioTotal()));
        System.out.println();
        System.out.println("********FIM DO RELATÓRIO ******************");
    }

    static public String customFormat(String pattern, double value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern, new DecimalFormatSymbols (new Locale ("pt", "BR")));
        String output = myFormatter.format(value);
        return output;
    }
}
