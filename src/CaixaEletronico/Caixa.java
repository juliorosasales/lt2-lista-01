package CaixaEletronico;

public class Caixa {

    private int cedulas;

    public Caixa(int cedulas) {
        this.cedulas = cedulas;
    }

    public int getCedulas() {
        return cedulas;
    }

    public void setCedulas(int cedulas) {
        this.cedulas = cedulas;
    }

    public void sacar(ContaBancaria conta, double valor) throws SaldoInsuficiente, FaltaDeCedulas {

        if (conta.getSaldo() < valor) {
            throw new SaldoInsuficiente(conta.getSaldo(), valor);
        }

        int notasNecessarias = (int)(valor / 10);

        double saldoReservado = conta.getSaldo();
        conta.setSaldo(conta.getSaldo() - valor);

        int notasEntregues = 0;

        try {
            while (notasEntregues < notasNecessarias) {
                if (cedulas == 0) {
                    throw new FaltaDeCedulas(notasNecessarias, notasEntregues);
                }
                cedulas--;
                notasEntregues++;
            }
            System.out.println("Saque no valor de R$" + valor + " realizado");

        } catch (FaltaDeCedulas e) {
            conta.setSaldo(saldoReservado);
            cedulas = cedulas + notasEntregues;
            throw e;
        }
    }
}