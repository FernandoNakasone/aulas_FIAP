package ex_01;

import java.util.Scanner;

public class TriScore {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Jogador jogador = new Jogador();

        System.out.print("Digite o nome do jogador:");
        jogador.nome = entrada.nextLine();

        for(int i=0;i<3;i++){
            System.out.print("Digite a pontuação na " + (i+1) + "º rodada:");
            jogador.pontosRodada[i] = entrada.nextInt();
        }

        System.out.println("Jogador:" + jogador.nome + "\t Pontuação final:" + jogador.calcularPontos());

        entrada.close();
    }
}
