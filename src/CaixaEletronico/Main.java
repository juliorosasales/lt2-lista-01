package CaixaEletronico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.print("Numero de cedulas de R$10 disponiveis: ");
        int cedulas = sc.nextInt();

        ContaBancaria conta = new ContaBancaria(saldo);
        Caixa caixa = new Caixa(cedulas);

        System.out.println();
        System.out.print("Valor do saque: ");
        double valorSaque = sc.nextDouble();

        System.out.println();

        try {
            caixa.sacar(conta, valorSaque);
        } catch (SaldoInsuficiente e) {
            System.out.println(e.getMessage());
        } catch (FaltaDeCedulas e) {
            System.out.println(e.getMessage());
            System.out.println("Saldo estornado");
            System.out.println("Saldo atual: R$" + conta.getSaldo());
        }
        sc.close();
    }
}