package CaixaEletronico;

public class FaltaDeCedulas extends Exception {

    private int cedulasNecessarias;
    private int cedulasDisponiveis;

    public FaltaDeCedulas(int cedulasNecessarias, int cedulasDisponiveis) {
        super("Caixa sem cedulas suficientes");
        this.cedulasNecessarias = cedulasNecessarias;
        this.cedulasDisponiveis = cedulasDisponiveis;
    }

    public int getCedulasNecessarias() {
        return cedulasNecessarias;
    }

    public void setCedulasNecessarias(int cedulasNecessarias) {
        this.cedulasNecessarias = cedulasNecessarias;
    }

    public int getCedulasDisponiveis() {
        return cedulasDisponiveis;
    }

    public void setCedulasDisponiveis(int cedulasDisponiveis) {
        this.cedulasDisponiveis = cedulasDisponiveis;
    }
}