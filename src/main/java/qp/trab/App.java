package qp.trab;

import java.util.Scanner;

public class App {

    static final double taxaComissao = 0.15;

    public static double calculaComissao(double valorVendas) {
        return valorVendas*taxaComissao;
    }

    public static double calculaSalarioFinal(double salarioFixo, double comissao) {
        return salarioFixo + comissao;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double valorVendasEfetuadas = sc.nextDouble();
        
        double comissao = calculaComissao(valorVendasEfetuadas);
        double salarioComBonus = calculaSalarioFinal(salarioFixo, comissao);

        System.out.printf("TOTAL = R$ %.2f", salarioComBonus);
    }
}
