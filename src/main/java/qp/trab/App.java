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

        System.out.println("Informe seu nome.");
        String nome = sc.nextLine();

        System.out.println("Informe seu salário fixo.");
        double salarioFixo = sc.nextDouble();

        while(salarioFixo < 0) {
            System.out.println("Informe valores positivos.");
            salarioFixo = sc.nextDouble();
        }

        System.out.println("Informe o valor total de suas vendas efetuadas.");
        double valorVendasEfetuadas = sc.nextDouble();

        while(valorVendasEfetuadas < 0) {
            System.out.println("Informe valores positivos.");
            valorVendasEfetuadas = sc.nextDouble();
        }

        double salarioComBonus = calculaSalarioFinal(salarioFixo, valorVendasEfetuadas);

        System.out.printf(nome + " - TOTAL = R$ %.2f", salarioComBonus);
    }
}
