package EstufaInteligente;

public class Sensor {

    private double temperatura;

    public Sensor(double temperatura) {
        this.temperatura = temperatura;
    }

    public double lerTemperatura() throws LeituraInconsitente {
        if (temperatura > 100 || temperatura < -50) {
            throw new LeituraInconsitente("Leitura inconsistente");
        }
        return temperatura;
    }
}