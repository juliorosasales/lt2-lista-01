package AluguelPatinete;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bateria do patinete em porcentagem: ");
        int bateria = sc.nextInt();

        System.out.print("Patinete esta em uso? (s) para sim e (n) para nao: ");
        String resposta = sc.next();
        boolean emUso = resposta.equals("s");

        Patinete patinete = new Patinete(emUso, bateria);
        SistemaAluguel sistema = new SistemaAluguel();

        System.out.println();

        try {
            sistema.alugar(patinete);
        } catch (BateriaFraca e) {
            System.out.println(e.getMessage());
        } catch (VeiculoOcupado e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}