package AluguelPatinete;

public class Patinete {

    private int bateria;
    private boolean emUso;

    public Patinete(boolean emUso, int bateria) {
        this.emUso = emUso;
        this.bateria = bateria;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean isEmUso() {
        return emUso;
    }

    public void setEmUso(boolean emUso) {
        this.emUso = emUso;
    }
}
