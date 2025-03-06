package ex_02;

public class Aluno {

    int rm;
    String[] disciplinas = new String[3];
    double[][] notas = new double[3][2];

    public double[] calcularMedia(){
        double[] media = new double[3];
        double totalNota;
        for (int i=0;i<3;i++){
            totalNota=0;
            for (int n=0;n<2;n++){
                totalNota+= notas[i][n];
            }
            media[i] = totalNota/2;
        }

        return media;
    }
    public String[] verificaSitu(){
        String[] situacao = new String[3];

        for(int i=0;i<3;i++){
        if (calcularMedia()[i] < 6){
            situacao[i] = "Reprovado";
        } else {
            situacao[i] = "Aprovado";
        }
    }
        return situacao;
    };


}
