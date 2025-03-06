package ex_01;

public class Jogador {

    String nome;
    int[] pontosRodada = new int[3];

    public int calcularPontos(){

        int totalPontos = 0;

        for(int i=0;i<3;i++) {
            totalPontos += pontosRodada[i];
        }
        return totalPontos;
    };

}
