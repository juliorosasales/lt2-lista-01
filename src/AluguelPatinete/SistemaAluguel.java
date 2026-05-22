package AluguelPatinete;

public class SistemaAluguel {
    public void alugar(Patinete patinete) throws BateriaFraca, VeiculoOcupado{

        if (patinete.getBateria() < 20) {
            throw new BateriaFraca("Bateria fraca");
        }

        if (patinete.isEmUso()) {
            throw new VeiculoOcupado("Veiculo ocupado");
        }

        patinete.setEmUso(true);
        System.out.println("Patinete destravado");

        iniciarCronometro();
    }

    public void iniciarCronometro() {
        System.out.println("Cronometro iniciado");
    }
}