package EstufaInteligente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura lida pelo sensor: ");
        double temperatura = sc.nextDouble();

        System.out.print("Ventilador esta funcionando? (s) para sim e (n) para nao: ");
        String respostaVentilador = sc.next();
        boolean ventiladorOk = respostaVentilador.equals("s");

        System.out.print("Aquecedor esta funcionando? (s) para sim e (n) para nao: ");
        String respostaAquecedor = sc.next();
        boolean aquecedorOk = respostaAquecedor.equals("s");

        Sensor sensor = new Sensor(temperatura);
        Atuador ventilador = new Atuador("Ventilador", ventiladorOk);
        Atuador aquecedor = new Atuador("Aquecedor", aquecedorOk);

        Estufa estufa = new Estufa(sensor, ventilador, aquecedor);

        System.out.println();
        estufa.monitorar();

        sc.close();
    }
}