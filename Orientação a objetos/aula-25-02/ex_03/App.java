package ex_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat fM = new DecimalFormat("#0.##");

        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        System.out.print("Informe o X do p1:");
        p1.cordenadaX = Integer.valueOf(entrada.nextLine());

        System.out.print("Informe o Y do p1:");
        p1.cordenadaY = Integer.valueOf(entrada.nextLine());

        System.out.print("Informe o X do p2:");
        p2.cordenadaX = Integer.valueOf(entrada.nextLine());

        System.out.print("Informe o Y do p2:");
        p2.cordenadaY = Integer.valueOf(entrada.nextLine());

        System.out.println("Distância do p1 para o p2: " + fM.format(p1.calcularDistancia(p2)));

        System.out.println(" ");

        System.out.println("Distancia do p1 até o ponto de origem: " + fM.format(p1.calcularDistanciaOrigem()));
        System.out.println("Distância do p2 até o ponto de origem: " + fM.format(p2.calcularDistanciaOrigem()));

        System.out.println(" ");
        System.out.println("O ponto mais perto do ponto de origem:" + p1.verificarPontoPerto(p1, p2));
    }
}
