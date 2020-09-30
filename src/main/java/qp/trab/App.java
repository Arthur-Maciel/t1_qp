package qp.trab;

import java.util.Scanner;

public class App {

    static final double taxaComissao = 0.15;

    public static double calculaComissao(double valorVendas) {
        return valorVendas*taxaComissao;
    }

    public static double calculaSalarioFinal(double salarioFixo, double valorVendasEfetuadas) {
        return salarioFixo + calculaComissao(valorVendasEfetuadas);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double valorVendasEfetuadas = sc.nextDouble();

        double salarioComBonus = calculaSalarioFinal(salarioFixo, valorVendasEfetuadas);

        System.out.printf("TOTAL = R$ %.2f", salarioComBonus);
    }
}