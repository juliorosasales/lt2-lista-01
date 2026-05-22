package EstufaInteligente;

public class Estufa {

    private Sensor sensor;
    private Atuador ventilador;
    private Atuador aquecedor;

    String status1 = "Ventilador ligado";
    String status2 = "Aquecedor ligado";

    public Estufa(Sensor sensor, Atuador ventilador, Atuador aquecedor) {
        this.sensor = sensor;
        this.ventilador = ventilador;
        this.aquecedor = aquecedor;
    }

    public void monitorar() {
        String status = "Monitoramento concluido";

        try {
            double temp = sensor.lerTemperatura();
            System.out.println("Temperatura lida: " + temp + "C");

            if (temp > 30) {
                System.out.println("Temperatura alta, ligando ventilador");
                ventilador.ligar();
                status = status1;

            } else if (temp < 10) {
                System.out.println("Temperatura baixa, ligando aquecedor");
                aquecedor.ligar();
                status = status2;

            } else {
                System.out.println("Temperatura normal, nenhuma acao necessaria");
                status = "Temperatura dentro do limite, nenhuma acao foi necessaria";
            }

        } catch (LeituraInconsitente e) {
            System.out.println(e.getMessage());
            status = "Falha na leitura do sensor";

        } catch (FalhaNoAtuador e) {
            System.out.println(e.getMessage());
            status = "Falha ao acionar o equipamento";

        } finally {
            System.out.println("Status: " + status);
        }
    }
}