package CaixaEletronico;

public class SaldoInsuficiente extends Exception {

    private double saldoAtual;
    private double valorSolicitado;

    public SaldoInsuficiente(double saldoAtual, double valorSolicitado) {
        super("Saldo insuficiente");
        this.saldoAtual = saldoAtual;
        this.valorSolicitado = valorSolicitado;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public double getValorSolicitado() {
        return valorSolicitado;
    }

    public void setValorSolicitado(double valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
    }
}